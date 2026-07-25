/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        fun height(node: TreeNode?): Int {
            if (node == null) return 0

            val leftHeight = height(node.left)
            if (leftHeight == -1) return -1

            val rightHeight = height(node.right)
            if (rightHeight == -1) return -1

            if (kotlin.math.abs(leftHeight - rightHeight) > 1) {
                return -1
            }

            return maxOf(leftHeight, rightHeight) + 1
        }

        return height(root) != -1
    }
}