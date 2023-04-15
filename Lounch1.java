package Constructor;

class Demo{
    private int a;
    private int b;
    public Demo(){
        System.out.println("Non prametrize constructor by programer");
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
    public Demo(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Prametrize constructor by programer");
    }

}

public class Lounch1 {
    public static void main(String[] args) {
        Demo obj =  new Demo();
        obj.disp();
        Demo obj1 = new Demo(24,89);
        obj1.disp();
    }
}
