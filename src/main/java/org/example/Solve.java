package org.example;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.util.*;
import java.lang.*;


public class Solve {
//    private static final Logger logger = LogManager.getLogger(Solve.class);
    public Solve()
    {

    }
    public static void main(String[] args)
    {
        Solve obj=new Solve();
        char operator;
        Double number1, number2=0.0, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
      System.out.println("Choose an operator: l,p,f,s");

        operator = input.next().charAt(0);
        // ask users to enter numbers
        if(operator=='+' || operator=='-' || operator=='p'  ) {
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();
        }

        else
        {
            System.out.println("Enter first number");
            number1 = input.nextDouble();
        }

        switch (operator) {

            // performs addition between numbers
            case '+' :{
                System.out.println(number1 + " + " + number2 + " = "+obj.sum(number1,number2) );
                break;
            }

            // performs subtraction between numbers
            case '-' :{

                System.out.println(number1 + " - " + number2 + " = " + obj.minus(number1,number2));
                break;
            }

            // performs multiplication between numbers
            case 'p' : {
                System.out.println("number1 raised to power number2 =" + obj.power(number1,number2));
                break;
            }

            // performs division between numbers
            case 'l' : {
                System.out.println("log of number is"+ obj.naturallog(number1));
                break;
            }

            case 'f': {
                Double i=1.0;
                Double fact=1.0;
                while( i <= number1)
                {
                    fact = fact * i;
                    i++; //increment i by 1
                }
                System.out.println(fact);
                break;
            }

            case 's':
            {
                System.out.println(Math.sqrt(number1));
                break;

            }
            default :{
                System.out.println("Invalid operator!");
                break;

            }
        }

        //input.close();

    }

    public double power(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }

    public double sum(double num1, double num2)
    {
        return num1 + num2;
    }
    public double minus(double num1, double num2)
    {
        return num1 - num2;
    }
    public double naturallog(double num1)
    {
        if(num1==0 || num1<0)
        {
            System.out.println("cannot find log");
            System.exit(0);
        }
        return Math.log(num1);
    }



}

