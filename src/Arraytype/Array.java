package Arraytype;
import java.util.Scanner;


public class Array {
    public int[] insertAtAnyPosition(int[] myArray, int n, int pos, int data){
        int newarr[]=new int[n+1];
        for(int i=0;i<n+1;i++){

            if(i<pos-1){
                newarr[i]=myArray[i];
            }
            else if(i==pos-1){
                newarr[i]=data;
            }
            else{
                newarr[i]=myArray[i-1];
            }

        }
        return newarr;

    }

    public static void main(String[] Args){
        int a[] ={10,20,30,40,50};
        System.out.println("printing old data");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
       Array r=new Array();
        int x[]=r.insertAtAnyPosition(a,5,3,25);

        System.out.println("printing newdata");
        for(int i=0;i<a.length;i++){
            System.out.println(x[i]);
        }


    }
}


