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
