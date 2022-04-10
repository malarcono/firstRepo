import java.util.Arrays;
public class BubbleSort {
    public static void sort(int[] arr) {
		// TODO

int tempMax;
boolean nextPass = true;
int i = 0;
while (nextPass && i < arr.length - 1) {
nextPass = false;
for ( int j = 1; j < arr.length - i; j++){
if (arr[j] < arr[j - 1]) {
tempMax = arr[j - 1];
arr[j - 1] = arr[j];
arr[j] = tempMax;
nextPass = true;
}
}
i++;
}
}
}
/* aqui acaba la tarea
codigo de aqui para abajo era solo para pruebas

public static void main(String[] args) {
int[] numArr = {1, 5, 3, 2, 4, 1};
System.out.println("Original " + Arrays.toString(numArr));
sort(numArr);
System.out.println("Sorted " + Arrays.toString(numArr));

numArr = new int[]{5, 10, 11, 5, 2, 3, 8, 10};
System.out.println("Original " + Arrays.toString(numArr));
sort(numArr);
System.out.println("Sorted " + Arrays.toString(numArr));

numArr = new int[]{1,2,3,1,3,4,5,6,7,8,9,9,6};
System.out.println("Original " + Arrays.toString(numArr));
sort(numArr);
System.out.println("Sorted " + Arrays.toString(numArr));

    }
}
// si vas a hacer pruebas, descomentar todo y quitar ultima } antes del codigo main

*/



