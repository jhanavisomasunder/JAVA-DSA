//implementing stcak using array
public class stack{
    class stack{
        int[]arr;
        int top;
        int size;
        stack(int size){
            this.size=size;
            arr=new int[size];
            top=-1;
}
//push 
void push(int value){

    if(top==size-1)//to check if the stack is full
    {
        System.out.println("stack overflow");
    return;
    }
    top++;// if the stack is not full then push the elment and as it is a stack so it becomes the top elemnt
    arr[top]=value;
} 
//pop
int pop(){
    if(top==-1){//there is no elemnt in the stack ----stack underflow
    System.out.println("stack underflow");
    return;
    }
    return arr[top--]//else condition if the elemnt is there the reomve the elemnt ie the top elenmt
}
//peek--- just looking for the top element without removing that element in stack
int peek(){
    if(top==-1){
        return -1;
    }
    return arr[top];
}
}
}


//232-+147/- operation in stack