package biz.ezcom.s2sh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import biz.ezcom.s2sh.dao.api.IUserDao;
import biz.ezcom.s2sh.po.User;

public class UserDao extends HibernateDaoSupport implements IUserDao {
    @Override
    public void saveUser(final User user) {
        this.getHibernateTemplate().save(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAllUsers() {
        final String hql = "from User user order by user.id desc";
        return this.getHibernateTemplate().find(hql);
    }

    @Override
    public void removeUser(final User user) {
        this.getHibernateTemplate().delete(user);
    }

    @Override
    public void update(final User user) {
        this.getHibernateTemplate().update(user);
    }

    @Override
    public User findUserById(final int id) {
        return this.getHibernateTemplate().get(User.class, id);
    }
}
