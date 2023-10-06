package com.example.cleanarch.application.usecases;

import com.example.cleanarch.application.gateways.UserGateway;
import com.example.cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }

}
