package epamweek3;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
    	int n1, n2,res=0;
char ch;
        Scanner sc = new Scanner(System.in);
do{
        System.out.print("Enter first number:");
        n1 = sc.nextInt();
        System.out.print("Enter second number:");
        n2 = sc.nextInt();
        System.out.println("Enter an operator among the following:\n (+, -, *, /, %) ");
        char op = sc.next().charAt(0);
        switch(op)
        {
            case '+':
            	res = n1 + n2;
                break;

            case '-':
            	res = n1 - n2;
                break;

            case '*':
            	res = n1 * n2;
                break;

            case '/':
            	res = n1/n2;
                break;

            case '%':
            	res = n1%n2;
                break;

            default:
                System.out.println("You have entered wrong operator");
		return ;
}
 System.out.println("The result of operation is "+n1+" "+op+" "+n2+"= "+res);
System.out.println("Do u wish 2 continue\n ('y' or 'Y')");
 ch = sc.next().charAt(0);
}while(ch=='Y' || ch=='y');
    }
}