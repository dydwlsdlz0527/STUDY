package basic_api_class;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";
        //split() 메소드 이용
        String[] str1 = str.split(",");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        System.out.println();

        StringTokenizer stringTokenizer = new StringTokenizer(str,",");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}

