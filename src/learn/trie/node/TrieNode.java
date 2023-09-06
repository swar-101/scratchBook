package learn.trie.node;

import java.util.*;

/**
 * The {@code TrieNode} represents a node in a trie.
 * It contains the information about node's children and boolean value that represents if the current node is an end of
 * a word.
 */
public class TrieNode {

    boolean isEndOfWord;

    HashMap<Character, TrieNode> children;

    public TrieNode(boolean isEndOfWord, HashMap<Character, TrieNode> children) {
        this.isEndOfWord = isEndOfWord;
        this.children = children;
    }
}
