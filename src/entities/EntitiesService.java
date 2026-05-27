package entities;

public abstract class EntitiesService {

    private String code;
    private String name;
    private double baseprice;
    private int totalquota;
    private int quotaRemaining;

    public EntitiesService(String code, int quotaRemaining, int totalquota, double baseprice, String name) {
        this.code = code;
        this.quotaRemaining = quotaRemaining;
        this.totalquota = totalquota;
        this.baseprice = baseprice;
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public int getTotalquota() {
        return totalquota;
    }

    public void setTotalquota(int totalquota) {
        this.totalquota = totalquota;
    }

    public void DecreaseQuota(int amount) {
        quotaRemaining -= amount;
    }

    public void IncreaseQuota(int amount) {
        quotaRemaining += amount;
    }

    public abstract double CalculateFinalPrice();
}
