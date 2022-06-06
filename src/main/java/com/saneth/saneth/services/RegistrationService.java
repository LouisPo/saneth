package com.saneth.saneth.services;


import com.saneth.saneth.repositories.RegistrationRepositorie;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class RegistrationService {


    private final RegistrationRepositorie registrationrepositorie;

}
