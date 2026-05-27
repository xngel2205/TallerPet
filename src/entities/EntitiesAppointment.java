package entities;

public class EntitiesAppointment {

    private String code;
    private EntitiesPerson person;
    private EntitiesService service;
    private int quantityQuota;
    private double totalPrice;
    private String status;

    public EntitiesAppointment(String code, EntitiesPerson person, EntitiesService service, double totalPrice) {
        this.code = code;
        this.person = person;
        this.service = service;
        this.totalPrice =  service.CalculateFinalPrice() * quantityQuota;
        this.quantityQuota = quantityQuota;
        this.status = "confirmado";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EntitiesPerson getPerson() {
        return person;
    }

    public void setPerson(EntitiesPerson person) {
        this.person = person;
    }

    public EntitiesService getService() {
        return service;
    }

    public void setService(EntitiesService service) {
        this.service = service;
    }

    public int getQuantityQuota() {
        return quantityQuota;
    }

    public void setQuantityQuota(int quantityQuota) {
        this.quantityQuota = quantityQuota;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cancel() {

        status = "Cancelada";
    }
}
