package Arraytype;

public class Trylinklist {
    public static void main(String[] args) {
        LinklistTest list=new LinklistTest();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        System.out.println(("printing any position"));
        list.pointList();

        System.out.println(("printing any position"));
       System.out.println("gettig postion data");

       System.out.print(list.getDataAtPos(2));
        System.out.println("removing data");
        list.remove(3);
        System.out.println("after removing");
        list.pointList();


    }
}

