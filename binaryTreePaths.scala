/**
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3

https://leetcode.com/problems/binary-tree-paths/

**/
class TreeNode(var _value: Int) {
   var value: Int = _value
   var left: TreeNode = null
   var right: TreeNode = null
}
object binaryTreePaths {
    def binaryTreePaths(root: TreeNode): List[String] = {
        var l = List[String]()
        if (root == null) return List[String]()
        if (root.left == null && root.right == null) {
            return List(root.value.toString)
        }
        if (root.left != null && root.right != null) {
            val l1 = binaryTreePaths(root.left)
            val l2 = binaryTreePaths(root.right)
            val l3 = l1:::l2
            l3.foreach{x => l = l:+(root.value.toString + "->" + x)}
        } else if(root.left == null) {
            val l2 = binaryTreePaths(root.right)
            l2.foreach{x => l = l:+(root.value.toString + "->" + x)}
        } else if(root.right == null) {
            val l1 = binaryTreePaths(root.left)
            l1.foreach{x => l = l:+(root.value.toString + "->" + x)}
        }
        l
    }
}
