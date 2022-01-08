package day04;

import java.time.LocalDate;

public class Services extends Item {
    private LocalDate dateOfExpiry;

    public Services(String name, int price, boolean purchased) {
        super(name, price, purchased);
    }

    @Override
    public LocalDate getDateOfExpiry() {
        if (isPurchased()) {
            return dateOfExpiry;
        } else {
            return LocalDate.now().plusYears(1);
        }
    }

    @Override
    public void setDefaultWarranty() {
        this.dateOfExpiry = LocalDate.now().plusYears(1);
    }

    @Override
    public Item makeCopyOfItem() {
        String itemName = name;
        int itemPrice = price;
        return new Services(itemName, itemPrice, true);
    }

    @Override
    public void setExtendedWarranty() {
        //doesn't do anything, but has to be implemented
    }
}
