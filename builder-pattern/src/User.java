public class User {
    final int id;
    final String name;
    final String address;
    final String phoneNumber;
    final int age;

    //we can keep this constructor as private as we are calling it from inner class only
    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.address = userBuilder.address;
        this.phoneNumber = userBuilder.phoneNumber;
        this.age = userBuilder.age;
    }

    public static class UserBuilder {
        int id;
        String name;
        String address;
        String phoneNumber;
        int age;

        public UserBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
