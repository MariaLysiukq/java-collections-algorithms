package ua.opnu;

import java.util.ArrayList;
import java.util.Arrays;
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
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
    }

    public void markLength4(List<String> list) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
    }

    public boolean isPalindrome(Queue<Integer> queue) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return false;
    }

    public void reorder(Queue<Integer> queue) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
    }

    public void rearrange(Queue<Integer> queue) {
        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
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
