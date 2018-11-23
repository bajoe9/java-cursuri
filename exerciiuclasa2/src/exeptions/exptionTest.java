package exeptions;
//erororle sunt numite exceptii
public class exptionTest {
    public static void main(String[] args) {
        int y =10;
        try {
            //codul care se exe si poate genera eceptia
           // System.out.println(1/0);
            int x= 1/0;
            y++;
            //Exception
            //RuntimeException
            //ArrayStoreException
        } catch (ArithmeticException e){
            System.out.println("operatiune imposibila");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Eroare de executie");
        }

        System.out.println(y);

    }
}
