package binaryDivision;

import java.util.*; //Importing all classes of Util Package
public class BitMultiply //Creating a class named BitMultiply
 {
 public static void main(String[] args) //Main Method
  {
  System.out.println("Enetr the numbers in decimal form which you want to multiply");
  Scanner InpOb = new Scanner(System.in); //Making Object InpOb
  int num1 = InpOb.nextInt();
  int num2 = InpOb.nextInt();
  int i1=0, i2=0, i3=0;
         int arr1[] = new int[100];
         int arr2[] = new int[100];
         int arr3[] = new int[100];
  int a = num1;
  System.out.println(num1 + " in binary form is ");
  while (a != 0)      //Converting num1 in Binary
          {
          i1++;
          arr1[i1] = a % 2;
              a = a / 2;
          }
         for (int j = i1; j > 0; j--)
          {
          System.out.print(arr1[j]);
          }
  System.out.println();
  a = num2;
  System.out.println(num2 + " in binary form is ");
  while (a != 0)       //Converting num2 in Binary
          {
          i2++;
          arr2[i2] = a % 2;
              a = a / 2;
          }
         for (int j = i2; j > 0; j--)
          {
          System.out.print(arr2[j]);
          }
  System.out.println();
  System.out.println("Multiplying " +num1 +" & " + num2 +" in we get");
  int result = 0;
  while (num2 != 0) // Iterate the loop till b==0
          {
              if ((num2 & 01) != 0) // Logical ANDing of the value of num2 with 01
              {
                  result = result + num1; // Update the result with the new value of num1.
              }
              num1 <<= 1;              // Left shifting the value contained in 'num1' by 1.
              num2 >>= 1;             // Right shifting the value contained in 'num2' by 1.
          }
          System.out.println(result);
  System.out.println();
  a = result;
  System.out.println(result + " in binary form is ");
  while (a != 0)
          {
          i3++;
          arr3[i3] = a % 2;
              a = a / 2;
          }
         for (int j = i3; j > 0; j--)
          {
          System.out.print(arr3[j]);
          }

  }
 }