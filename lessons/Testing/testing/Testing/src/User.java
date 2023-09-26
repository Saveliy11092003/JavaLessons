import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static int countId = 0;

    private static HashMap<Integer, User> allUsers = new HashMap<>();

    public User(String name, int age, Sex sex) {
        if(name != null && !name.isEmpty() && age>0 && sex != null) {
            this.name = name;
            this.age = age;
            this.sex = sex;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }

    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for(User user : allUsers.values()){
            if(user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    public static int getHowManyUsers(){
        return getAllUsers().size();
    }

    public static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers(){
        int countAge = 0;
        for(User user:allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for(User user:getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers()/getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex)/getHowManyUsers(sex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    private boolean hasUser(){
        for(User user: allUsers.values()){
            if(user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
