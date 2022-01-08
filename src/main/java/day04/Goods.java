package day04;

import java.time.LocalDate;

public class Goods extends Item {
    private LocalDate dateOfExpiry;

    public Goods(String name, int price, boolean purchased) {
        super(name, price, purchased);
    }

    @Override
    public LocalDate getDateOfExpiry() {
        if (isPurchased()) {
            return dateOfExpiry;
        } else {
            return LocalDate.now().plusMonths(3);
        }
    }

    @Override
    public void setDefaultWarranty() {
        this.dateOfExpiry = LocalDate.now().plusMonths(3);
    }

    @Override
    public Item makeCopyOfItem() {
        String itemName = name;
        int itemPrice = price;
        return new Goods(itemName, itemPrice, true);
    }

    @Override
    public void setExtendedWarranty() {
        int newPrice = (int) (price * 1.1);
        setPrice(newPrice);
        dateOfExpiry = LocalDate.now().plusYears(3);
    }
}
