package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Login;
import com.model.LoginForm;
import com.model.User;
import com.model.UserType;

public class LoginDAO {
	private Connection con;

	public LoginDAO() {
		con = MyConnection.getConnection();
	}

	public Login getLogin(LoginForm loginForm) {
		try {
			/*
			 * think about nullpointer exception of con and stmt and rset
			 */
			String userid = loginForm.getUsername();
			String password = loginForm.getPassword();
			PreparedStatement stmt = con
					.prepareStatement("select logintime,usertype from  login,userdetails where num=(select max(num) from login where userdetails.userid=? and userdetails.password=?)");

			stmt.setString(1, userid);
			stmt.setString(2, password);

			ResultSet rset = stmt.executeQuery();

			if (rset.next()) {
				/*
				 * if we are here it means username and password is valid
				 */
				User user = new User();
				user.setUsername(userid);
				user.setPassword(password);
				user.setUserType(UserType.valueOf(rset.getString(2)));
				Login login = new Login();
				login.setLastLoginTimeStamp(rset.getTimestamp(1));
				login.setUser(user);
				return login;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
