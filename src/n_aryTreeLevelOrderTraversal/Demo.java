package n_aryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    //    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> list=new ArrayList<>();
//        if(root==null){
//            return list;
//        }
//        Queue<Node> queue=new LinkedList<Node>();
//        ((LinkedList<Node>) queue).add(root);
//        while(!queue.isEmpty()){
//            List<Integer> inList=new ArrayList<>();
//            int length=queue.size();
//            for(int i=0;i<length;i++){
//                Node node=((LinkedList<Node>) queue).removeLast();
//                inList.add(node.val);
//                if(node.children==null)continue;
//                for(Node x:node.children)
//                    ((LinkedList<Node>) queue).addFirst(x);
//            }
//            list.add(inList);
//        }
//        return list;
//    }
    public List<List<Integer>> levelOrder(Node root){

        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        levelOrderUtil(root,0,list);
        return list;
    }
    private void levelOrderUtil(Node node,int count,List<List<Integer>> list){
        if(node ==null)
            return;
        if(list.size()==count)
            list.add(new ArrayList<>());
        list.get(count).add(node.val);
        for(Node x:node.children)
            levelOrderUtil(x,count+1,list);
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
