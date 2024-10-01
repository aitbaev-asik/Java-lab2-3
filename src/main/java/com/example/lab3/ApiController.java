package com.example.lab3;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Random;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/")
public class ApiController {
    // 1. Время в данное время
    @GetMapping("currentTime")
    public String currentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }


    // 2. Числа от 1 до n
    @GetMapping("api")
    public String numbers(@RequestParam int q) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= q; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // 3. Случайное число от 1 до 500
    @GetMapping("random_number")
    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(500) + 1;
    }

    // 4. n-ое число Фибоначчи
    @GetMapping("fib")
    public int fibonacci(@RequestParam int number) {
        return fib(number);
    }

    private int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    // 5. Обратная строка
    @GetMapping("{string}")
    public String reverseString(@PathVariable String string) {
        return new StringBuilder(string).reverse().toString();
    }
}


