public class Heap {

    //the actual storage structure for your heap
    
    private int[] arr;
    private int finalIndex=0;
    
    //constructor for your heap given in starter code
    public Heap() {
    
    arr = new int[100];
    finalIndex=0;
    }
    
     
    
     
    //precondition: to Add is a valid int 
    // adds elements to the heap and adjusts to kepp heap properties
    public void add(int toAdd) {
        int i=finalIndex;
        arr[i]=toAdd;
        siftUp(i);
        finalIndex++;    
    
    }
    
     
    //precondition:heap has at least one element and final index is as least one
    //postcondition:remove the largest element of the heap (the root) and re-heapafy
    public void removeMax() {
        arr[0]=0;
        for(int i=0;i<=finalIndex;i++){
            arr[i]=arr[i+1];
        }

        siftDown(0);
        finalIndex--;
    }
    
     
    //precondition: tree has elements
    //check and alter the tree after an item is inserted
    private void siftUp(int index) {
        int temp;
        while(index!=0){
        if(arr[index]>arr[(index-1)/2]){
            temp=arr[(index-1)/2];
            arr[(index-1)/2]=arr[index];
            arr[index]=temp;
        }
        index=(index-1)/2;
       // if(arr[index]>arr[(index-1)/2]){
            //siftUp((index-1)/2);
       // }
        }
    }
    
     
    //preconditon:
    //this should check and alter the tree after an item is deleted.
    private void siftDown(int index) {
        @SuppressWarnings("unused")
        int temp;
        //while(index<=finalIndex){
            if(arr[index*2+1]>arr[index]){
                temp=arr[index];
                arr[index]=arr[index*2+1];
                arr[index*2+1]=arr[index];
                siftDown(index*2+1);
            }
            
            if(arr[index*2+2]>arr[index]){
                temp=arr[index];
                arr[index]=arr[index*2+1];
                arr[index*2+1]=arr[index];
                siftDown((index*2+2));
            }
       //     index*=2;
       // }

    }
    
// prints the heap
    public String toString(){
        String out="";
        int i=0;
        int nextLevel=0;
        while(nextLevel<=finalIndex){
            
            for(i=i;i<nextLevel;i++){
            
                out+=arr[i];
              out+= " ";
            }
            out+="\n";
            nextLevel=2*i+1;
        }   
        return out;
    }

    //4 points for syntax conventions.
    
     
    
    }