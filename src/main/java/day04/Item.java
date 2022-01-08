package day04;

import java.time.LocalDate;

public abstract class Item {
    protected String name;
    protected int price;
    protected boolean purchased;

    public Item(String name, int price, boolean purchased) {
        this.name = name;
        this.price = price;
        this.purchased = purchased;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void setDefaultWarranty();

    public abstract LocalDate getDateOfExpiry();

    public abstract Item makeCopyOfItem();

    public abstract void setExtendedWarranty();
}
