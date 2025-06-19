import java.util.Scanner;

public class BasicJava {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Type Conversion 
        int a=25;//int to long is posible 
        long b=a;
        //long a=25;//but long to int is not allowed in java
        //int b=a;
        System.out.println(b);
    //int number=sc.nextFloat();//Type mismatch: cannot convert from float to int
        float number=sc.nextInt();
        System.out.println(number);
        //type casting
        float marks=99.999f;
        int marks2=(int)marks;//loss of 0.999
        System.out.println(marks2);

        char ch='a';
        char ch2='b';
        int num=ch;
        int num2=ch2;
        System.out.println(num);
        System.out.println(num2);
        //type promotion 
        char k='k';
        char m='m';
        System.out.println((int)(m));
        System.out.println((int)(k));
        System.out.println(m-k);
        System.out.println(a);//normal print variable

        //wrong
        byte n=5;
        //n=n*2;//Type mismatch: cannot convert from int to byte
        //right
        n=(byte)(n*2);//type cast
        System.out.println(n);

    }
}