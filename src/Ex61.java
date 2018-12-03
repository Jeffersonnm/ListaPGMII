
public class Ex61 {

    public Ex61() {
        String str = "";
        String[] str1 = new String[2];
        for (double i = -10; i < 10; i += 0.0001) {
            str = String.valueOf(f(i));
            if (str.substring(0, 4).contains("0.00")) {
                if (str1[0] == null) {
                    str1[0] = String.valueOf(i).substring(0, 6);
                } else {
                    str1[1] = String.valueOf(i).substring(0, 6);
                }
            }
        }
        System.out.println(str1[0] + "\n" + str1[1]);
    }

    double f(double x) {
        return -3 * Math.pow(x, 2) - 4 * x + 1;
    }

}
