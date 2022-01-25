package collection.list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "madam2";
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome =true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
