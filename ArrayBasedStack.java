import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements StackInterface<T>{
   
   private T[] data;
   private int topOfStack = -1;
   public static final int INITIAL_CAPACITY = 5;
   private boolean stackCreated = true;
   
   @SuppressWarnings("unchecked")
   public ArrayBasedStack(int Initial_Capacity){
      if (Initial_Capacity <= 0) {
         throw new IllegalArgumentException("Capacity must be greater than 0");
      }
      
      data = (T[]) new Object[Initial_Capacity];
      topOfStack = -1;
   }
   
   public ArrayBasedStack(){
   this(INITIAL_CAPACITY);
      
   }
   
   public void expandArray() {
      data = (T[]) Arrays.copyOf(data, data.length * 2);
   }
   
   
   public void push(T newEntry){
   
      if (topOfStack >= INITIAL_CAPACITY) {
         expandArray();   
      } 
      topOfStack++;
      data[topOfStack] = newEntry;
      
   }
   
   public boolean isEmpty(){
      
     if (data == null || topOfStack < 0){
         return true;
     }
     else {
         return false;
     }  
        
   }
   
   public T pop() {
   
      if (topOfStack == -1) {
         throw new EmptyStackException();
      }
      return data[topOfStack--];
   }
   
   public T peek() {
   
      if (topOfStack == -1) {
      
         throw new EmptyStackException();
   
      }
   
      return data[topOfStack];
   }
   
   public void clear(){
      while(!isEmpty()) {
         pop();
      }
   }
   
   public static void main(String[] ajsdfhk) {
      StackInterface<String> s = new ArrayBasedStack<>();
      s.push("Hello");
      s.push("World");
      System.out.println(s.peek());
      System.out.println(s.pop());
      System.out.println(s.peek());
      System.out.println(s.pop());
      s.push("adsf");
      System.out.println(s.pop());
      System.out.println(s.pop());
   }
   
}