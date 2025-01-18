//1. Простое наследование
//Создайте базовый класс Animal с атрибутом name. Создайте дочерний класс Dog,
// унаследуйте от Animal, и создайте объект класса Dog, передав ему имя.

class Animal {
    String name;
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobic");
        System.out.println("Dog's name :  " + dog.name);
        Car car = new Car("Toyota", "Corolla");
        System.out.println("Brand :" + car.brand);
        System.out.println("Model :" + car.model);
        Student student = new Student();
        student.introduce();
        Person person = new Person();
        person.introduce();
        Penguin penguin = new Penguin();
        penguin.swim();
        Rectangle rectangle = new Rectangle("White");
        System.out.println("Rectangle color :" + rectangle.color);
        Dog2 dog2 = new Dog2("Tuzik", "Pudel");
        System.out.println("the dog's name is " + dog2.name);
        System.out.println("the dog's breed is " + dog2.breed);
        Cat cat = new Cat("Barsik", "Black");
        System.out.println("the cat's name is " + cat.name);
        System.out.println("the cat's color is " + cat.color);
        Appliance appliance = new Appliance("Generic brand");
        System.out.println("Appliance brand :" + appliance.brand);
        WashingMachine washingMachine = new WashingMachine("LG");
        System.out.println("washingMachine brand :" + washingMachine.brand);
        Mammal mammal = new Mammal("Living", "Mammal", "Human");
        System.out.println("Type :" + mammal.type);
        System.out.println("Species :" + mammal.species);
        System.out.println("Name :" + mammal.name);
        Apple apple = new Apple("Fruit", "Golden");
        if (apple instanceof Fruit) {
            System.out.println("This is fruit");
        } else {
            System.out.println("This is not fruit");
        }
        System.out.println("Type -" + apple.type);
        System.out.println("Variety -" + apple.variety);
        Phone phone = new Phone("Smartphone");
        System.out.println("Device name" + phone.name);
        phone.make_call();
    }
}

//        2. Добавление нового атрибута
//Создайте класс Vehicle с атрибутом brand. Создайте класс Car,
// который наследует Vehicle, и добавьте атрибут model.
// Создайте объект Car и установите оба атрибута.
class Vehicle {
    String brand;
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        this.model = model;
        this.brand = brand;
    }

}
//3. Наследование с использованием метода базового класса
//Создайте класс Person с методом introduce(),
// который выводит строку "I am a person".
// Создайте класс Student, который наследует Person,
// и создайте объект Student. Вызовите метод introduce().

class Person {
    public void introduce() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    @Override
    public void introduce() {
        System.out.println("I am a student");
    }
}
//        4. Добавление метода в дочерний класс
//Создайте класс Bird с атрибутом species. Создайте класс Penguin,
// который наследует Bird, и добавьте метод swim(), который выводит "I can swim".


class Bird {
    String species;
}

class Penguin extends Bird {
    public void swim() {
        System.out.println("I can swim");
    }
}
//        5. Наследование с использованием конструктора
//Создайте класс Shape с атрибутом color, который задается через конструктор.
// Создайте класс Rectangle, который наследует Shape,
// и создайте объект Rectangle с указанием цвета.

class Shape {
    String color;


    public Shape(String color) {
        this.color = color;
    }
}

class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }
}
//6. Создание нескольких дочерних классов
//Создайте класс Animal. Затем создайте два дочерних класса: Dog и Cat.
// В каждом из них добавьте уникальный атрибут, например,
// breed для собак и color для кошек.

class Animal2 {
    String name;

    public Animal2(String name) {
        this.name = name;

    }
}

class Dog2 extends Animal2 {
    String breed;

    public Dog2(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}

class Cat extends Animal2 {
    String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }
}

//7. Наследование с передачей значений в конструктор
//Создайте класс Appliance с атрибутом brand.
// Создайте класс WashingMachine, который наследует Appliance,
// и установите значение для атрибута brand при создании объекта.
class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

}
//8. Создание цепочки наследования
//Создайте класс LivingBeing с атрибутом type (например, "Living").
// Создайте класс Animal, наследующий LivingBeing, и добавьте атрибут species.
// Создайте класс Mammal, который наследует Animal, и добавьте атрибут name.

class LivingBeing {
    String type;

    public LivingBeing(String type) {
        this.type = type;
    }
}

class Animal4 extends LivingBeing {
    String species;

    public Animal4(String type, String species) {
        super(type);
        this.species = species;
    }
}

class Mammal extends Animal4 {
    String name;

    public Mammal(String type, String species, String name) {
        super(type, species);
        this.name = name;
    }
}

//        9. Проверка принадлежности к классу
//Создайте класс Fruit и его дочерний класс Apple.
// Создайте объект Apple и с помощью функции isinstance() проверьте,
// принадлежит ли он к классу Fruit.
class Fruit {
    String type;

    public Fruit(String type) {
        this.type = type;
    }
}

class Apple extends Fruit {
    String variety;

    public Apple(String type, String variety) {
        super(type);
        this.variety = variety;
    }
}
//        10. Дочерний класс с дополнительным методом
//Создайте класс Device с атрибутом name.
// Создайте класс Phone, который наследует Device,
// и добавьте метод make_call(), который выводит "Calling...".

class Device {
    String name;

    public Device(String name) {
        this.name = name;
    }
}

class Phone extends Device {
    public Phone(String name) {
        super(name);
    }

    public void make_call() {
        System.out.println("Calling ...");
    }

}




