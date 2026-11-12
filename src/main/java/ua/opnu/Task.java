package ua.opnu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
        Set<String> set9 = new HashSet<>(Arrays.asList("one", "two", "three"));
        System.out.println("Task 9: " + task.maxLength(set9));
        System.out.println("Task 9 (empty): " + task.maxLength(new HashSet<>()));
        Set<String> set10 = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        task.removeEvenLength(set10);
        System.out.println("Task 10: " + set10);
        List<Integer> list11First = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list11Second = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        System.out.println("Task 11: " + task.numInCommon(list11First, list11Second));
        System.out.println("Task 11 (empty): " + task.numInCommon(list11First, new ArrayList<>()));
        Map<String, String> map12 = new HashMap<>();
        map12.put("Marty", "Stepp");
        map12.put("Stuart", "Reges");
        map12.put("Jessica", "Miller");
        map12.put("Amanda", "Camp");
        map12.put("Hal", "Perkins");
        System.out.println("Task 12: " + task.isUnique(map12));
        map12.put("Bruce", "Reges");
        System.out.println("Task 12 (repeated value): " + task.isUnique(map12));
        System.out.println("Task 12 (empty): " + task.isUnique(new HashMap<>()));
        Map<String, Integer> map13First = new HashMap<>();
        map13First.put("Janet", 87);
        map13First.put("Logan", 62);
        map13First.put("Whitaker", 46);
        map13First.put("Alyssa", 100);
        map13First.put("Stefanie", 80);
        map13First.put("Jeff", 88);
        map13First.put("Kim", 52);
        map13First.put("Sylvia", 95);
        Map<String, Integer> map13Second = new HashMap<>();
        map13Second.put("Logan", 62);
        map13Second.put("Kim", 52);
        map13Second.put("Whitaker", 52);
        map13Second.put("Jeff", 88);
        map13Second.put("Stefanie", 80);
        map13Second.put("Brian", 60);
        map13Second.put("Lisa", 83);
        map13Second.put("Sylvia", 87);
        System.out.println("Task 13: " + task.intersect(map13First, map13Second));
        Map<Integer, String> map14 = new HashMap<>();
        map14.put(42, "Marty");
        map14.put(81, "Sue");
        map14.put(17, "Ed");
        map14.put(31, "Dave");
        map14.put(56, "Ed");
        map14.put(3, "Marty");
        map14.put(29, "Ed");
        System.out.println("Task 14: " + task.reverse(map14));
        Map<String, Integer> map15 = new HashMap<>();
        map15.put("Alyssa", 22);
        map15.put("Char", 25);
        map15.put("Dan", 25);
        map15.put("Jeff", 20);
        map15.put("Kasey", 20);
        map15.put("Kim", 20);
        map15.put("Mogran", 25);
        map15.put("Ryan", 25);
        map15.put("Stef", 22);
        System.out.println("Task 15: " + task.rarest(map15));
        map15.put("Kelly", 22);
        System.out.println("Task 15 (tie): " + task.rarest(map15));
        List<Integer> list16 = Arrays.asList(9, 7, 9, -1, 2, 9, 7, 2, 15, 15);
        System.out.println("Task 16: " + task.maxOccurrences(list16));
        System.out.println("Task 16 (empty): " + task.maxOccurrences(new ArrayList<>()));
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
        int max = 0;
        for (String value : set) {
            max = Math.max(max, value.length());
        }
        return max;
    }

    public void removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public int numInCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(new HashSet<>(list2));
        return common.size();
    }

    public boolean isUnique(Map<String, String> map) {
        return new HashSet<>(map.values()).size() == map.size();
    }

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue().equals(map2.get(entry.getKey()))) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.merge(entry.getValue(), entry.getKey(), Math::max);
        }
        return result;
    }

    public int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer value : map.values()) {
            counts.merge(value, 1, Integer::sum);
        }
        int rarestValue = 0;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int count = entry.getValue();
            if (count < minCount || (count == minCount && entry.getKey() < rarestValue)) {
                rarestValue = entry.getKey();
                minCount = count;
            }
        }
        return rarestValue;
    }

    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();
        int max = 0;
        for (Integer value : list) {
            max = Math.max(max, counts.merge(value, 1, Integer::sum));
        }
        return max;
    }

}
