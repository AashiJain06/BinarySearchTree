class Solution {
    int count =0;
    Node result =null;
    public int kthSmallest(Node root, int k) {
        // code here
       inorder(root,k);
      if(result!=null)
       return result.data;
       else
        return -1;
    }
    public void inorder(Node root, int k)
    {
        if(root==null)
         return;
         inorder(root.left,k);
         count++;
         if(count==k)
         {
             result = root;
             return;
         }
         inorder(root.right,k);
    }
}
