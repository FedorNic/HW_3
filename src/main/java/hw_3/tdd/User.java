package hw_3.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}' + '\n';
    }

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Функция входа в систему для пользователя
     * @param name - имя пользователя
     * @param password - пароль пользователя
     * @return - возвращает успешную/ не успешную аутентификацию
     */
    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            this.isAuthenticate = true;
            return true;
        } else {
            this.isAuthenticate = false;
            return false;
        }
    }
}