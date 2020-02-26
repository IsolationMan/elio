package test;

public class GitTest {

    public static void main(String[] args) {

        int a=6;
        System.out.println("11111111");
        System.out.println("11111111");
        System.out.println("11111111");

        test(5);
        String test = test();
        System.out.println(test);
        System.out.println(a);

    }

    public static void test(int a){

         a+=10;
        System.out.println(a);
        System.out.println("新增");

    }
    public static String test(){

        String b = "hello";
        return b;

    }



}
