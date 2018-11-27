package exeptions;
//throws InterruptedException
public class verfiedExeptionText {
    public static void main(String[] args){
        try {
            Thread.sleep(2000);
            //throw new InterruptedException();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
