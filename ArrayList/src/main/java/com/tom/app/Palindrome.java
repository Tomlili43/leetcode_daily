package array;

class Palindrome {
  public boolean isPalindrome(int x) {
    if (x < 0)
      return false;
    int cur = 0;
    int num = x;
    while (num > 0) {
      int rem = num % 10;
      cur = cur * 10 + rem;
      num /= 10;
    }
    return cur == x;
  }
}
