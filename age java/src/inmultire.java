public class inmultire {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            if (i==4){
                System.out.print("------");
            }
            for (int j=1; j<10; j++){
                System.out.println(i +"x" + j + "=" + i*j);
                if(i ==4){
                    System.out.print("--------");
                }
            }
        }
    }
}
