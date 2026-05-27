package services;

import entities.EntitiesService;
import repository.RepositoryServices;

public class ServiceService {

   private RepositoryServices repository = new RepositoryServices();

   public void register(EntitiesService service)
       throws Exception {
       if(repository.search(service.getCode()) != null) {
           throw new Exception(
                   "Ya existe un servicio con ese código");
       }
       if(service.getBaseprice() <= 0) {

           throw new Exception(
                   "El precio debe ser mayor a cero");
       }

       if(service.getTotalquota() <= 0) {

           throw new Exception(
                   "Los cupos deben ser mayores a cero");
       }
       repository.save(service);
   }
    public EntitiesService search(String code) {
        return repository.search(code);
    }
}
