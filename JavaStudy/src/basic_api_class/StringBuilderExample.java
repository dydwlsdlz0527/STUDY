package basic_api_class;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 100 ; i++) {
            str += i;
        }
        System.out.println(str);
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100 ; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);

    }
}
