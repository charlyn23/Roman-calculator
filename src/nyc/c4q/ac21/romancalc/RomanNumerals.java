/**
 * Created by Tasha and Charlyn on 3/8/15.
 */
import java.util.Scanner;
public class Parse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        String romanNum = "";



        

        romanNum.trim();

        for (int i = 0; i < romanNum.length(); i++) {
            if (romanNum.charAt(i) == 'm')
                total = total + 1000;
            else if (romanNum.charAt(i) == 'd')
                total = total + 500;
            else if (romanNum.charAt(i) == 'c')
                total = total + 100;
            else if (romanNum.charAt(i) == 'l')
                total = total + 50;
            else if (romanNum.charAt(i) == 'x')
                total = total + 10;
            else if (romanNum.charAt(i) == 'v')
                total = total + 5;
            else if (romanNum.charAt(i) == 'i')
                total = total + 1;
            else
                break;
        }

        if (romanNum.indexOf("cm") > -1)
            total = total - 200;
        if (romanNum.indexOf("cd") > -1)
            total = total - 200;
        if (romanNum.indexOf("xc") > -1)
            total = total - 20;
        if (romanNum.indexOf("xl") > -1)
            total = total - 20;
        if (romanNum.indexOf("ix") > -1)
            total = total - 2;
        if (romanNum.indexOf("iv") > -1)
            total = total - 2;

        return total;
    }
}

