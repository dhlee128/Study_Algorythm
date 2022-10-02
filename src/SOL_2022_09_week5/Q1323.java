package SOL_2022_09_week5;

//1323. Maximum 69 Number
public class Q1323 {

    public static int maximum69Number (int num) {

        String str = String.valueOf(num);

        return Integer.parseInt(str.replaceFirst("6","9"));
    }

    public static void main(String[] args) {
        int num = 9999;
        System.out.println(maximum69Number(num));
    }
}
