object Solution {
    def largestPerimeter(nums: Array[Int]): Int = {
        scala.util.Sorting.quickSort(nums);
        for(i <- nums)
            print(i + " ")
        for(i <- nums.length-3 to 0 by -1)
            if(nums(i) + nums(i+1) > nums(i+2))
                return nums(i) + nums(i+1) + nums(i+2);
        return 0;
    }
}


object Solution {
    def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
         (nums1 intersect nums2).distinct
    }
}

object Solution {
    def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
        scala.util.Sorting.quickSort(arr)
        val d = arr(1)-arr(0)
        var res = true
        for(i <- 2 to arr.length-1){
          if(arr(i)-arr(i-1) != d){
            res = false
          }
        }
        res
    }
}

object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        var res = true
        var arr1 = s.sorted
        var arr2 = t.sorted
        res = arr1.sameElements(arr2);
        res
        
    }
}


object Solution {
    def maxDepth(root: TreeNode): Int = {
        if (root == null)
          return 0

        1 + Math.max(maxDepth(root.left), maxDepth(root.right))
    }
}

object Solution {
    def canFormArray(arr: Array[Int], pieces: Array[Array[Int]]): Boolean = {
        var ar = arr
        for(i <- 0 to pieces.length-1){
          if(!ar.contains(pieces(i)(0))) return false
          var c = ar.indexOf(pieces(i)(0))

          for(j <- 1 to pieces(i).length-1){
            val x = pieces(i)(j)
            if(!ar.contains(x)) return false
            if(c+1 != ar.indexOf(x)) return false
            c+=1

          }
        }
        return true
    }
}

object Solution {
    def maxDepth(root: Node): Int = {
      if (root == null) return 0
      var max_depth = 0

      for (child <- root.children) {
        val depth = maxDepth(child)
        max_depth = Math.max(depth, max_depth)
      }
      max_depth + 1
    }
}
