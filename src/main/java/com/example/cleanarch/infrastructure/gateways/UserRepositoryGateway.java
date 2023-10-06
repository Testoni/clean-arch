package com.example.cleanarch.infrastructure.gateways;

import com.example.cleanarch.application.gateways.UserGateway;
import com.example.cleanarch.domain.entity.User;
import com.example.cleanarch.infrastructure.persistence.UserEntity;
import com.example.cleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObject) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObject);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
}
