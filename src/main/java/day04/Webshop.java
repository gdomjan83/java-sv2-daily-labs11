package day04;

import java.util.ArrayList;
import java.util.List;

public class Webshop {
    private List<Item> itemsOnSlale;
    private List<User> registeredUsers;

    public Webshop(List<Item> itemsOnSlale, List<User> registeredUsers) {
        this.itemsOnSlale = itemsOnSlale;
        this.registeredUsers = registeredUsers;
    }

    public List<Item> getItemsOnSlale() {
        return new ArrayList<>(itemsOnSlale);
    }

    public List<User> getRegisteredUsers() {
        return new ArrayList<>(registeredUsers);
    }

    public void purchaseItem(String itemName, String userName) {
        findUser(userName).purchaseItem(findItem(itemName));
    }

    private Item findItem(String itemName) {
        for (Item i : itemsOnSlale) {
            if (itemName.equals(i.getName()))
                return i;
        }
        throw new IllegalStateException("Can not find item by that name.");
    }

    private User findUser(String userName) {
        for (User u : registeredUsers) {
            if (userName.equals(u.getUserName()))
                return u;
        }
        throw new IllegalStateException("Can not find user by that name.");
    }
}
