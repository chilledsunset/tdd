import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    public Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name))
            phoneBook.put(name, phoneNumber);

        return phoneBook.size();
    }
}
