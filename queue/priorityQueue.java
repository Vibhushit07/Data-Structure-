package queue;

class pQueue{
    int n;
    int arr[];
    pQueue(){
        arr = new int[10];
        n = 0;
    }
    
    void add(int a){
        if(n == 0){
            arr[0] = a;
        }else{
            int i;
            for(i = n-1; i >= 0; i--){
                if(arr[i] > a){ // change > to < to convert it to min pq
                    arr[i+1] = arr[i];
                }else{
                    break;
                }
            }
            arr[i+1] = a;
        }
        n++;
    }
    
    int poll(){
    	
       return arr[--n];
    }
    
    int size(){
        return n;
    }
    
    boolean isEmpty(){
    	
        return n == 0;
    }
    
    int peek(){
        return arr[n-1];
    }
    
    void show(){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class priorityQueue {
    public static void main(String []args){
        
        pQueue pq = new pQueue();
        pq.add(5);
        pq.add(4);
        pq.add(9);
        pq.add(6);
        pq.add(3);
        System.out.println(pq.size());
        pq.show();
        System.out.println(pq.isEmpty());
        System.out.println(pq.poll());
        System.out.println(pq.size());
        pq.show();
        System.out.println(pq.peek());
    }
}