package entities;

public abstract class EntitiesBasicServices extends EntitiesService {

    private int duration;
    private boolean certificate;

    public EntitiesBasicServices(String code, int quotaRemaining, int totalquota, double baseprice, String name, int duration, boolean certificate) {
        super(code, quotaRemaining, totalquota, baseprice, name);
        this.duration = duration;
        this.certificate = certificate;
    }


    @Override
    public double CalculateFinalPrice() {
        return getBaseprice();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }
}
