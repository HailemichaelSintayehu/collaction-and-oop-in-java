// compile time polymorphism

class addition{

    void sum(int x, int y){
        System.out.println("First Method : "+ (x+y));
    }

    void sum(int x, int y, int z){
        System.out.println("Second Method: "+ (x+y+z));
    }

    void sum(int x,double y){
        System.out.println("Third Method: "+ (x+y));
    }
}

public class Overloading {
    public static void main(String[] args) {
        addition a1=new addition();
        a1.sum(5,4);
        a1.sum(6,7,4);
        a1.sum(9,7.0);
    }
}