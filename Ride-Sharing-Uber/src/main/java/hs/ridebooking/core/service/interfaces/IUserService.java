package hs.ridebooking.core.service.interfaces;

import hs.ridebooking.core.entity.UserEntity;

import java.util.List;

public interface IUserService  {
    UserEntity createUser(UserEntity userEntity);
    UserEntity getUserById(Long id);

    List<UserEntity> findAllUser();
}
