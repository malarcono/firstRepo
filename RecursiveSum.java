import java.util.Arrays;
public class RecursiveSum {

public static void main(String[] args) {
System.out.println("Sum of 1 to 10 is: " + recurSum(10));
System.out.println("Sum of 1 to 20 is: " + recurSum(20));
System.out.println("Sum of 1 to 55 is: " + recurSum(55));

}
public static int recurSum (int num){
int res = num;

if  (num == 1 ) {
return num;
} else {
return num  + recurSum(num -1);
}
}

}

