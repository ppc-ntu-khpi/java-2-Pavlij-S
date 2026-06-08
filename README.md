# Практична робота "Створення і використання статичних методів"

Цей репозиторій містить стартовий код для виконання практичної роботи, який демонструє структуру проєкту для завдань обчислювального характеру.

---

## 📘 Обране завдання
**Завдання 13:** Зашифрувати задану фразу шифром Цезаря з величиною зсуву *N*.

### 🔑 Суть методу
Шифр Цезаря — це класичний метод шифрування, де кожна літера замінюється іншою, що знаходиться на *N* позицій далі в алфавіті.  
- Літери латинського алфавіту зсуваються з урахуванням регістру.  
- Пробіли та символи, що не є буквами, залишаються без змін.
  
<img width="330" height="139" alt="image" src="https://github.com/user-attachments/assets/e21dc1eb-677d-4ff0-9498-6122e3bb8900" />

---

## ⚙️ Реалізація
Метод `Exercise.Calculate(String phrase, int shift)` приймає текст та величину зсуву і повертає зашифрований рядок.

```java
public class Exercise {
    // Зашифровать фразу шифром Цезаря
    public static String Calculate(String phrase, int shift) {
        if (phrase == null) {
            return null;
        }

        int normalizedShift = shift % 26;
        if (normalizedShift < 0) {
            normalizedShift += 26;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char encrypted = (char) ('A' + (c - 'A' + normalizedShift) % 26);
                result.append(encrypted);
            } else if (c >= 'a' && c <= 'z') {
                char encrypted = (char) ('a' + (c - 'a' + normalizedShift) % 26);
                result.append(encrypted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
```
Клас `TestResult` виводить результат:
```java
public class TestResult {
    public static void main(String[] args) {
        String phrase = "Hello, World!";
        int shift = 3;

        System.out.println("Original phrase: " + phrase);
        System.out.println("Shift: " + shift);
        System.out.println("Encrypted phrase: " + Exercise.Calculate(phrase, shift));
    }
}
```
## 🧩 Приклад запуску

Вхідні дані:
```
Original phrase: Hello, World!
Shift: 3
```
Результат:
```
Encrypted phrase: Khoor, Zruog!
```
