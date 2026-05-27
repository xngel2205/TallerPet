package services;

import entities.EntitiesAppointment;
import entities.EntitiesPerson;
import entities.EntitiesService;
import repository.RepositoryAppointment;

public class ServicesAppointment {

    private RepositoryAppointment repository =
            new RepositoryAppointment();

    public void agend(String code,
                      EntitiesPerson person,
                      EntitiesService service,
                      int amount)
            throws Exception {

        if(repository.search(code) != null) {

            throw new Exception(
                    "Ya existe una cita con ese código");
        }

        if(amount < 1 || amount > 3) {

            throw new Exception(
                    "Solo se permiten entre 1 y 3 cupos");
        }

        if(service.getQuotaRemaining() < amount) {

            throw new Exception(
                    "No hay cupos disponibles");
        }

        service.DecreaseQuota(amount);

        EntitiesAppointment appointment =
                new EntitiesAppointment(
                        code,
                        person,
                        service,
                        amount
                );

        repository.save(appointment);

        System.out.println("Cita registrada");
    }

    public void cancel(String code)
            throws Exception {

        EntitiesAppointment appointment =
                repository.search(code);

        if(appointment == null) {

            throw new Exception(
                    "Cita no encontrada");
        }

        appointment.cancel();

        appointment.getService()
                .IncreaseQuota(
                        appointment.getQuantityQuota()
                );

        System.out.println("Cita cancelada");
    }
}

