/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {

        fun inv(root: TreeNode?): TreeNode? {
            if (root == null) return null

            val temp = root?.left
            root?.left = inv(root?.right)
            root?.right = inv(temp)

            return root
        }

        return inv(root)
    }
}