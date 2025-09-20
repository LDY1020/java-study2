package matter;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person withAge(int newAge){
        return new Person(this.name , newAge);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
