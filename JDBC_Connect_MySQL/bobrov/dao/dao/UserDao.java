package bobrov.dao.dao;


import bobrov.dao.bean.User;
import bobrov.dao.exception.DBException;
import bobrov.dao.exception.NotUniqueUserEmailException;
import bobrov.dao.exception.NotUniqueUserLoginException;

import java.util.List;

public interface UserDao {


    public List<User> selectAll() throws DBException;

    public int deleteById(int id) throws DBException;

    public void insert(User user) throws DBException, NotUniqueUserLoginException, NotUniqueUserEmailException;

}

