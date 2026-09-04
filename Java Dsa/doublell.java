/*public class doublell {
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    
}*/
public class doublell {
    void deleteelemnt(Node node){
        if(node==null){
            return;
        }
        if(node.prev!=null){ 
            node.prev.next=node.next 
        }else{
            head=node.next;
        }
        if(node.next!=null){
            node.next.prev=node.prev
        }
        }

        }
    }}