public class QueueByLinkedlistMain {
  public static void main(String[] args) {
    Queuebylinkedlist obj = new Queuebylinkedlist();

    Node n1 = new Node(10);
    obj.enqueue(n1);
    Node n2 = new Node(20);
    obj.enqueue(n2);
    obj.printqueue();

  }
}
