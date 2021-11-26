package Arraytype;

public class Empty {

    public static int a[] = new int[6];
    static int n = 0;
    Empty() {
        for (int i = 0; i < 5; i++) {
            n++;
            a[i] = n;
        }
    }


//add
    static void insAtanyPos(int pos, int data) {

        for (int i = n - 1; i >= pos - 1; i--) {
            a[i + 1] = a[i];
        }
        a[pos - 1] = data;
        n++;
    }


    //remove
    static void RemoveAtAnyPos(int pos) {
        for(int  i=pos-1; i<n-1;i++){
            a[i]=a[i+1];
        }
        n--;
    }




    public static void main(String[] args) {
        Empty c = new Empty();
        System.out.println("printing old values");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        insAtanyPos(3, 8);
        System.out.println("printing new values");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

        }
        System.out.println("removing data ");
        RemoveAtAnyPos(3);
        for(int i=0; i<n ; i++){
            System.out.println(a[i]);
        }

    }
}
