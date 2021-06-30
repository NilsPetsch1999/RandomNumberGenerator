import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test_Given_WeWantToSeeAWelcomeMessage_When_WeGetTheMessage_Then_TheMassageShouldBeHelloRandomNumberGenerator(){

        //arrange
        //act
        String actual = Main.GetMassage();

        //assert
        Assertions.assertEquals("Hello Random Number Generator", actual);


    }
}
