package tr.edu.maltepe.oop;
public  class Simple_main {

 public static void main(String []args){
        //

Cat hayvan = new Cat("Sakiz", 7 );
Cat hayvan2 = new Cat("Limon", 5);
System.out.println("My cat's name is "+hayvan.getName());
System.out.println("My cat's age is "+hayvan.getAge());
System.out.println("My cat's name is "+hayvan2.getName());
System.out.println("My cat's age is "+hayvan2.getAge());
Cat.playMeowSound();
        }
}


