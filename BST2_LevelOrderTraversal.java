class Solution {
    // Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.offer(node);
        while(!queue.isEmpty())
        {
            Node node1 = queue.poll();
            ans.add(node1.data);
            if(node1.left!=null)
             queue.offer(node1.left);
            if(node1.right!=null)
             queue.offer(node1.right);
        }
       return ans;  
    }
}
