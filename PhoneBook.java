import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public PhoneBook() {
        contacts.put("Alice", "555-1111");
        contacts.put("Bob", "555-2222");
    }

    /**
     * TO-DO: Remove the contact only if the name and number match.
     * \*
     *
     * @param name   The name of the contact to remove.
     * @param number The phone number that must match for the removal to happen.
     * @return true if the contact was removed, false otherwise.
     */
    public boolean removeContact(String name, String number) {
        return contacts.remove(name, number);
    }

    public Map<String, String> getContacts() {
        return contacts;
    }
}