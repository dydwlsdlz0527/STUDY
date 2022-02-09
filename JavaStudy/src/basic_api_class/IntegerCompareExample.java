package basic_api_class;

public class IntegerCompareExample {

    public static void main(String[] args) {
        Integer ob1 = 100;
        Integer ob2 = 100;
        Integer ob3 = 300;
        Integer ob4 = 300;


        System.out.println(ob1==ob2);
        System.out.println(ob3.intValue()==ob4.intValue());

    }
}
