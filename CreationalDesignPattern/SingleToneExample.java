package DesignPattern;
class Product{
    private String name;
    public static Product product=null;
   private Product(String name){
        this.name=name;
    }
    public static Product getInstance(String name){
        if(product==null)
            product=new Product(name);

       return product;

    }
    public void display(){
        System.out.println("name="+this.name);
    }
}
public class SingleToneExample {
    public static void main(String[] args) {
        Product p1=Product.getInstance("Manisha");
        System.out.println(p1);
        p1.display();
        Product p2=Product.getInstance("Babita");
        System.out.println(p2);
        p2.display();

    }
}
