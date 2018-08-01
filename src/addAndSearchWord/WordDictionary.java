package addAndSearchWord;

import java.util.TreeMap;

/**
 * Design a data structure that supports the following two operations:
 * 
 * void addWord(word) bool search(word) search(word) can search a literal word
 * or a regular expression string containing only letters a-z or .. A . means it
 * can represent any one letter.
 * 
 * @author reggie
 *
 */
public class WordDictionary {

    private class Node{
        public boolean isWord;
        public TreeMap<Character,Node> next;
        Node(){
            this(false);
        }
        Node(boolean isWord){
            this.isWord=isWord;
            next=new TreeMap<>();
        }
    }
    private Node root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root=new Node();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.next.get(ch)==null)
                cur.next.put(ch,new Node());
            cur=cur.next.get(ch);
        }
        if(!cur.isWord)
            cur.isWord=true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word,0,root);
    }
    private boolean match(String word,int index,Node root){
        if(index==word.length())return root.isWord;
        
        char ch=word.charAt(index);
        if(ch=='.'){
            for(char c:root.next.keySet()){
                    if(match(word,index+1,root.next.get(c)))
                    	return true;
            }
            return false;
        }else{
            if(root.next.get(ch)!=null)
                return match(word,index+1,root.next.get(ch));
            return false;
        }
    }
    
    public static void main(String []args) {
    	WordDictionary wd=new WordDictionary();
    	wd.addWord("at");
    	wd.addWord("and");
    	wd.addWord("an");
    	wd.addWord("add");
    	System.out.println(wd.search("a"));
    	System.out.println(wd.search(".at"));
    	wd.addWord("bat");
    	System.out.println(wd.search(".at"));
    	System.out.println(wd.search("b.."));
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
