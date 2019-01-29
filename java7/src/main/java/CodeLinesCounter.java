import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeLinesCounter {
    public static void main(String[] args) throws IOException {
        String file = "src/main/java/Code.java";
        BufferedReader reader =
                new BufferedReader(new FileReader(file));

        String line;
        boolean comment = false;
        int codeLines =0;
        while((line = reader.readLine())!= null) {
            if (comment && line.indexOf("*/")>= 0) {
                comment = false;
            }
            if(!line.matches("[ ]* //.*")){
                codeLines++;
            }else if (line.matches("/\\*[ ]*[^*/ ]+.*")) {
                codeLines++;
            }else if (line.indexOf("/*")== -1){
                codeLines++;
            }else {
                comment= true;
            }

        }
        System.out.println(codeLines);
    }
}
