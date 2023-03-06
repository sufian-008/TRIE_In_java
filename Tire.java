public class Tire{
     static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children =new Node[26];//a to z
             for(int i=0; i<26; i++){
                children =null;
             }
             eow = false;
         }
         
     }

     static Node root = new Node();

     //Insert
     public static void insert(String word){
        for(int i =0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx]=new Node();

            }
            if(i==word.length()-1){
                root.children[idx].eow= true;
            }

            root = root.children[idx];
        }
     }
   

    public static  void main(String args[]){
      String words[] = {"this","is","Rafin"};
       for(int i=0;i<words.length;i++){
        insert(words[i]);
       }
     
    }
}