package exceptional;

public class Practice {

    static void dramaticPause(int millis) throws InterruptedException{
        Thread.sleep(millis);
    }

    static double divide(int a, String b) {
        System.out.println(a + "/" + b + " ....");
        int result = 0;
        try {
            dramaticPause(500);
            int[] sneaky = {0};
            if (b == null)
                System.out.println(sneaky[5]);
            int bNumber = Integer.parseInt(b);
            System.out.println(b.length());
            result =  a / bNumber;
        }
        catch (InterruptedException e){
            System.out.println(":(");
        } catch (ArithmeticException e){
            System.out.println("Ne deleni nulou...");
        } catch (NumberFormatException e){
            System.out.println("No way...noway");
        } catch (NullPointerException e){
            System.out.println("Kdyz nejde delit nulou, ani nullem to nepujde");
        }
        catch (Exception e){
            System.out.println("Something terrible has happened: " + e.getMessage());
//            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args)  {
        System.out.println(divide(10,"3"));
        System.out.println(divide(5,"0"));
        System.out.println(divide(5,"noway"));
        System.out.println(divide(5,null));

        System.out.println("Happy ending");
    }

}
