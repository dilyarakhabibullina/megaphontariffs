public class OtherTariff extends ModemTariff {
    private String OtherFeatures;

    public OtherTariff(int id, String name, String description, int price, String internet, String otherFeatures) {
        super(id, name, description, price, internet);
        OtherFeatures = otherFeatures;
    }

    public String getOtherFeatures() {
        return OtherFeatures;
    }

    public void setOtherFeatures(String otherFeatures) {
        OtherFeatures = otherFeatures;
    }
}
