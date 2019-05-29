import models.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    public User pibe = new User();

    public void setUp(){
        pibe.setName("Max Guampa");
        pibe.setDni("35177989");
        pibe.setTel("666666666");
    }

    @Test
    public void userUnitTest(){
        Assert.assertEquals("Assertion by Name",pibe.getName(),pibe.getName());
    }
}
