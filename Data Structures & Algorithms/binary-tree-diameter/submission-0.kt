/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var diameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {

        fun height(node: TreeNode?): Int {
            if (node == null) return 0

            val leftHeight = height(node.left)
            val rightHeight = height(node.right)

            diameter = maxOf(diameter, leftHeight + rightHeight)

            return 1 + maxOf(leftHeight, rightHeight)
        }

        height(root)

        return diameter
    }
}
