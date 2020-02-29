package home_tasks;

import myFolder.Main;

public class Repl212_2DArray {
    public static  double convertC(String[][] money,String[][] convertionRate)
    {
        double totalMoney=0.0;
        for(int i=0; i<money.length;i++){
            totalMoney+=Double.parseDouble(money[i][1])*Double.parseDouble(convertionRate[i][1]);
        }
        return totalMoney;


    }

    public static void main(String[] args)
    {



        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

     //   double res = Main.convertC(test_money,test_convert);
      //  System.out.print(res);

    }


}

