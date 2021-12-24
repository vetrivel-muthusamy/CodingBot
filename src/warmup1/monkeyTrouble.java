package warmup1;

public class monkeyTrouble {

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile) {
            return true;
        }
        if(!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

}
