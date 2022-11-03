//Abstract classes enforce and organize what the subclasses must have and implement
//It is different from interfaces because you can implement as many interfaces as you want, 
//but can only extend one class. Also, you can inherit fields from abstract classes, but not from interfaces, 
//because fields defined inside interfaces are always static and final

//You might want to create an abstract class when you have a lot of closely 
//related classes that need to have the same functionalities and the same types of fields available

//You might want to create an interface when you have a lot of unrelated classes that need to do a certain specific thing

public abstract class Animal {
    int age;
    String name;

    public abstract void makeNoise();

    public void printName() { // children of this class can use this implementation
        System.out.println(name);
    }
}
