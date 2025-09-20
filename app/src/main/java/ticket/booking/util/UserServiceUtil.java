package ticket.booking.util;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserServiceUtil {
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        // BCrypt.gensalt() generates a random piece of data called a salt, which is essential for making password hashing secure.
        // if two users have the same password, their stored hashes will be completely different because they were generated with different salts.

    }

    public static boolean checkPassword(String plainPassword,String hashedPassword) {
        return BCrypt.checkpw(plainPassword,hashedPassword);
    }
}
