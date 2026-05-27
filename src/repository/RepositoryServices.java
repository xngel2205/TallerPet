package repository;

import entities.EntitiesService;

import java.util.ArrayList;

public class RepositoryServices {

    private ArrayList<EntitiesService> list = new ArrayList<>();
    public void save(EntitiesService service) {
        list.add(service);
    }

    public EntitiesService search(String code) {
        for(EntitiesService s : list) {
            if(s.getCode().equals(code)) {
                return s;
            }
        }
        return null;
    }
    public ArrayList<EntitiesService> listar() {
        return list;
    }
}
