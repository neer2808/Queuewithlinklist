public class Queuebylinkedlist {
  Node front;
  Node rear;

  public Queuebylinkedlist() {
    front= null;
    rear = null;
  }
 public void enqueue(Node newnode)
 {
  if(front==null && rear ==null)
  {
    front=rear=newnode;
  }
  else
  {
    rear.next= newnode;
    rear= newnode;
  }
 }
 public void dequeue()
 {


 }
 public void printqueue()
 {
   Node temp = front;
   while(temp!= null)
   {
     System.out.println(temp.data);
     temp = temp.next;
   }
 }

}
