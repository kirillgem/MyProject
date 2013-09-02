package bobrov.dao;



import bobrov.dao.bean.User;
import bobrov.dao.dao.UserDao;
import bobrov.dao.dao.impl.UserDaoJdbc;
import bobrov.dao.exception.DBException;

public class SimpleTest {

    public static void main(String[] args) throws DBException {
        UserDao dao = new UserDaoJdbc();
        System.out.println("ALL CURRENT USERS:");
        for (User user : dao.selectAll()) {
            System.out.println("    " + user.toString());
        }

        System.out.println("DELETE:");
        for (User user : dao.selectAll()) {
            dao.deleteById(user.getId());
            System.out.println("    User with id = " + user.getId() + " deleted");
        }

        System.out.println("INSERT NEW:");
        dao.insert(newUser(1, "Petr", "pot@ag.com"));
        System.out.println("    'Petr' inserted");
        dao.insert(newUser(2, "Eva", "yan@bon.com"));
        System.out.println("    'Eva' inserted");
        dao.insert(newUser(3, "Varta", "zak@xop.com"));
        System.out.println("    'Varta' inserted");

        System.out.println("ALL CURRENT USERS:");
        for (User user : dao.selectAll()) {
            System.out.println("    " + user.toString());
        }
    }

    public static User newUser(int id, String login, String email) {
        User result = new User(id);
        result.setLogin(login);
        result.setEmail(email);
        return result;
    }
}
