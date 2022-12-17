package Products;

import java.util.Objects;

public class Product {
    private final String nameProducts;
    private int price;
    private int num;
    private boolean check;

    public Product(String nameProducts, int price, int num) {
        if (nameProducts == null || nameProducts.isEmpty() || price <= 0 || num <= 0) {
            throw new IllegalArgumentException("Введите корректные данные");
        }
        this.nameProducts = nameProducts;
        this.price = price;
        this.num = num;
        this.check = false;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public int getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public boolean isCheck() {
        return check;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && num == product.num && check == product.check && Objects.equals(nameProducts, product.nameProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts, price, num, check);
    }

    @Override
    public String toString() {
        return nameProducts + '\'' +
                ", цена=" + price + " р." +
                ", количество=" + num +
                ", товар куплен=" + check;
    }
}
