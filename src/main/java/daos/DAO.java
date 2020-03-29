package daos;

import com.sun.jdi.connect.Connector;
import interfaces.DTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
/**
public class DAO implements interfaces.DAO {

    public DTO findById(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
            if(rs.next())
            {
                return extractDTOfromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }


    public List findAll() {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            Set users = new HashSet();
            while(rs.next())
            {
                User user = extractUserFromResultSet(rs);
                users.add(user);
            }
            return users;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public DTO update(Object dto) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE user SET name=?, pass=?, age=? WHERE id=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getPass());
            ps.setInt(3, user.getAge());
            ps.setInt(4, user.getId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public DTO create(Object dto) {
        Connector connector = new Connector();
        Connection connection = connector.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getPass());
            ps.setInt(3, user.getAge());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void delete(int id) {

    }   Connector connector = new Connector();
    Connection connection = connector.getConnection();
        try {
        Statement stmt = connection.createStatement();
        int i = stmt.executeUpdate("DELETE FROM user WHERE id=" + id);
        if(i == 1) {
            return true;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
        return false;
}
*/

