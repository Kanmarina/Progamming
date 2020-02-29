package office_hour.Practice_01_15;

public class Teacher {
    private String name;
    private int age;

    //bad idea to have main
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        t1.setName("Sveta");
        t1.setAge(19);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void initilizeFields(String name, int age){

        this.name=name;
        this.age=age;

    }
}
