public class Main{
public int addnum(int a, int b){
int sum = a+b;
return sum;
}
public static void main(String args[]){
int num1 = 10;
int num2 = 20;
Main M = new Main();
int total = M.addnum(num1, num2);
System.out.println(total);
}
}