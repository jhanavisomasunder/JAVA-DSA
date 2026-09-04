public class queue {
    class queue{
        int[]arr;
        int front;// adding the element
        int rear;//backside---the elemnts will be deleted fifo
        int size;
        queue(int size){
            this.size=size;
            arr=new int[size];
            front=0;
            rear=-1;

        }
    }
    
}
//circular q
//front and rear are connected
//enqueue--to add the elmenet in q
//dequeue--to delete the queue
//deque--double ended q -- in the 1st pos or the last pos the elemnt can be added or removed 
// LRU--LEAST RECENTLY USED
//LFU--
//greedy alg-to find the best choice