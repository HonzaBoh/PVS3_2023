package exams.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Logins {
    static List<String> usernames;
    static List<String> passwords;
    static boolean isInFile(String line){
        String[] parts = line.split(";");
        return usernames.contains(parts[0]) &&
                usernames.indexOf(parts[0]) == passwords.indexOf(parts[1]);
    }
    public static void main(String[] args) {
        try {
            usernames = Files.readAllLines(Paths.get("resources\\logins\\usernames.txt"));
            passwords = Files.readAllLines(Paths.get("resources\\logins\\passwords.txt"));
            PrintWriter validWriter = new PrintWriter(new BufferedWriter(new FileWriter("resources\\logins\\validLogins.txt")));

            for (int i = 0; i < 4; i++) {
                List<String> lines = Files.readAllLines(Paths.get("resources\\logins\\loginAttempts"+(i+1)+".txt"));
                for(String line : lines){
                    if (isInFile(line)){
                        validWriter.println(line);
                    }
                }
            }
            validWriter.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
