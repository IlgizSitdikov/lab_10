package lab_10;

import java.util.ArrayList;

public class ArrayClass extends AnyTypeArray {

    public static <E> void  anyTypeMassive  (String s, E [] arr) {

        E[] a = arr;
        AnyTypeArray<E> sid = new AnyTypeArray<E>();
        sid.setArr(a);

        System.out.print(s + "  ");

        for (int i = 0; i < sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i) + " ");

        System.out.println();
    }



    public static void main(String [] args){

        String [] s = {"Today", "is","a", "good", "day", "!"};
        anyTypeMassive("String:" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8,9,10};
        anyTypeMassive("Integer:" , intr);

        Double [] ad = {2.6,7.8,6.2,1.0};
        anyTypeMassive("Double:" , ad);
    }
}

