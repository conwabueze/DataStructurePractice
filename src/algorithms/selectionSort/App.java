package algorithms.selectionSort;

public class App {
    public static void main(String[] args) {
        int[] myArray = {9,8,3,13,87,12,99};
        selectionSort(myArray);
        for(int x=0;x<myArray.length;x++){
            System.out.print(myArray[x]+" ");
        }
    }

    public static int[] selectionSort(int a[]){
        for(int x=0;x<a.length;x++){
            int minimum = x;
            for(int i=x+1;i<a.length;i++){
                if(a[i]<a[x])minimum=i;//position of the minimum
            }
            int temp = a[x];
            a[x]=a[minimum];
            a[minimum]=temp;
        }
        return a;
    }
}
