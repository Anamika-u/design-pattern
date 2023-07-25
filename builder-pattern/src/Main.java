public class Main {
    public static void main(String[] args) {
//        Student.StudentBuilder studentBuilder = new Student.StudentBuilder(1,"John");
//        studentBuilder.setAddress("India");
//        Student student = new Student(studentBuilder);
//        System.out.println(student);

        User user = new User.UserBuilder(1,"Joe").setAddress("India").setAge(15).setPhoneNumber("124324343").build();
        System.out.println(user);
    }
}