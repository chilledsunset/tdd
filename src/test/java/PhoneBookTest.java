import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void startOfTest() {
        System.out.println("Начало теста");
        phoneBook = new PhoneBook();
    }

    @Test
    public void testingAddingSingleContact() {
        //Arrange
        int expected = 1;
        // Act
        int result = phoneBook.add("Григорий", "+79063065548");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testingAddingTwoContacts() {
        //Arrange
        int expected = 2;
        // Act
        phoneBook.add("Григорий", "+79063065548");
        int result = phoneBook.add("Вениамин", "+79272486999");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        // Arrange
        String expected = "Захар";
        phoneBook.add("Вениамин", "+79272486999");
        phoneBook.add("Григорий", "+79063065548");
        phoneBook.add("Захар", "+79172185570");
        // Act
        String result = phoneBook.findByNumber("+79172185570");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByName() {
        // Arrange
        String expected = "+79172185570";
        phoneBook.add("Вениамин", "+79272486999");
        phoneBook.add("Григорий", "+79063065548");
        phoneBook.add("Захар", "+79172185570");
        // Act
        String result = phoneBook.findByName("Захар");
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPrintAllNames() {
        // Arrange
        List<String> expected = Arrays.asList("Вениамин", "Григорий", "Захар");
        phoneBook.add("Вениамин", "+79272486999");
        phoneBook.add("Григорий", "+79063065548");
        phoneBook.add("Захар", "+79172185570");
        // Act
        List<String> result = phoneBook.printAllNames();
        // Assert
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    public void endOfTest() {
        System.out.println("Конец теста");
    }
}