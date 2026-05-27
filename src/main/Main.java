
// Luis Angel Araujo Solarte
//Jorge Gutierrez

package main;

import entities.*;
import services.*;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ServicePerson servicePerson =
            new ServicePerson();

    static ServiceService serviceService =
            new ServiceService();

    static ServicesAppointment servicesAppointment =
            new ServicesAppointment();

    public static void main(String[] args) {

        menu();
    }


    public static void menu() {

        int option;

        do {

            System.out.println("\n===== PETVET =====");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Crear Servicio Basico");
            System.out.println("3. Crear Servicio Especializado");
            System.out.println("4. Agendar Cita");
            System.out.println("5. Cancelar Cita");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            option = sc.nextInt();
            sc.nextLine();

            try {

                switch(option) {

                    case 1:

                        registerPerson();
                        break;

                    case 2:

                        createBasicService();
                        break;

                    case 3:
                        createSpecializedService();
                        break;

                    case 4:
                        schedule();
                        break;

                    case 5:
                        CancelAppointment();
                        break;

                    case 0:
                        System.out.println("Sistema finalizado");
                        break;

                    default:

                        System.out.println("Opcion invalida");
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        } while(option != 0);
    }


    public static void registerPerson()
            throws Exception {

        System.out.println("Id:");
        String id = sc.nextLine();

        System.out.println("Nombre:");
        String name = sc.nextLine();

        System.out.println("Apellido:");
        String lastname = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Telefono:");
        String phone = sc.nextLine();

        System.out.println("Direccion:");
        String address = sc.nextLine();

        // PET

        System.out.println("Nombre Mascota:");
        String petName = sc.nextLine();

        System.out.println("Especie:");
        String species = sc.nextLine();

        System.out.println("Raza:");
        String breed = sc.nextLine();

        System.out.println("Edad:");
        int age = sc.nextInt();
        sc.nextLine();

        EntitiesPet pet =
                new EntitiesPet(
                        petName,
                        age,
                        breed,
                        species
                );

        EntitiesPerson person =
                new EntitiesPerson(
                        id,
                        name,
                        lastname,
                        email,
                        phone,
                        address,
                        pet
                );

        servicePerson.register(person);

        System.out.println(
                "Persona registrada correctamente"
        );
    }

    public static void createBasicService()
            throws Exception {

        System.out.println("Codigo:");
        String code = sc.nextLine();

        System.out.println("Nombre:");
        String name = sc.nextLine();

        System.out.println("Precio Base:");
        double basePrice = sc.nextDouble();

        System.out.println("Cupos Totales:");
        int totalQuota = sc.nextInt();

        System.out.println("Duracion:");
        int duration = sc.nextInt();

        System.out.println("Certificado true/false:");
        boolean certificate = sc.nextBoolean();
        sc.nextLine();

        EntitiesBasicServices service =
                new EntitiesBasicServices(
                        code,
                        totalQuota,
                        totalQuota,
                        basePrice,
                        name,
                        duration,
                        certificate
                ) {};

        serviceService.register(service);

        System.out.println(
                "Servicio basico creado"
        );
    }

    public static void createSpecializedService()
            throws Exception {

        System.out.println("Codigo:");
        String code = sc.nextLine();

        System.out.println("Nombre:");
        String name = sc.nextLine();

        System.out.println("Precio Base:");
        double basePrice = sc.nextDouble();

        System.out.println("Cupos Totales:");
        int totalQuota = sc.nextInt();
        sc.nextLine();

        System.out.println("Especialidad:");
        String specialty = sc.nextLine();

        System.out.println("Cargo Extra:");
        double extra = sc.nextDouble();

        System.out.println("Examenes true/false:");
        boolean exams = sc.nextBoolean();
        sc.nextLine();

        EntitiesSpecialiServices service =
                new EntitiesSpecialiServices(
                        code,
                        totalQuota,
                        totalQuota,
                        basePrice,
                        name,
                        specialty,
                        extra,
                        exams
                );

        serviceService.register(service);

        System.out.println(
                "Servicio especializado creado"
        );
    }

    public static void schedule()
            throws Exception {

        System.out.println("Codigo cita:");
        String code = sc.nextLine();

        System.out.println("Id persona:");
        String id = sc.nextLine();

        System.out.println("Codigo servicio:");
        String serviceCode = sc.nextLine();

        EntitiesService service =
                serviceService.search(serviceCode);

        if(service == null) {

            throw new Exception(
                    "Servicio no encontrado");
        }

        System.out.println("Cantidad cupos:");
        int amount = sc.nextInt();
        sc.nextLine();

        EntitiesPerson person = null;

        servicesAppointment.agend(
                code,
                person,
                service,
                amount
        );

        System.out.println(
                "Cita agendada correctamente"
        );
    }


    public static void CancelAppointment()
            throws Exception {

        System.out.println("Codigo cita:");
        String code = sc.nextLine();

        servicesAppointment.cancel(code);

        System.out.println(
                "Cita cancelada correctamente"
        );
    }
}