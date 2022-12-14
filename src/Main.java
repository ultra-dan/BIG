import java.util.Scanner; //scanner
import static java.lang.Math.*; //math
import java.util.*; //<arrayList>
public class Main {
    public static void main(String[] args) {
        int[] f = {5, 2, 364, 346, 73345, 364, 73};
        int[] d = {2, 432, 2, 5, 62, 35, 26, 3253};
        System.out.println(mergeSorted(f, d));
    }

    public static String mergeSorted(int[] a,int[] b){
        //create new array
        int[] merge= new int[a.length+b.length];
        //merge the parameter arrays into new array
        int p=0;
        for(int pos: a){
            merge[p]=pos;
            p++;
        }
        for(int pos: b){
            merge[p]=pos;
            p++;
        }

        //bubble sort
        int n = merge.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(merge[j-1] > merge[j]){
                    //swap elements  
                    temp = merge[j-1];
                    merge[j-1] = merge[j];
                    merge[j] = temp;
                }

            }
        }

        String to="";
        for(int string: merge){
            to=string+", ";
        }
        return to;
    }

}