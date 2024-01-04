package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufectureDate;

    public UsedProduct(String name, Double price, LocalDate manufectureDate) {
        super(name, price);
        this.manufectureDate = manufectureDate;
    }

    public LocalDate getManufectureDate() {
        return manufectureDate;
    }

    public void setManufectureDate(LocalDate manufectureDate) {
        this.manufectureDate = manufectureDate;
    }

    @Override
    public final String priceTag(){
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + dtf.format(manufectureDate) + ")";
    }
}
