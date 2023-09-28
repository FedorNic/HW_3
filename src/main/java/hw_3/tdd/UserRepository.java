package hw_3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    public List<User> data = new ArrayList<>();

    /**
     * Функция добавления пользователей в базу
     */
    public void addUsers() {
        for (int i = 0; i < 7; i++) {
                this.data.add(new User("user " + i, "password " + Math.round(Math.random() * 100000), Math.random() < 0.5));
        }
    }

    /**
     * Поиск пользователя в базе по имени
     * @param username - искомое имя
     * @return - возвращает результат (есть/нет)
     */
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Функция проверки и разлогинивания не администраторов
     *
     */
    public void kickOutNotAdmin() {
        List<User> copy = new ArrayList<>(data);
        for (User user : copy) {
            if (!user.isAdmin) {
                this.data.remove(user);
            }
        }
    }
}