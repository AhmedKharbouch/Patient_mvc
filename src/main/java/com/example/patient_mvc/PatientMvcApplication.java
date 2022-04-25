package com.example.patient_mvc;

import com.example.patient_mvc.entities.Patient;
import com.example.patient_mvc.repositories.PatientRepository;
import com.example.patient_mvc.security.service.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){

        return args -> {

           patientRepository.save(new Patient(null,"ahmed",new Date(),false,12));
            patientRepository.save(new Patient(null,"hassan",new Date(),true,50));
            patientRepository.save(new Patient(null,"yassmine",new Date(),false,600));
            patientRepository.save(new Patient(null,"houda",new Date(),true,25));


            patientRepository.findAll().forEach(p->{

                System.out.println(p.getNom());

            });



        };


    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }


    //@Bean
     CommandLineRunner saveUsers(SecurityService securityService){

        return args -> {
            securityService.saveNewUser("user1","2345","2345");
            securityService.saveNewUser("reda","1234","1234");
            securityService.saveNewUser("leila","1234","1234");

            securityService.saveNewRole("USER","");
            securityService.saveNewRole("ADMIN","");

            securityService.addRoleToUser("user1","ADMIN");
            securityService.addRoleToUser("user1","USER");
            securityService.addRoleToUser("reda","USER");
            securityService.addRoleToUser("leila","USER");

        };
    }


}
