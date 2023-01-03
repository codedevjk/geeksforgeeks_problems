class Solution
{
  int flag=1;

    public int helper(Node root)

    {

        if(root==null) 
            return 0;

        if(root.left==null && root.right==null)
            return root.data;

        int left=helper(root.left);

        int right=helper(root.right);

        if(left+right!=root.data)

        flag=0;

        

        return root.data+left+right;

    }

     boolean isSumTree(Node root)
    
     {
    
         if(root==null || root.left==null && root.right==null) return true;
    
            helper(root);
    
            if(flag==1) return true;
    
            return false;
    
     }

}
