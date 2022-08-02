class Kstackclass{
    int arr[];
    int top[];
    int next[];
    int ksize;
    int capacity;
    int freetop;
    Kstackclass(int ksize,int n){
this.ksize=ksize;
this.capacity=n;
arr=new int[capacity];
top=new int[ksize];
next=new int[capacity];
freetop=0;
topfill();
nextfill();

    }

    void topfill(){
        for (int i = 0; i < ksize; i++) {
            top[ksize]=-1;
        }
    }
    void nextfill(){
        for (int i = 0; i < capacity-1; i++) {
            next[i]=i+1;
        }
        next[capacity-1]=-1;
    }
    void Push(int element ,int stacknumber){
        int index=freetop;
       freetop=next[index];
next[index]=top[stacknumber];
top[stacknumber]=index;
arr[index]=element;
}

int  Pop(int stacknumber){
    int index=top[stacknumber];
    top[stacknumber]=next[index];
next[index]=freetop;
freetop=index;
return arr[index];
}



public class N_stack {
 
public static void main(String[] args) {
    Kstackclass kstack=new  Kstackclass(3,10);
    kstack.Push(10,0);
    kstack.Push(20,0);
    kstack.Push(30,0);
    kstack.Push(40,1);
    kstack.Push(50,1);
    System.out.println(kstack.Pop(0));
      System.out.println(kstack.Pop(1));
}
}
//to be done