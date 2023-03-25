import java.text.DecimalFormat;
import java.util.Scanner;

public class currencyconvert {
    public static void main(String[] args) {
        double rupee, dollar, pound, code, euro, KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "*** WELCOME TO CURRENCY CONVERTER ***\n Enter the CURRENCY code \n1:RUPEE\n2:DOLLAR\n3:POUND\n4:EURO\n5:KWD");
        code = sc.nextInt();
        if (code == 1) 
  {
            System.out.println("enter amount in rupees");
            rupee = sc.nextDouble();
            dollar = rupee / 77.34;
            System.out.println("DOLLAR  : " + f.format(dollar));
            pound = rupee / 94.46;
            System.out.println("POUND  : " + f.format(pound));
            euro = rupee / 80.36;
            System.out.println("EURO  :  " + f.format(euro));
            KWD = rupee / 251.92;
            System.out.println("KWD :  " + f.format(KWD));
               }
         else if (code == 2)
          
    {
            System.out.println("enter amount in dollar");
            dollar = sc.nextDouble();
            rupee = dollar * 77.34;
            System.out.println("RUPEE : " + f.format(rupee));
            pound = dollar * 0.82;
            System.out.println("POUND  : " + f.format(pound));
            euro = dollar * 0.96;
            System.out.println("EURO :  " + f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("KWD :  " + f.format(KWD));
        } 
        
        else if (code == 3)

        {
            System.out.println("enter amount in pound");
            pound = sc.nextDouble();
            rupee = pound * 94.43;
            System.out.println("RUPEE  : " + f.format(rupee));
            dollar = pound * 1.22;
            System.out.println("DOLLAR  : " + f.format(dollar));
            euro = pound * 1.17;
            System.out.println("EURO  :  " + f.format(euro));
            KWD = pound * 0.3748;
            System.out.println("KWD :  " + f.format(KWD));
        }

        else if (code == 4)
        
        {
            System.out.println("enter amount in euro");
            euro = sc.nextDouble();
            rupee = euro * 80.43;
            System.out.println("RUPEE  : " + f.format(rupee));
            dollar = euro * 1.04;
            System.out.println("DOLLAR  : " + f.format(dollar));
            pound = euro * 0.85;
            System.out.println("POUND  :  " + f.format(pound));
            KWD = euro * 0.318949;
            System.out.println("KWD :  " + f.format(KWD));
        }

        else if (code == 5)

        {
            System.out.println("enter amount in KWD");
            KWD = sc.nextDouble();
            rupee = KWD * 251.96;
            System.out.println("RUPEE : " + f.format(rupee));
            dollar = KWD * 3.26;
            System.out.println("DOLLAR  : " + f.format(dollar));
            pound = KWD * 2.67;
            System.out.println("POUND  :  " + f.format(pound));
            euro = KWD * 3.13;
            System.out.println("EURO :  " + f.format(euro));
        }
        
        else
            System.out.println("INVALID CODE");

    }

}
