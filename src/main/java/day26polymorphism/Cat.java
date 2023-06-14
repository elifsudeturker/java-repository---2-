package day26polymorphism;

public class Cat extends Animal{
    public void meow(){
        System.out.println("Cats meow..");
    }
    @Override
    public void eat(){
        System.out.println("Cats eat...");
    }
    @Override
    public void drink(){
        System.out.println("Cats drink...");
    }
    @Override
    public Cat create(){
        return new Cat();
    }

    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }


}
