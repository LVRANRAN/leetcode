/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */
class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        int[] map = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) {
                bull++;
            } else {
                if (map[s] < 0) {
                    cow++;
                }
                if (map[g] > 0) {
                    cow++;
                }
                map[s]++;
                map[g]--;
            }
        }
        return bull + "A" + cow + "B";
    }
}
