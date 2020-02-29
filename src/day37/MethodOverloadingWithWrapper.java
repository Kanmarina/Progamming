package day37;



public class MethodOverloadingWithWrapper {
    public static void main(String[] args) {

        printNum(100);
        printNum(Integer.valueOf(100));
    }

    public static void printNum(int x) {
        System.out.println("printing primitive x = " + x);
    }

    public static void printNum(Integer x) {
        System.out.println("printing Integer Object x = " + x);
/*
        //        lst.remove(3);
//        System.out.println("lst after removing index 3 item = " + lst);
//        lst.remove(2);
         lst;
        lst.remove(2);
        // I want to remove item by it's value rather than index
        //       lst.remove( new Integer(2)  );
        lst.remove(Integer.valueOf(2));
        //lst.remove( new Integer(2)  );

        // if you try to delete an item that does not exist by value
        // IT WILL DO NOTHING
        lst.remove(Integer.valueOf(112));

        // if you try to delete using the index list don't have
        // IT WILL throw IndexOutOfBoundsException
        //lst.remove(112);
        System.out.println("lst = " + lst);*/
    }
}