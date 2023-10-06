package com.example.cleanarch.main;

import com.example.cleanarch.application.gateways.UserGateway;
import com.example.cleanarch.application.usecases.CreateUserInteractor;
import com.example.cleanarch.infrastructure.controllers.UserDTOMapper;
import com.example.cleanarch.infrastructure.gateways.UserEntityMapper;
import com.example.cleanarch.infrastructure.gateways.UserRepositoryGateway;
import com.example.cleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }

}
