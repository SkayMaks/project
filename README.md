# Autotests API

## Реализовано 2 класса
### **Позитивное тестирование** - positiveTesting.java
      getUser() - GET запрос
      postUser() - POST запрос
      putUser() - PUT запрос
      deleteUser() - DELETE запрос

### **Негативное тестирование** - negativeTesting.java
      getUser() - GET запрос проверка на ошибку 404
      postUser() - POST запрос проверка на ошибку 405
      putUser() - PUT запрос проверка на ошибку 404
      deleteUser() - DELETE запрос проверка на ошибку 404

### **Впомогательный класс** - добавление и удаление пользователя при запуске тестов

### **POJO объект User** - простой Java-объект 
# Запуск тустов
      Развернуть проект и запустить тесты