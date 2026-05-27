package repository;

import entities.EntitiesAppointment;
import java.util.ArrayList;

public class RepositoryAppointment {
    private ArrayList<EntitiesAppointment> list = new ArrayList<>();

    public void save(EntitiesAppointment appointment) {
        list.add(appointment);
    }

    public EntitiesAppointment search(String code) {

        for(EntitiesAppointment a : list) {

            if(a.getCode().equals(code)) {
                return a;
            }
        }

        return null;
    }

    public ArrayList<EntitiesAppointment> listar() {
        return list;
    }
}

