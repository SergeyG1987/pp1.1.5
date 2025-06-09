package jm.task.core.jdbc;



import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

        // Добавление 4 пользователей
        userService.saveUser("Alice", "Smith", (byte) 25);
        System.out.println("User с именем — Alice добавлен в базу данных");
        userService.saveUser("Bob", "Johnson", (byte) 30);
        System.out.println("User с именем — Bob добавлен в базу данных");
        userService.saveUser("Charlie", "Brown", (byte) 22);
        System.out.println("User с именем — Charlie добавлен в базу данных");
        userService.saveUser("Diana", "Wilson", (byte) 28);
        System.out.println("User с именем — Diana добавлен в базу данных");

        // Получение всех пользователей
        userService.getAllUsers().forEach(System.out::println);

        // Очистка таблицы
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}