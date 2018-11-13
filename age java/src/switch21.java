import java.util.Scanner;

public class switch21 {
    public static void main(String [] args){

        int  state = 0;
                if(state == 0){
                    System.out.println("descarcata");
                }
                else if (state == 1){
                    System.out.println("incarcare partiala");
                }
                else if (state == 2){
                    System.out.println("incarcare completa");
                }





                switch (state) {
                    case 0:
                        System.out.println("desscarcata");
                        break;
                    case 1:
                        System.out.println("incarcare partiala");
                        break;
                    case 2:
                        System.out.println("incarcare completa");
                        break;
                    default:
                        System.out.println("eroare");
                }

                            int ora;

                            Scanner reader = new Scanner(System.in);
                            ora = reader.nextInt();

                            String mesaj;

                            if (ora < 12){
                                mesaj = "neata";}
                                else{
                                    mesaj = "salut";
                            }

                            mesaj = (ora > 12) ? "neata":"salut";
                                System.out.println("mesaj");









    }
}
