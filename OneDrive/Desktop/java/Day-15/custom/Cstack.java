
package custom;
public class Cstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr= -1;
    public Cstack(){
        this(DEFAULT_SIZE);
    }
    public Cstack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()) {
            System.out.println("Stack is full ");
            return false;
        }
        ptr++;
        data[ptr]= item;
        return true;
    }
    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("Cannot pop from empty");
        }
        int removes= data[ptr];
        ptr--;
        return removes;
    }
    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Cannot peek from empty");
        }
        return data[ptr];
    } 
    public boolean isFull(){
        return ptr == data.length-1 ; // ptr is at last index
    }
    private boolean isEmpty(){
        return ptr == -1; // ptr is at last index
    }
}
