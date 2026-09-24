package currency;
import java.util.*;
import java.text.DecimalFormat;
Class CurrencyConvertor
{
    double rupee,dollar,euro,yen;
    Scanner sc = new Scanner(System.in);
    DecimalFormat f = new DecimalFormat("##.###");
    public convertInrToEuro()
    {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        euro = rupee / 80;
        System.out.println("Euro : "+f.format(euro));
    }

    public convertEuroToInr()
    {
        System.out.println("Enter amount in Euro");
        euro = sc.nextFloat();
        rupee = euro * 80;
        System.out.println("Rupees : "+f.format(rupee));
    }
    public convertInrToDollar()
    {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        dollar = rupee / 66;
        System.out.println("Dollar : "+f.format(dollar));
    }
    public convertDollarToInr()
    {
        System.out.println("Enter amount in Dollar");
        dollar = sc.nextFloat();
        rupee = dollar * 66;
        System.out.println("Rupees : "+f.format(rupee))
    }
    public convertInrToYen()
    {
        System.out.println("Enter amount in rupees");
        rupee = sc.nextFloat();
        yen = rupee / 0.61;
        System.out.println("Yen : "+f.format(yen));
    }
    public convertYenToInr()
    {
        System.out.println("Enter amount in Yen");
        euro = sc.nextFloat();
        rupee = yen * 0.61;
        System.out.println("Rupees : "+f.format(rupee));
    }
} 

Output:
===== CONVERTOR =====
1. Currency
2. Distance
3. Time
Enter your choice: 1

Currency Converter
1. INR to Dollar
2. Dollar to INR
3. INR to Euro
4. Euro to INR
5. INR to Yen
6. Yen to INR
Enter option: 1

Enter Rupees: 6600
Dollar = 100.0
