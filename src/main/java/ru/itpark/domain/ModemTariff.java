package ru.itpark.domain;

public class ModemTariff extends Tariff {
private String internet;

    public ModemTariff(int id, String name, String description, int price, String internet) {
        super(id, name, description, price);
        this.internet = internet;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
