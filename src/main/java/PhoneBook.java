import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    public Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name))
            phoneBook.put(name, phoneNumber);

        return phoneBook.size();
    }

    public String findByNumber(String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber))
                return entry.getKey();
        }
        return null;
    }

    public String findByName(String name) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name))
                return entry.getValue();
        }
        return null;
    }

    public List<String> printAllNames() {
        List<String> listOfNames = new LinkedList<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            listOfNames.add(entry.getKey());
            System.out.println(entry.getKey());
        }
        return listOfNames;
    }
}