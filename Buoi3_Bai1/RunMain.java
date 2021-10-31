package Buoi3_Bai1;


public class RunMain {
    public static void main(String[] args) {
        Person p1 = new Person("Lan", 18, "female", "Read book");
        Person p2 = new Person();

        p2.setName("Van");
        p2.setAge(20);
        p2.setGender("male");
        p2.setHobby("listen to music");

        System.out.println(p1);

        System.out.print("Name: " + p2.getName());
        System.out.print(", Age: " + p2.getAge());
        System.out.print(", Gender: " + p2.getGender());
        System.out.println(", Hobby: " + p2.getHobby());
    }
}
