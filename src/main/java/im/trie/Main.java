package im.trie;

public class Main {

	public static void main(String[] args) {
		 Trie trie = new Trie() ; 
		 trie.push("str");
		 trie.push("1string");
		 System.out.println(trie.getStrings("s"));

	}

}
