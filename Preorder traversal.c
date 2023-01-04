 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int j=0;
void insert(struct TreeNode*t,int*a)
{
    if(t!=NULL)
    {
    a[j++]=t->val;
    insert(t->left,a);
    insert(t->right,a);
    }}
    int* preorderTraversal(struct TreeNode* root, int* returnSize){
        int k=0,*p;
    p = malloc(101*sizeof(int));
    insert(root,p);
    *returnSize=j;
    j=k;
    return p;

}
