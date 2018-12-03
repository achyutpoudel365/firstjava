package com.company;

import java.util.Scanner;

public class mainSwitchCase {
    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Question number::");
        int qno = scanner.nextInt();
        switch (qno){

            case 1:
                System.out.println("Q1) Write a java program to find maximum between two numbers.");
                System.out.println("Enter first number::");
                a = scanner.nextInt();
                System.out.println("Enter second number::");
                int b = scanner.nextInt();
                int maximum = maxxx(a, b);
                System.out.println("Greater number is:: "+maximum);
                break;

            case 2:
                System.out.println("Q2) Write a java program to find maximum between three numbers.");
                System.out.println("Enter first number::");
                a = scanner.nextInt();
                System.out.println("Enter second number::");
                b = scanner.nextInt();
                System.out.println("Enter third number::");
                int c = scanner.nextInt();

                int maxvals = maxValue(a, b, c);
                System.out.println("maximum number is::"+maxvals);

                break;

            case 3:
                System.out.println("Q3) Write a java program to check whether a number is negative, positive or zero.");
                System.out.println("Enter a number::");
                int x = scanner.nextInt();
                negposzer(x);

                break;

            case 4:
                System.out.println("Q4) Write a java program to check whether a number is divisible by 5 and 11 or not.");
                System.out.println("Enter a number:::");
                 a = scanner.nextInt();
                 divelevfive(a);
                 break;

            case 5:
                System.out.println("Q5) Write a java program to check whether a number is even or odd.");
                System.out.println("Enter a number:::");
                a = scanner.nextInt();
                evenorodd(a);
                break;

            case 6:
                System.out.println("Q6) Write a java program to check whether a year is leap year or not.");
                System.out.println("Enter Year:- ");
                int yr = scanner.nextInt();
                    leap(yr);

                break;
            case 7:
                System.out.println("Q7) Write a java program to check whether a character is alphabet or not.");
                System.out.println("Enter the Character");
                char xz = scanner.next().charAt(0);
                boolean result = charoralpha(xz);
                if (result){
                    System.out.println("Thiis is a character");
                }
                else {
                    System.out.println("This is not a character");
                }
                break;

            case 8:
                System.out.println("Q8) Write a java program to input any alphabet and check whether it is vowel or consonant.");
                System.out.println("Enter an alphabet  ");
                char cz = scanner.next().charAt(0);
                CHARACTRE(cz);
                break;

            case 9:
                System.out.println("Q9) Write a java program to input any character and check whether it is alphabet, digit or special character.");
                System.out.println("Enter a character");
                char cxz = scanner.next().charAt(0);
                alphadigspchar(cxz);

                break;

            case 10:
                System.out.println("Q10) Write a java program to check whether a character is uppercase or lowercase alphabet.");
                System.out.println("Enter any Alphabet:");
                char ca  = scanner.next().charAt(0);

                lowupper(ca);
                break;

            case 11:
                System.out.println("Q11) Write a java program to input week number and print week day.");
                System.out.println("Enter the number of weeks: ");
                int wn = scanner.nextInt();
                wntowd(wn);
                break;

            case 12:
                System.out.println("Q12) Write a java program to input month number and print number of days in that month.");
                System.out.println("Enter the number of months: " );
                int mn = scanner.nextInt();
                mnotomday(mn);

                break;

            case 13:
                System.out.println("Q13) Write a java program to count total number of notes in given amount.");
                System.out.println("Enter the value of Amount: ");
                int amount = scanner.nextInt();
                totalAmount(amount);

                break;

            case 14:
                System.out.println("Q14) Write a java program to input angles of a triangle and check whether triangle is valid or not.");
                System.out.println("Enter the three values of angles :  ");
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                int C = scanner.nextInt();

                tranangle(A, B, C);
                break;

            case 15:
                System.out.println("Write a java program to input all sides of a triangle and check whether triangle is valid or not.");
                System.out.println("Enter three lengths of sides AB, BC & AC of a triangle ABC :: ");
                int AB = scanner.nextInt();
                int BC = scanner.nextInt();
                int AC = scanner.nextInt();

                transide(AB, BC, AC);


                break;

            case 16:
                System.out.println("Write a java program to check whether the triangle is equilateral, isosceles or scalene triangle.");
                System.out.println("Enter three lengths of sides of a triangle ABC :: ");
                 AB = scanner.nextInt();
                 BC = scanner.nextInt();
                 AC = scanner.nextInt();

                 sizatran(AB, BC, AC);

                break;

            case 17:

                System.out.println("Write a java program to find all roots of a quadratic equation.");
                System.out.println("Enter any value of a, b & c of qudratic equation a*x*x + b*x + c :: ");
                double aa = scanner.nextDouble();
                double bb = scanner.nextDouble();
                double cc = scanner.nextDouble();

                quadratixroots(aa, bb, cc);

                break;

            case 18:
                System.out.println("Write a java program to calculate profit or loss.");
                System.out.println("Enter the Cost Prize and Selling Prize::");
                double CP = scanner.nextDouble();
                double SP = scanner.nextDouble();

                profitandloss(CP, SP);


                break;

            case 19:
                System.out.println("Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:\n" +
                        "> Percentage >= 90% : Grade A\n" +
                        ">Percentage >= 80% : Grade B\n" +
                        ">ercentage >= 70% : Grade C\n" +
                        ">Percentage >= 60% : Grade D\n" +
                        ">Percentage >= 40% : Grade E\n" +
                        ">Percentage < 40% : Grade F");

                System.out.println("Enter the Marks of Physics::  ");
                int Phy = scanner.nextInt();
                System.out.println("Enter the Marks of Chemistry::  ");
                int Chem = scanner.nextInt();
                System.out.println("Enter the Marks of Biology::  ");
                int Bio = scanner.nextInt();
                System.out.println("Enter the Marks of Mathematics::  ");
                int Mathem = scanner.nextInt();
                System.out.println("Enter the Marks of Computer::  ");
                int Comp = scanner.nextInt();

                grandtotalandgrade(Phy, Chem, Bio, Mathem, Comp);

                break;

            case 20:
                System.out.println("Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition:\n" +
                        ">For first 50 units Rs. 0.50/unit\n" +
                        ">For next 100 units Rs. 0.75/unit\n" +
                        ">For next 100 units Rs. 1.20/unit\n" +
                        ">For unit above 250 Rs. 1.50/unit\n" +
                        ">An additional surcharge of 20% is added to the bill");

                System.out.println("Enter the total unit of Electricity::");
                int Eunit = scanner.nextInt();

                BILLPAY(Eunit);
                break;
                default:
                    System.out.println("Please! Enter Valid Question Number");
        }
    }

    private static void BILLPAY(int Eunit) {
        double billpay=0, billpay2=0;
        if (Eunit<=50){
            billpay= Eunit*0.50;
            billpay2 = billpay + (billpay*20)/100;
        }
        else if (Eunit<=150){
            billpay= (50*0.50) + (Eunit-50)*0.75;
            billpay2 = billpay + (billpay*20)/100;
        }
        else if (Eunit<=250){
            billpay = (50*0.50)+(100*0.75)+(Eunit-150)*1.20;
            billpay2 = billpay + (billpay*20)/100;
        }
        else if (Eunit>250){
            billpay = (50*0.50)+(100*0.75)+(100*1.20)+(Eunit-250)*1.50;
            billpay2 = billpay + (billpay*20)/100;

        }
        System.out.println("Bill amount to pay::"+billpay2);
    }

    private static void grandtotalandgrade(int phy, int chem, int bio, int mathem, int comp) {
        int total = phy+chem+bio+mathem+chem;
        int percentage = total/5;

        if (percentage>=90){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE A");
        }
        else if (percentage>=80){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE B");
        }
        else if (percentage>=70){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE C");
        }
        else if (percentage>=60){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE D");
        }
        else if (percentage>=40){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE E");
        }
        else if (percentage<40){
            System.out.println("your percentage is:: "+percentage + "% "+"GRADE F");
        }
    }

    private static void profitandloss(double CP, double SP) {
        if (CP<0){
            System.out.println("CP can't be negative");
        }
        else if (SP<0){
            System.out.println("SP can't be negative");
        }
        else if (CP<SP){
            double profit = SP-CP;
            System.out.format("total profit is Rs ::%.2f ",profit);
        }
        else if (CP>SP){
            double loss = CP-SP;
            System.out.format("Total loss is Rs::%.2f ",loss);
        }
        else{
            if (CP==0){
                System.out.println("no goods are bought as well as no goods are sold");
            }

            else {
                System.out.println("there are no profit as well as no loss");
            }

        }
    }

    private static void quadratixroots(double aa, double bb, double cc) {
        double rone, rtwo;
        double det = (bb*bb)-(4*aa*cc);
        if (det>0){
            rone = (-bb + Math.sqrt(det))/(2*aa);
            rtwo = (-bb - Math.sqrt(det))/(2*aa);
            System.out.format("root_1 = %.2f and root_2 = %.2f", rone , rtwo);
        }
        else if (det==0){
            rone = rtwo = -bb/(2*aa);
            System.out.format("root_1 = root_2 = %.2f", rone);
        }
        else {
            double realPart = -bb/(2*aa);
            double imaginaryPart = Math.sqrt(-det)/(2*aa);
            System.out.format("root_1 = %.2f+%.2fi and root_2 = %.2f-%.2fi   ",realPart,imaginaryPart,realPart,imaginaryPart);
        }
    }

    private static void sizatran(int AB, int BC, int AC) {

        if (AB+BC>AC || AB+AC>BC || BC+AC>AB){
            if (AB==BC && AB==AC){
                System.out.println("Triangle is Equilateral");
            }
            else if (AB==BC || AB==AC || BC==AC){
                System.out.println("Triangle is isoceles ");
            }
            else{
                System.out.println("Triangle is scalene");
            }
        }
        else{
            System.out.println("Triangle does not exist ");
        }
    }

    private static void transide(int AB, int BC, int AC) {

        if (AB+BC>AC || AB+AC>BC || BC+AC>AB){
            System.out.println("Triangle is Valid for AB = "+AB +", "+"BC = "+BC +" & " + " AC = " +AC);
        }
        else{
            System.out.println("Triangle is not Valid for AB = "+AB +", "+"BC = "+BC +" & " + " AC = " +AC);
        }
    }

    private static void tranangle(int a, int b, int c) {
        if (a+b+c==180){
            System.out.println("Triangle is valid for angles:: " + a + " " + b + " & " +c);
        }
        else {
            System.out.println("Triangle is not valid for angles:: " + a + " " + b + " & " +c);
        }
    }

    private static void mnotomday(int mn) {
        int md = mn*30;
        System.out.println("there are " + md + " days in " +mn + " months ");
    }

    private static void wntowd(int wn) {

        int wd = wn*7;
        System.out.println("The number of days in " +wn+ " weeks is " +wd);

    }

    private static void lowupper(char ca) {
        if (ca>=97 && ca<=122){
            System.out.println(ca+ " is a lowercase alphabet");
        }
        else if (ca>=65 && ca<=90){
            System.out.println(ca+ " is an uppercase alphabet");
        }
        else {
            System.out.println("The input is not an alphabet");
        }
    }

    private static void alphadigspchar(char cxz) {
        if ((cxz >= 65 && cxz <= 90)|| (cxz >= 97 && cxz <= 122)){
            System.out.println ( cxz+ " is an Alphabet ");
        }
        else if (cxz >= 48 && cxz <= 57){
            System.out.println(cxz+ " is a Digit ");
        }
        else{
            System.out.println (cxz+ " is a Special Character ");
        }
    }

    private static int CHARACTRE(char cz) {
        if((cz=='a'|| cz=='e' ||cz=='i'||cz=='o'||cz=='u') || (cz=='A'||cz=='E'||cz=='I'||cz=='O'||cz=='U')){
            System.out.println("the alphabet "+ cz + " is vowel..");
        }
        else
            System.out.println("the alphabet " + cz + " is consonant..");
        return (cz);
    }

    private static boolean charoralpha(char xz) {
//        char czzz = '#';
        if( (xz>='a'&&xz<='z') || (xz>='A'&& xz<='Z') ){
//            System.out.println(czzz + " is an Alphabet");
            return true;
        }
        return false;
    }

    private static int totalAmount(int amount) {
        int n_thousand = 0, n_fivehundred = 0, n_hundred = 0, n_fifty = 0, n_twenty = 0, n_ten = 0, n_five = 0, n_two = 0, n_one = 0;
        int money = amount;
        if (amount<=0){
            System.out.println("there is no number of notes in zero or less Rupees:");
        }
        else {

            if(amount >= 1000) {
                n_thousand = amount/1000;
                amount = amount-1000*n_thousand;
            }

            if (amount>=500){
                n_fivehundred = amount/500;
                amount = amount-500*n_fivehundred;

            }
            if (amount>=100){
                n_hundred = amount/100;
                amount = amount - 100*n_hundred;
            }
            if (amount>=50){
                n_fifty = amount/50;
                amount = amount - 50*n_fifty;
            }
            if (amount>=20){
                n_twenty = amount/20;
                amount = amount-20*n_twenty;
            }
            if (amount>=10){
                n_ten = amount/10;
                amount = amount-10*n_ten;
            }
            if (amount>=5){
                n_five = amount/5;
                amount = amount-n_five*5;
            }
            if (amount>=2){
                n_two = amount/2;
                amount = amount-2*n_two;
            }
            if (amount>=1){
                n_one = amount;
                amount = amount-n_one;
            }

            if (amount==0){
                int total = n_thousand + n_fivehundred + n_hundred + n_fifty + n_twenty + n_ten + n_five + n_two + n_one;
                System.out.println("Total number of notes in "+ money +" is " + total);
            }


        }
        return (amount);
    }

    private static int leap(int yr) {

        if (yr%4==0){
            if (yr%100==0){
                if (yr%400==0){
                    System.out.println(yr+" is a leap year");
                }
                else {
                    System.out.println(yr+" is not a leap year");
                }
            }
            else {
                System.out.println(yr+" is a leap year");
            }
        }
        else {
            System.out.println(yr+" is not a leap year");
        }
            return (yr);
    }

    private static int divelevfive(int a) {
        if (a %5 ==0){
            if(a%11==0){
                System.out.println(a+"  is divisible by five and eleven");
            }
        }
        else {
            System.out.println(a+"  isn't divisible by five and eleven both");
        }
        return (a);
    }

    private static int negposzer(int x) {
        if (x>0){
            System.out.println(x+"  is the positive number");
        }
        else if (x<0){
            System.out.println(x+"  is the negative number");
        }
        else {
            System.out.println(x+"  it  is  zero  itself..");
        }

        return (x);
    }

    private static int maxValue(int a, int b, int c) {
        return (a>b)?((a>c)?a:c):((b>c)?b:c);
    }

    private static int maxxx(int a, int b) {

        return (a>b)?a:b;
    }

    private static int evenorodd(int a) {
        if (a%2==0){
            System.out.println(a+" is an Even number");
        }
        else {
            System.out.println(a+" is an odd number");
        }
        return (a);
    }

}