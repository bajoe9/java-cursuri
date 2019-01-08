import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {
    public static void main(String[] args) {
         String regex = "(0[237]\\d{2})\\d{6}";
         //trebuie 2 backslash petru ca, alfel cred ca este intrun sir si vrei sa iesi

         String text = "Numarele mele sunt 0789322206, 0789322207, 0789322202,";

        //System.out.println(text.contains(regex)); asta nu va merege asa ca trebuie sa foloseti

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //System.out.println(matcher.find());
            while(matcher.find()){
              System.out.println(matcher.group(1));
            }

        System.out.println(text.replaceAll(regex, "\\1*"));
    }
}
