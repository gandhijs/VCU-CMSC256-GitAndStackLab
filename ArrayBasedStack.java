import java.util.Arrays;

public class ArrayBasedStack<T> implements StackInterface<T>{
   
   private int data[];
   private int topOfStack = -1;
   private int INITIAL_CAPACITY = 5;
   private boolean stackCreated = true;
   
   public ArrayBasedStack(int Initial_Capacity){
      INITIAL_CAPACITY = Initial_Capacity;
      if (INITIAL_CAPACITY <= 0) {
         throw new IllegalArgumentException("Capacity must be greater than 0");
      }
      @SuppressWarnings("unchecked")
      T[] Data = (T[])new Object[INITIAL_CAPACITY];
      topOfStack = -1;
   }
   
   public ArrayBasedStack(){
   
      T[] Data = (T[])new Object[INITIAL_CAPACITY];
      
   }
   
   public boolean push(T it) {
   
   if (topOfStack >= INITIAL_CAPACITY) {
      return false;   
   } 
   
   Data[topOfStack++] = it;
   return true;
   
   }
   
   
   
   


}