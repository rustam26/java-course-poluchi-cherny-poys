package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCHABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");

//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("abc(e|5)");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("Position: "+matcher.start() +"   " +matcher.group());
        }

    }
}
