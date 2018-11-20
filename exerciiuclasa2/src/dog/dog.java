package dog;

public class dog {
    int size;
    public  void  bark(int times){
        for (int i=0; i<times;i++){
         if (size > 60){
             System.out.println("woof!");
         }
         else if (size > 14){
             System.out.println("ruff!");
         }
         else{
             System.out.println("yip!");
         }
    }

}}
