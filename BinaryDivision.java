package binaryDivision;

import java.io.*;

public class BinaryDivision {
static String b_dividend, b_divisor, b_remainder, b_quotient; // in the binary form
static int d_dividend, d_divisor, d_remainder, d_quotient; // in the decimal form.

public static void main(String[] args) {
try {

//BufferedReader class is used to take the input from user.
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the binary value of your dividend:");
b_dividend = br.readLine();

//The entered binary number is changed into decimal.
d_dividend = Integer.parseInt(b_dividend, 2);

System.out.println("Enter the binary value of your divisor:");
b_divisor = br.readLine();

//The entered binary number is changed into decimal.
d_divisor = Integer.parseInt(b_divisor, 2);

//The dividend in the decimal form is printed.
System.out.println("d_dividend = " + d_dividend);

//The divisor in the decimal form is printed.
System.out.println("d_divisor = " + d_divisor);

//Remainder is calculated in decimal form.
d_remainder = d_dividend % d_divisor;

//The remainder is printed in decimal form.
System.out.println("d_remainder = " + d_remainder);

//quotient is calculated in decimal form.
d_quotient = d_dividend / d_divisor;


//quotient is printed in decimal form.
System.out.println("d_quotient = " + d_quotient);

//Remainder is converted into binary from decimal.
b_remainder = Integer.toBinaryString(d_remainder);

//quotient is converted into binary from decimal.
b_quotient = Integer.toBinaryString(d_quotient);

System.out.println("The remainder in the binary form is: "+ b_remainder);

System.out.println("The quotient in the binary form is: "+ b_quotient);
} catch (Exception e) {
e.printStackTrace();
}
}
}

