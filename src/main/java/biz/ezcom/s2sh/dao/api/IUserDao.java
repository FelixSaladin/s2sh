package biz.ezcom.s2sh.dao.api;

import java.util.List;

import biz.ezcom.s2sh.po.User;

public interface IUserDao {
    void saveUser(User user);

    List<User> findAllUsers();

    void removeUser(User user);

    void update(User user);

    User findUserById(int id);
}
