package r_expression_pattern;

import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String regExp = "(02|010|032)-\\d{3,4}-\\d{4}+[abc]";
        String data = "032-1234-5678a";
        boolean result = Pattern.matches(regExp,data);
        if(result){
            System.out.println("정규식과 일치.");
        }else{
            System.out.println("정규식과 일치하지 않음.");
        }


        regExp = "\\w+@\\w+\\.+\\w+(\\.\\+)?";
        data = "dydwlsdlz@navercom";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치.");
        }else{
            System.out.println("정규식과 일치하지 않음.");
        }

    }
}
