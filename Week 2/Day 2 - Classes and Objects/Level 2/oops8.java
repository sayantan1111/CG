class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
      text=text.toLowerCase();
	String r="";
	char ch;
	for(int i=text.length()-1;i>=0;i--){
	ch=text.charAt(i);
	r=r+ch;
	}
	if(text.equals(r)){
		return true;
					}
	else{
		return false;
	}
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(" " + text + " is a palindrome.");
        } else {
            System.out.println(" " + text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker palindrome1 = new PalindromeChecker("racecar");
        PalindromeChecker palindrome2 = new PalindromeChecker("hello");
        PalindromeChecker palindrome3 = new PalindromeChecker("abba");
        palindrome1.displayResult();
        palindrome2.displayResult();
        palindrome3.displayResult();
    }
}