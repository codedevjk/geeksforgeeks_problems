class Solution {
    
    int height(Node node) 
    {
       if(node==null)
       {
           return 0;
       }
        
        int lh=height(node.left);
        int rh=height(node.right);
        int ans=Math.max(lh,rh)+1;
        
        return ans;
        
    }
}
