package array;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/3/16 12:06
 */
public class ArrayDemo {

    private static void printArgs(String... args) {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        printArgs();
        printArgs("one");
        printArgs("one", "two");
    }
}
