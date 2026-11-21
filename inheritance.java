import java.util.*;
class product
{
    int id;
    String name;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("prouct id:");
        id=sc.nextInt();
        System.out.println("name:");
        name=sc.next();
    }
    void display()
    {
        System.out.println("product id"+id);
        System.out.println("name:"+name);
    }
}
class electronic extends product
{
  String brand;
  void input()
  {
    get();
     Scanner sc=new Scanner(System.in);
        System.out.println("brand:");
        brand=sc.next();
  }
  void show()
  {
    display();
    System.out.println("brand:"+brand);
  }
}
class clothing extends product
{
  String size;
  void input()
  {
    get();
     Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        size=sc.next();
  }
  void show()
  {
    display();
    System.out.println("size:"+size);
  }
}
class main
{
    public static void main(String[]args)
    {
        electronic e=new electronic();
        clothing c=new clothing();
        System.out.println("enter electronic details:");
        e.input();
         System.out.println("enter clothing details:");
        c.input();
         System.out.println(" \nelectronic details:");
        e.show();
         System.out.println(" \nclothing details:");
        c.show();
    }
}
