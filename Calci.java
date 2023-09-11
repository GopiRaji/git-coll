import java.util.Scanner;
interface Calci{
int getSum(int a,int b);
}

class CalciImp implements Calci{
public int add(int a,int b){
return a+b;}}

class TestClass{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
Calci c=new Calci();
System.out.println(c.add());
}}