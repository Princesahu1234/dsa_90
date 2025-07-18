class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linklist {
    node head;
    public void addToFirst(int data){
    

     node newNode=new node(data);
        if(head==null)
        {   
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addToLast(int data)
    {
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
         
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            
        }
        temp.next=newNode;
        newNode.next=null;
    }

    public void addToSp(int data,int a)
    {
         node newNode=new node(data);
        if(head==null)
        {
            head=newNode;

            return;
        }
        if(a==0)
        {
            newNode.next=head;
            newNode=head;

        }
        node temp=head;
        for(int i=1;i<a-1;i++)
        {
            
            temp=temp.next;

        }
        newNode.next=temp.next;
        temp.next=newNode;



    }
    
    public void delToFirst()
    {
        
        
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        head=head.next;
        

    }

    public void delToLast()
    {
        node temp=head;
        node tempn=head;
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        if (head.next == null) {
       
        head = null;
        return;
        }

        while(temp.next!=null)
        {
          
            tempn=temp;
            temp=temp.next;
        }
        tempn.next=null;

    }

    public void delToSP(int a)
    {
       node temp=head;

        for(int i=0;i<a-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    // public void mid()
    // {

    //  System.out.println("hello");

    //     node temp=head;
    //     int i=0;
    //     while(temp!=null){
    //         i=i+1;
    //         temp=temp.next;
    //     }
    //     temp=head;
    //     for(int j=0;j<=i/2;j++){
    //         temp=temp.next;
           
    //     }
    //     System.out.println(temp.data  +"heh");
    // }


    public void mid()
        {
            node slow=head;
            node fast=head;

            while (fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }
    


    void display()
    {
        node temp=head;

        while(temp!=null)
        {   
            System.out.println(temp.data+"->");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
       
       linklist list=new linklist();
       list.addToFirst(5);
       list.addToFirst(10);
       list.addToFirst(10);
       list.addToFirst(30);
       list.addToFirst(40);
       list.addToLast(20);
       list.addToLast(20);

       list.addToSp(100,2);
       list.delToFirst();
       list.delToLast();
       list.delToSP(1);


       list.display();
      list.mid();

    }
}
