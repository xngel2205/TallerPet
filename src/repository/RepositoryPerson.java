package repository;

import entities.EntitiesPerson;
import entities.EntitiesService;

import java.util.ArrayList;

public class RepositoryPerson {

    private ArrayList<EntitiesPerson> list = new ArrayList<>();

    public void save(EntitiesPerson p) {
        list.add(p);
    }
    public EntitiesPerson search(String id) {

        for(EntitiesPerson p : list) {

            if(p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    public ArrayList<EntitiesPerson> listar() {
        return list;
    }


}
