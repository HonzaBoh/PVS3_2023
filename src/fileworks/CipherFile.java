package fileworks;

public class CipherFile {
    final static int SECRET_KEY = 17;


    static String encrypt(int key, String message){
        StringBuilder result = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lowerMessage = message.toLowerCase();
        for (int i = 0; i < message.length(); i++) {
          if (Character.isAlphabetic(lowerMessage.charAt(i))){
              int position = alphabet.indexOf(lowerMessage.charAt(i));
              if (position + key >= alphabet.length()){
                  result.append(alphabet.charAt(position + key - alphabet.length()));
              } else {
                result.append(alphabet.charAt(position + key));
              }
          }else {
              result.append(lowerMessage.charAt(i));
          }
        }
        return result.toString();
    }

    static String decrypt(int key, String message){
        return encrypt(26 - key, message);
    }


    public static void main(String[] args) {
//        String test = "abc";
//        String encrypted = encrypt(3, test);
//        System.out.println(test + " Encrypted: " + encrypted);
//        System.out.println(encrypted + " Decrypted: " + decrypt(3, encrypted));
//        String test2 = "xyz";
//        System.out.println(encrypt(4, test2));
//        System.out.println(decrypt(4, encrypt(4, test2)));
        String importantMessage = "very secret message";
        String secretMessage = encrypt(SECRET_KEY, importantMessage);

        System.out.println(secretMessage);
        for (int i = 1; i <= 26; i++) {
            System.out.println("key " + i + ": " + decrypt(i, secretMessage));
        }
    }
}
