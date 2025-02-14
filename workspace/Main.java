public class Main{
    public static void main(String[] args){
        Heap h=new Heap();
        h.add(100);
        h.add(200);
        h.add(300);
        h.add(400);
        h.add(500);
        h.add(600);
        h.add(50);
        h.add(60);
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(690);
        h.add(700);
        h.add(501);
        h.add(640);
        h.add(105);
        h.add(206);
        h.add(302);
        h.add(403);
        h.add(699);
        h.add(800);
        System.out.println(h);
        h.removeMax();
        
        h.removeMax();
       
        h.removeMax();
        
        h.removeMax();
        System.out.println(h);
        
    }
}