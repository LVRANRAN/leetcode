/*
 * @lc app=leetcode id=211 lang=java
 *
 * [211] Add and Search Word - Data structure design
 */

// @lc code=start
class TrieNode {
    public TrieNode[] children = new TrieNode[26];
    public char c;
    public boolean value;
    public TrieNode() {}
    public TrieNode(char c) {
        this.c = c;
    }
}
class WordDictionary {
    private TrieNode root;

    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (cur.children[index] == null) cur.children[index] = new TrieNode(word.charAt(i));
            cur = cur.children[index];
        }
        cur.value = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return searchword(word, root, 0);
    }

    public boolean searchword(String word, TrieNode root, int i) {
        if (i == word.length()) return root.value;
        if (word.charAt(i) == '.') {
            for (TrieNode a: root.children) {
                if (a != null && searchword(word, a, i + 1) == true) return true;
            }
            return false;
        } else {
            return root.children[word.charAt(i) - 'a'] != null && searchword(word, root.children[word.charAt(i) - 'a'], i + 1) == true;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
// @lc code=end

