package day04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Item> itemPurchased = new ArrayList<>();
    private int money;

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public List<Item> getItemsPurchased() {
        return new ArrayList<>(itemPurchased);
    }

    public int getMoney() {
        return money;
    }

    public void purchaseItem(Item item) {
        if (hasEnoughMoneyForPurchase(item)) {
            Item purchasedItem = getPurchasedItem(item);
            itemPurchased.add(purchasedItem);
            money -= purchasedItem.getPrice();
        } else {
            throw new IllegalStateException("Not enough money.");
        }
    }

    private boolean hasEnoughMoneyForPurchase (Item item) {
        return item.getPrice() <= money;
    }

    private boolean canAffordExtendedWarranty(Item item) {
        return item.getPrice() * 3 <= money;
    }

    private Item getPurchasedItem(Item item) {
        Item newItem = item.makeCopyOfItem();
        if (canAffordExtendedWarranty(newItem)) {
            newItem.setExtendedWarranty();
        } else {
            newItem.setDefaultWarranty();
        }
        return newItem;
    }
}
