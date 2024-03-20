public class Person {
    private String name;
    private int age;

    public String updateName(String name){
        this.name = this.name + 'uat';
    }

    public Boolean calculateAge(int age){
        this.age = this.age > 18 ? TRUE : FALSE;
    }
}