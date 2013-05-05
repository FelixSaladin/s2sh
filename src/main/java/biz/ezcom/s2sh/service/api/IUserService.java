package biz.ezcom.s2sh.service.api;

import java.util.List;

import biz.ezcom.s2sh.po.User;

public interface IUserService {
    void saveUser(User user);

    List<User> findAllUsers();

    void delete(User user);

    void updateUser(User user);

    User findUserById(int id);
}
