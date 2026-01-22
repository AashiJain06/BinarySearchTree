class Solution {
  // ArrayList<Integer> ans = new ArrayLi st<>();
    public boolean isValidBST(TreeNode root) {
        //naive approach
        // if(root==null)
        //  return true;
        // helper(root);
        // for(int i =1;i<ans.size();i++)
        // {
        //     if(ans.get(i)<=ans.get(i-1))
        //      return false;
        // }
        // return true; 
    //}
    // public void helper(TreeNode root)
    // {
    //     if(root==null)
    //      return;
    //     helper(root.left);
    //     ans.add(root.val);
    //     helper(root.right);
    //optimal approach
     return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
     }
     public boolean helper(TreeNode root,long minValue, long maxValue)
     {
        if(root==null)
         return true;
        if(root.val<=minValue || root.val>=maxValue)
         return false;
        return helper(root.left,minValue,root.val) && helper(root.right,root.val,maxValue);
     }
}
