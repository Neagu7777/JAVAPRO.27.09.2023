

import java.util.Stack;


    /*
     1 уровень сложности: Задачу решить в отдельном проекте

Школьники Вася и Петя играют в шпионов. Вася передает сообщение Пете.
Для этого он разбивает
последовательность букв на пятерки и переворачивает порядок букв в этих пятерках.
Например:
"Привет, мир" ->"(Приве)(т, ми)р" ->"евирпим, тр"


Ваша задача, используя Stack восстановить последовательность букв
(можно не составлять строку,
достаточно буквы по одной выводить на экран


2 уровень сложности:
     */

public class SpyMessageDecoder1 {
    public static void main(String[] args) {
        String encodedMessage = "евирпим, тр";

        Stack<Character> stack = new Stack<>();
        for (char c : encodedMessage.toCharArray()) {

                stack.push(c);// Добавляем буквы в стек
            if (stack.size() == 5) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }

            }


// Выводим оставшиеся буквы, если есть

            while (!stack.isEmpty()) {

                System.out.print(stack.pop());
            }

        }
    }



