package com.saneth.saneth.repositories;

import com.saneth.saneth.model.RegistrationModel;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

public interface RegistrationRepositorie extends JpaRepository<User, Long> {

}
