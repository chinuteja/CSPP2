import java.util.Scanner;
import java.io.File;
class SubString1 {
    String str1 = "";
    String str2 = "";
    double res;
    SubString1() {
    }
    public double plagerism(File f1, File f2) {
        try {
            Scanner scan = new Scanner(f1);
            while (scan.hasNext()) {
                str1 += scan.nextLine();
            }
            scan = new Scanner(f2);
            while (scan.hasNext()) {
                str2 += scan.nextLine();
            }
            String longsub = "";
            for (int i = 0; i < str2.length(); i++) {
                for (int j = i + 1; j <= str2.length(); j++) {
                    if (str1.contains(str2.substring(i, j))) {
                        if (str2.substring(i, j).length() > longsub.length()) {
                            longsub = str2.substring(i, j);
                        }
                    }
                }
            }
            if (f1.getName().equals(f2.getName())) {
                res = 100;

                // System.out.print("\t\t");
            } else {
                double num = longsub.length() * 2 * 100;
                double den = str1.length() + str2.length();
                res = Math.round(num / den);


            }
            System.out.format("%13.1f", res);

        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
        return res;

    }

}