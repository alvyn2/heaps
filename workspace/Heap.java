public class Heap {

    //the actual storage structure for your heap
    
    private int[] arr;
    private int finalIndex=0;
    
    //constructor for your heap
    //feel free to make one that takes in an array if you prefer for your testing purposes.
    //note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing
    //the array
    
    public Heap() {
    
    arr = new int[100];
    finalIndex=0;
    }
    
     
    
     
    
    //create this function to add elements to your heap
    
    //all heap properties must be preserved
    
    // 5 points
    public void add(int toAdd) {

      int i=finalIndex;
        arr[i]=toAdd;
        siftUp(i);
        

    finalIndex++;    
    
    }
    
     
    
    //remove the largest element of the heap (the root) and re-heapafy
    //5 points
    public void removeMax() {
        arr[0]=0;
        for(int i=0;i<=finalIndex;i++){
            arr[i]=arr[i+1];
        }

        siftDown(0);
        finalIndex--;
    }
    
     
    
    //this should check and alter the tree after an item is inserted
    //3 points
    
    private void siftUp(int index) {
        int temp;
        if(arr[index]>arr[(index-1)/2]){
            temp=arr[(index-1)/2];
            arr[(index-1)/2]=arr[index];
            arr[index]=temp;
        }
        index=(index-1)/2;
        if(arr[index]>arr[(index-1)/2]){
            siftUp((index-1)/2);
        }

    }
    
     
    
    //this should check and alter the tree after an item is deleted.
    
    //3 points
    
    private void siftDown(int index) {
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

    public String toString(){
        String out="";
        for(int i=0;i<=finalIndex;i++){
            out+=arr[i];
            out+= " ";
        }
        return out;
    }

    //4 points for syntax conventions.
    
     
    
    }