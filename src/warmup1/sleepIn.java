package warmup1;

public class sleepIn {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(true, true));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;

    }
}
