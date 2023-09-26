import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    private User user;
    private User user1;
    private User user2;

    private User userNotAdd;
    private User userNotAdd1;

    @Before
    public void setUp() {
        user = new User("Евгений", 35, Sex.MALE);
        user1 = new User("Марина", 34, Sex.FEMALE);
        user2 = new User("Алина", 7, Sex.FEMALE);

        userNotAdd = new User("", 0, null);
        userNotAdd1 = new User(null, 0, null);
    }

    @Test
    public void getAllUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expectedList = User.getAllUsers();

        List<User> actualList = new ArrayList<>();
        actualList.add(user);
        actualList.add(user1);
        actualList.add(user2);

        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void getAllUsers_NO_NULL(){
        List<User> expectedList = User.getAllUsers();
        Assert.assertNotNull(expectedList);
    }

    @Test
    public void getAllUser_MALE(){
        List<User> expected = User.getAllUsers(Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllUser_MALE_NO_NULL(){
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUser_FEMALE(){
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAllUser_FEMALE_NO_NULL(){
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();
        int actual = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        int expected = User.getHowManyUsers(Sex.FEMALE);
        int actual = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_MALE() {
        int expected = User.getHowManyUsers(Sex.MALE);
        int actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        int sumAgesExpected = User.getAllAgeUsers();
        int sumAgesActual = 34+35+7;
        Assert.assertEquals(sumAgesExpected,sumAgesActual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        int sumAgesExpected = User.getAllAgeUsers(Sex.MALE);
        int sumAgesActual = 35;
        Assert.assertEquals(sumAgesExpected,sumAgesActual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        int sumAgesExpected = User.getAllAgeUsers(Sex.FEMALE);
        int sumAgesActual = 34+7;
        Assert.assertEquals(sumAgesExpected,sumAgesActual);
    }


    @Test
    public void getAverageAgeOfAllUsers() {
        int expected = User.getAverageAgeOfAllUsers();
        int actual = (34+35+7)/3;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAverageAgeOfAllUsers_FEMALE() {
        int expected = User.getAverageAgeOfAllUsers(Sex.FEMALE);
        int actual = (34+7)/2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAverageAgeOfAllUsers_MALE() {
        int expected = User.getAverageAgeOfAllUsers(Sex.MALE);
        int actual = 35;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void newUser_EMPTY_NAME(){
        for(User user : User.getAllUsers()){
            if(user.getName() != null && user.getName().isEmpty()){
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }
    }

    @Test
    public void newUser_AGE_ZERO(){
        for(User user : User.getAllUsers()){
            if(user.getAge() <= 0){
                Assert.fail("Попытка создания пользователя с недопустимым возврастом");
            }
        }
    }

    @Test
    public void newUser_SEX_NO_NULL(){
        for(User user : User.getAllUsers()){
            if(user.getSex() == null){
                Assert.fail("Попытка создания пользователя с указанием пола = null");
            }
        }
    }
}