package com.example.sistemaagendamientocitas.user.infrastructure.persistence.repository;

import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.domain.repository.UserRepository;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.UserEntity;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.mapper.UserEntityMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserJpaRepository implements UserRepository {

    private final SpringRepositoryPersistence springRepositoryPersistence;

    public UserJpaRepository(SpringRepositoryPersistence springRepositoryPersistence) {
        this.springRepositoryPersistence = springRepositoryPersistence;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = springRepositoryPersistence.save(UserEntityMapper.toEntity(user));
        return UserEntityMapper.toDomain(userEntity);
    }

    @Override
    public Optional<User> findById(Long id) {
        Optional<UserEntity> userEntity = springRepositoryPersistence.findById(id);
        return userEntity.map(UserEntityMapper::toDomain);
    }
}
