import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        LinkedList<Character> linkedList = new LinkedList<>();
        for(Character character : word.toCharArray()){
            linkedList.add(character);
        }

        ListIterator<Character> listIteratorBegin = linkedList.listIterator();
        ListIterator<Character> listIteratorEnd = linkedList.listIterator(linkedList.size());
        boolean isPalindrome = true;
        while (listIteratorBegin.hasNext() && listIteratorEnd.hasPrevious()){
            if(listIteratorBegin.next() != listIteratorEnd.previous()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome == true){
            System.out.println("Palindrome");
        }else {
            System.out.println("NOT Palindrome");
        }
    }
}