package at.schuster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestRandomNumberGeneratorController {

    @Test
    public void test_randomNumber_validNumber() {
        //Arrange
        RandomNumberGeneratorController rc = new RandomNumberGeneratorController();
        //Act
        int result = rc.getRandomNumber();
        //Assert
        Assertions.assertEquals(true, result < 600 && result > 500);
    }

    @Test
    public void test_randomNumber_invalidNumber() {
        //Arrange
        RandomNumberGeneratorController rc = new RandomNumberGeneratorController();
        //Act
        int result = rc.getRandomNumber();
        //Assert
        Assertions.assertEquals(false, result < 500 || result > 600);
    }

}
