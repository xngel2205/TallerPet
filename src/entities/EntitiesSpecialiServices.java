package entities;

public class EntitiesSpecialiServices extends EntitiesService{

    private String specialty;
    private boolean exams;
    private double chargeExtra;

    public EntitiesSpecialiServices(String code, int quotaRemaining, int totalquota, double baseprice, String name, String specialty, double chargeExtra, boolean exams) {
        super(code, quotaRemaining, totalquota, baseprice, name);
        this.specialty = specialty;
        this.chargeExtra = chargeExtra;
        this.exams = exams;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isExams() {
        return exams;
    }

    public void setExams(boolean exams) {
        this.exams = exams;
    }

    public double getChargeExtra() {
        return chargeExtra;
    }

    public void setChargeExtra(double chargeExtra) {
        this.chargeExtra = chargeExtra;
    }

    @Override
    public double CalculateFinalPrice() {
        return getBaseprice() + chargeExtra;
    }
}
