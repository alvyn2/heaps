public class Main{
    public static void main(String[] args){
        Heap h=new Heap();
        for(int i=0;i<90;i++){
            h.add((int) (Math.random()*500));
        }
        System.out.println(h);
        h.removeMax();
        
        h.removeMax();
       
        h.removeMax();
        
        h.removeMax();
        System.out.println(h);
        
    }
}