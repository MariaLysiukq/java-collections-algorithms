package ua.opnu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        List<String> list1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        task.removeShorterStrings(list1);
        System.out.println("Task 1: " + list1);
        List<String> list1Odd = new ArrayList<>(Arrays.asList("Don't", "remove", "the", "last", "string (me)"));
        task.removeShorterStrings(list1Odd);
        System.out.println("Task 1 (odd size): " + list1Odd);
        List<String> list2 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
        task.stutter(list2);
        System.out.println("Task 2: " + list2);
        List<String> list2Empty = new ArrayList<>();
        task.stutter(list2Empty);
        System.out.println("Task 2 (empty): " + list2Empty);
        List<String> list3 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        task.switchPairs(list3);
        System.out.println("Task 3: " + list3);
        List<String> list3Odd = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
        task.switchPairs(list3Odd);
        System.out.println("Task 3 (odd size): " + list3Odd);
        List<String> list4 = new ArrayList<>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        task.removeDuplicates(list4);
        System.out.println("Task 4: " + list4);
        List<String> list4Same = new ArrayList<>(Arrays.asList("a", "a", "a", "a"));
        task.removeDuplicates(list4Same);
        System.out.println("Task 4 (all same): " + list4Same);
        List<String> list5 = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        task.markLength4(list5);
        System.out.println("Task 5: " + list5);
        List<String> list5Stars = new ArrayList<>(Arrays.asList("****", "abc"));
        task.markLength4(list5Stars);
        System.out.println("Task 5 (already stars): " + list5Stars);
        Queue<Integer> queue6 = new LinkedList<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
        System.out.println("Task 6: " + task.isPalindrome(queue6) + " " + queue6);
        Queue<Integer> queue6Not = new LinkedList<>(Arrays.asList(3, 8, 17, 9, 4, 17, 8, 3));
        System.out.println("Task 6 (not palindrome): " + task.isPalindrome(queue6Not) + " " + queue6Not);
        Queue<Integer> queue6Empty = new LinkedList<>();
        System.out.println("Task 6 (empty): " + task.isPalindrome(queue6Empty) + " " + queue6Empty);
        Queue<Integer> queue7 = new LinkedList<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
        task.reorder(queue7);
        System.out.println("Task 7: " + queue7);
        Queue<Integer> queue7Negative = new LinkedList<>(Arrays.asList(0, -1, -3, -7));
        task.reorder(queue7Negative);
        System.out.println("Task 7 (zero and negatives): " + queue7Negative);
        Queue<Integer> queue8 = new LinkedList<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
        task.rearrange(queue8);
        System.out.println("Task 8: " + queue8);
        Queue<Integer> queue8Negative = new LinkedList<>(Arrays.asList(-3, -2, 7, 0, -5, 10));
        task.rearrange(queue8Negative);
        System.out.println("Task 8 (negatives): " + queue8Negative);
    }

    public void removeShorterStrings(List<String> list) {
        for (int i = 0; i + 1 < list.size(); i++) {
            if (list.get(i).length() <= list.get(i + 1).length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
            }
        }
    }

    public void stutter(List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
    }

    public void switchPairs(List<String> list) {
        for (int i = 0; i + 1 < list.size(); i += 2) {
            list.set(i, list.set(i + 1, list.get(i)));
        }
    }

    public void removeDuplicates(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }
        }
    }

    public void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }

    public boolean isPalindrome(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            stack.push(value);
            queue.add(value);
        }
        boolean palindrome = true;
        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (!value.equals(stack.pop())) {
                palindrome = false;
            }
            queue.add(value);
        }
        return palindrome;
    }

    public void reorder(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (value < 0) {
                stack.push(value);
            } else {
                queue.add(value);
            }
        }
        int nonNegativeCount = queue.size();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < nonNegativeCount; i++) {
            queue.add(queue.remove());
        }
    }

    public void rearrange(Queue<Integer> queue) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Integer value = queue.remove();
            if (value % 2 == 0) {
                queue.add(value);
            } else {
                stack.push(value);
            }
        }
        int evenCount = queue.size();
        int oddCount = stack.size();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < evenCount; i++) {
            queue.add(queue.remove());
        }
        for (int i = 0; i < oddCount; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public int maxLength(Set<String> set) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return 0;
    }

    public void removeEvenLength(Set<String> set) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
    }

    public int numInCommon(List<Integer> list1, List<Integer> list2) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return 0;
    }

    public boolean isUnique(Map<String, String> map) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return false;
    }

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

    public Map<String, Integer> reverse(Map<Integer, String> map) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

    public int rarest(Map<String, Integer> map) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return 0;
    }

    public int maxOccurrences(List<Integer> list) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return 0;
    }

}
