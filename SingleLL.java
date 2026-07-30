import java.util.*;
public class SingleLL{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    
    void InsertFirst(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head = newNode;
    }

    void InsertMiddle(int data, int key){
        Node newNode= new Node(data);
        Node CurrNode= head;
        Node Prev =null;

        while(CurrNode!=null){
            if(CurrNode.data==key)
            {
                newNode.next= Prev.next;
                Prev.next=newNode;
                break;
            }
            Prev =CurrNode;
            CurrNode =CurrNode.next;
        }
    }
    void InsertLast(int data){
        Node newNode= new Node(data);
        Node CurrNode= head;
        if(head == null)
        {
            head =newNode;
            return;
        }
        while(CurrNode.next!=null)
        {
            CurrNode=CurrNode.next;
        }
          CurrNode.next =newNode;
        }

        void display()
        {
            Node CurrNode=head;
            while(CurrNode!=null)
                {
                    System.out.println(CurrNode.data+ " ");
                    CurrNode=CurrNode.next;
                 }
         }

         void DeleteFirst(){
            if(head ==null)
                return;
                head = head.next;
         }

         void DeleteMiddle(int key) {
        Node CurrNode=head;
        Node Prev=null;
                if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        while(CurrNode!=null)
        {
            if(CurrNode.data==key)
            {
                Prev.next=CurrNode.next;
            
            }
            Prev=CurrNode;
            CurrNode=CurrNode.next;
    }
    }
    void DeleteLast()
    {
      Node CurrNode =head;
      Node Prev=null;
      if(head==null)
      return;
         if(head.next==null)
         {
             head=null;
             return;
         }
         while(CurrNode.next!=null)
         {
             Prev=CurrNode;
            CurrNode=CurrNode.next;
            
         }  
         Prev.next=null;
    }
        
    
    public static void main(String[]args)
    {
      SingleLL m=new SingleLL();
      m.InsertFirst(2);
      m.InsertFirst(3);
      m.InsertLast(8);
      m.InsertFirst(6);
      m.InsertLast(20);
      m.InsertLast(24);
      m.InsertMiddle(5,8);
      m.DeleteMiddle(2);
      m.DeleteFirst();
      m.DeleteLast();
      m.display();
    }
}

        