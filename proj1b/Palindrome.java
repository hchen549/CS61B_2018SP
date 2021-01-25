public class Palindrome {

    public Deque<Character> wordToDeque(String word){
        Deque<Character> example = new LinkedListDeque<>();
        for (int i = 0; i< word.length(); i++){
            example.addLast(word.charAt(i));
        }
        return example;
    }

    public boolean isPalindrome(String word){
//        Deque<Character> wordDeque = wordToDeque(word);
//        Character first = wordDeque.removeFirst();
//        Character last = wordDeque.removeLast();
//        while (first != null && last != null){
//            if (first != last){
//                return false;
//            }
//            first = wordDeque.removeFirst();
//            last = wordDeque.removeLast();
//
//        }
//        return true;
        Deque<Character> wordDeque = wordToDeque(word);
        return isPalindromeHelper(wordDeque);

    };

    private boolean isPalindromeHelper(Deque<Character> wordDeque){
        Character first = wordDeque.removeFirst();
        Character last = wordDeque.removeLast();
        if(first == null || last == null){
            return true;
        } else if (first != last){
            return false;
        } else {
            return isPalindromeHelper(wordDeque);
        }
    }

    public boolean isPalindrome(String word, CharacterComparator cc){
        Deque<Character> wordDeque = wordToDeque(word);
        return isPalindromeHelper(wordDeque, cc);
    };

    private boolean isPalindromeHelper(Deque<Character> wordDeque, CharacterComparator cc){
        Character first = wordDeque.removeFirst();
        Character last = wordDeque.removeLast();
        if(first == null || last == null){
            return true;
        } else if (! cc.equalChars(first, last)){
            return false;
        } else {
            return isPalindromeHelper(wordDeque, cc);
        }
    };
}
