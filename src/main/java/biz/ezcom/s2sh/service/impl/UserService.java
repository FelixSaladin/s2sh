package biz.ezcom.s2sh.service.impl;

import java.util.List;

import biz.ezcom.s2sh.dao.api.IUserDao;
import biz.ezcom.s2sh.po.User;
import biz.ezcom.s2sh.service.api.IUserService;

public class UserService implements IUserService {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return this.userDao;
    }

    public void setUserDao(final IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(final User user) {
        this.userDao.saveUser(user);
    }

    @Override
    public List<User> findAllUsers() {
        return this.userDao.findAllUsers();
    }

    @Override
    public void delete(final User user) {
        this.userDao.removeUser(user);
    }

    @Override
    public void updateUser(final User user) {
        this.userDao.update(user);
    }

    @Override
    public User findUserById(final int id) {
        return this.userDao.findUserById(id);
    }
}
