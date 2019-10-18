public class PhoneTariff extends Tariff {
    private String minutesQuantity;
    private int cashback;
    private int sms;
    private String features;
    private String periodOfPayment;
    private String internet;

    public PhoneTariff(int id, String name, String description, int price, String minutesQuantity, int cashback, int sms, String features, String periodOfPayment, String internet) {
        super(id, name, description, price);
        this.minutesQuantity = minutesQuantity;
        this.cashback = cashback;
        this.sms = sms;
        this.features = features;
        this.periodOfPayment = periodOfPayment;
        this.internet = internet;
    }

    public String getMinutesQuantity() {
        return minutesQuantity;
    }

    public void setMinutesQuantity(String minutesQuantity) {
        this.minutesQuantity = minutesQuantity;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getPeriodOfPayment() {
        return periodOfPayment;
    }

    public void setPeriodOfPayment(String periodOfPayment) {
        this.periodOfPayment = periodOfPayment;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
