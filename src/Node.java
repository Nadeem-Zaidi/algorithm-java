public class Node {

    int data;
    Node next;
    Node(int data){
        this.data=data;

    }
}
class List{
    Node head=null;
    Node tail=null;

    void add(int value){
        Node node=new Node(value);
        if(this.head==null){
            this.head=node;
        }
        else{
            Node tmp=this.head;
            this.head=node;
            this.head.next=tmp;
        }
    }

    void displayData(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

}

class NodeImplement{
    public static void main(String args[]){
        List list=new List();
        list.add(89);
        list.add(78);
        list.add(90);
        list.add(45);
        list.add(3);
        list.displayData();
    }
}
