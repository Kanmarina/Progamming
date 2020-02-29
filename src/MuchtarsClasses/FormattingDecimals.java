package MuchtarsClasses;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {
        DecimalFormat format= new DecimalFormat("0.000");

        double b = 23.1234567889;
        //format method: format (double):formats the decimals and return String value
        String num1=  format.format(b);
        System.out.println(num1); //23.123

        double c = 45.56789;
        System.out.println(format.format(c));
        c=Double.parseDouble(format.format(c));

    }
}
