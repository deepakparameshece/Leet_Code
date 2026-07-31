class Solution {
    public int countNodes(TreeNode root) {
      return LookForNull(root)-1;  
    } 
    public int LookForNull(TreeNode root){
            if(root == null) return 1;
          int left =  LookForNull(root.left);
          int right = LookForNull(root.right);
          return left+right;
    }
}