import java.util.Arrays;

public class SumOfArrays {

public static void main (String[] args){
int[] arr1 = {1, 2, 3, 4, 5};
int tar = 4;
int[] res = sumToTarget(arr1, tar);
System.out.println(Arrays.toString(res));
}

public static int[] sumToTarget(int[] a1, int tgt) {
int[] res = new int[2];

for (int i=0; i <a1.length-1; i++){
for (int j=i +1; j < a1.length; j++){
if ((a1[i] + a1[j]) == tgt) {
res[0] = a1[i];
res[1] = a1[j];
return res;
}
}
}
res[0] = 0;
res[1] = 0;

return res;


}

}

