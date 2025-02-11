package org.joonzis.ex;

abstract class Animal {
    // Animal 클래스의 생성자
    public Animal(String food) {
    }

    // 먹는 행동
    public void eat(String food) {
        System.out.println(food + " 먹는다");
    }

    // 추상 메소드 move()
    abstract public void move();
}

class Dog extends Animal {
    
    // Dog 클래스의 생성자
    public Dog(String food) {
        super(food); // 부모 클래스의 생성자 호출
    }

    // Dog의 move() 메소드 구현
    @Override
    public void move() {
        System.out.println("강아지 산책한다");
    }
}

public class Ex01_abstract {

    public static void main(String[] args) {
        // Dog 객체를 생성하면서 "사료"를 전달
        Animal animal = new Dog("사료");
        
        // eat() 메소드 호출
        animal.eat("사료");
        
        // move() 메소드 호출
        animal.move();
    }
}
