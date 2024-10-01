//package com.example.lab3;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import jakarta.validation.Valid; // Изменено
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api")
//@Validated
//public class AdditionalApiController {
//
//    // 1. Простое приветствие
//    @GetMapping("/greet")
//    public String greet() {
//        return "Hello, World!";
//    }
//
//    // 2. Приветствие с параметром
//    @GetMapping("/greetWithName")
//    public String greetWithName(@RequestParam(defaultValue = "Guest") String name) {
//        return "Hello, " + name + "!";
//    }
//
//    // 3. Обработка JSON в POST запросе
//    @PostMapping("/books")
//    public ResponseEntity<Map<String, String>> receiveBook(@RequestBody Map<String, String> book) {
//        Map<String, String> response = new HashMap<>(book);
//        response.put("status", "received");
//        return ResponseEntity.ok(response);
//    }
//
//    // 4. Использование переменных пути
//    @GetMapping("/user/{id}")
//    public String getUser(@PathVariable String id) {
//        return "User with ID " + id + " found.";
//    }
//
//    // 5. Обновление информации о пользователе
//    @PutMapping("/user/{id}")
//    public String updateUser(@PathVariable String id, @RequestBody User user) {
//        return "User with ID " + id + " has been updated.";
//    }
//
//    // 6. Удаление пользователя
//    @DeleteMapping("/user/{id}")
//    public String deleteUser(@PathVariable String id) {
//        return "User with ID " + id + " has been deleted.";
//    }
//
//    // 7. Валидация пользовательских данных
//    @PostMapping("/createUser")
//    public ResponseEntity<String> createUser(@Valid @RequestBody User user) {
//        return ResponseEntity.ok("User " + user.getName() + " created successfully.");
//    }
//
//    // 8. Обработка ошибок
//    @GetMapping("/error")
//    public void throwError() {
//        throw new RuntimeException("This is a test exception.");
//    }
//}
