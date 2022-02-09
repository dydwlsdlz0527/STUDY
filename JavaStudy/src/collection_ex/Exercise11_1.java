package collection_ex;

import java.util.ArrayList;

//교집합, 차집합, 합집합 구하기
public class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> kyo = new ArrayList<>();
        ArrayList<Integer> cha = new ArrayList<>();
        ArrayList<Integer> hap = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> temp = null;
        temp = (ArrayList<Integer>)list1.clone();

        if(temp.retainAll(list2)){
            kyo = temp;
            temp = list1;
        }
        if(temp.removeAll(list2)) {
            cha = temp;
            temp = (ArrayList<Integer>)cha.clone();
        }
        if(temp.addAll(list2)){
            hap = temp;
        }
        System.out.println("list1 = "+list1);
        System.out.println("list2 = "+list2);
        System.out.println("kyo = "+kyo);
        System.out.println("cha = "+cha);
        System.out.println("hap = "+hap);
    }
}
