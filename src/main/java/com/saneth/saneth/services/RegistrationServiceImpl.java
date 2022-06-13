package com.saneth.saneth.services;

import com.saneth.saneth.model.RegistrationModel;
import com.saneth.saneth.repositories.RegistrationRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistrationServiceImpl implements RegistrationService{


    @Autowired
    private RegistrationRepositorie registrationRepository;

    public void addUser(RegistrationModel user){
        registrationRepository.save(user);
    }
}
