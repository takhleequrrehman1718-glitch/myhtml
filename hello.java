public class hello {
    int sum(int a , int b){
        return a+b ;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        hello h1 = new hello();
        System.out.println(h1.sum(12,15));
    }
}
