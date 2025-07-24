package hs.ridebooking.core.service.interfaces.Impl;

import hs.ridebooking.core.entity.UserEntity;
import hs.ridebooking.core.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserEntity> findAllUser() {
        return List.of();
    }
}
