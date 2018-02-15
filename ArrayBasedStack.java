import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements StackInterface<T>{
   
   private T[] data;
   private int topOfStack = -1;
   private int INITIAL_CAPACITY = 5;
   private boolean stackCreated = true;
   
   @SuppressWarnings("unchecked")
   public ArrayBasedStack(int Initial_Capacity){
      INITIAL_CAPACITY = Initial_Capacity;
      if (INITIAL_CAPACITY <= 0) {
         throw new IllegalArgumentException("Capacity must be greater than 0");
      }
      
      data = (T[]) new Object[INITIAL_CAPACITY];
      topOfStack = -1;
   }
   
   public ArrayBasedStack(){
   
      data = (T[])new Object[INITIAL_CAPACITY];
      
   }
   
   public int[] expandArray() {
      
      int[] arr = new int[2*INITIAL_CAPACITY];
      return arr;
   }
   
   
   public void push(T newEntry){
   
      if (topOfStack >= INITIAL_CAPACITY) {
         expandArray();   
      } 
   
      data[topOfStack++] = newEntry;
   }
   
   public boolean isEmpty(){
      
     if (data == null || topOfStack < 0){
         return true;
     }
     else {
         return false;
     }  
        
   }
   //
   
   public T pop() {
   
   if (topOfStack == -1) {
      throw new EmptyStackException();
   }
   
   return data[--topOfStack];
   
   }
   
   public T peek() {
   
   if (topOfStack == -1) {
      
      throw new EmptyStackException();
   
   }
   
      return data[topOfStack];
   }
   
   public void clear(){
   
      Arrays.fill(data, null);
   
   
   }
   
   


}