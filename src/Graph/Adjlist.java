package Graph;

import Linklist.LinklistTest;

public class Adjlist {

    LinklistTest[] list;
    int size;
    Adjlist(int v){
        list=new LinklistTest[v];
        this.size=v;

        //creating linked list for each nodes

        for(int i=0;i<v; i++){
            list[i]=new LinklistTest();


        }

    }
    public void addEdge(int source,int destination){
        list[source].addNode(destination);
        list[destination].addNode(source);

    }
    public void printGraph(){
        for(int i=0; i<size; i++){
            System.out.print(i+ "is connected to");
            for(int j=1; j<=list[i].getSize();j++){
                System.out.print(list[i].getDataAtPos(j)+" ");
            }

        }
    }
}
