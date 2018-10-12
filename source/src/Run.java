import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int[] abcd = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình bậc 2 ax^2+bx+c=d");
        for (int i = 1; i <= 4; ) {
            System.out.println("nhập số hạng thứ: " + i);
            if (checkAndParste(sc.nextLine(), abcd, (i - 1))) {
                i++;
            } else {
                System.out.println("không hợp lệ");
            }
        }
        cal(abcd);


    }

    static boolean checkAndParste(String i, int[] array, int index) {
        if (i.matches("^[0-9]*$")) {
            array[index] = Integer.parseInt(i);
            return true;
        }
        return false;
    }

    static void cal(int[] arr) {
        String[] array = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                array[i] = ("-" + String.valueOf(arr[i]));
            } else {
                array[i] = ("+" + String.valueOf(arr[i]));
            }
        }
        System.out.println("phương trình có dạng: " + array[0] + "x^2 " + array[1] + "x " + array[2] + "= " + array[3]);

        int a = arr[0];
        int b = arr[1];
        int c = arr[2] - arr[3];

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("phương trình nhận nghiệm kép: x=" + (-b) / (2 * a));
        } else {
            System.out.println("phương trình có hai nghiệm");
            System.out.println("x1 =" + (-b - Math.sqrt(delta) / (2 * a)));
            System.out.println("x2 =" + (-b + Math.sqrt(delta) / (2 * a)));
        }

    }
}