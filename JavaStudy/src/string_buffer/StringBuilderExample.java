package string_buffer;

public class StringBuilderExample {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sb = new StringBuilder();

        //문자열 끝에 추가
        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        //index4 위치 뒤에 2삽입
        sb.insert(4, "2");
        System.out.println(sb.toString());

        //index4 위치의 문자를 6으로 변경
        sb.setCharAt(4,'6');
        System.out.println(sb.toString());

        //index6부터 index13 전까지 "Book"문자열로 대치
        sb.replace(6,13,"Book");
        System.out.println(sb.toString());

        //index4부터 index5 전까지 삭제
        sb.delete(4,5);
        System.out.println(sb.toString());

        //문자열에서 주어진 index의 문자 삭제
        sb.deleteCharAt(5);
        System.out.println(sb.toString());

        //총 문자열의 수 얻기
        int length = sb.length();
        System.out.println("총 문자열 길이 : "+sb.length());

        //버퍼에 있는 것을 String 타입으로 리턴
        String result = sb.toString();
        System.out.println(result);

    }
}
