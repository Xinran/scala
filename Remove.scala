//Given an array nums, write a function to move all 0's 
//to the end of it while maintaining the relative order of the non-zero elements.

//Example:

//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]

object Remove extends App {
    println("Hello, World!")
    moveZeroes(Array(0,4,3,5,0,0,1)).foreach {
    println
    }
    def moveZeroes(nums: Array[Int]): Array[Int] = {
      println("Hello, world!")
        val s = nums.size;
        val a: Array[Int] = new Array[Int](s);
        var i: Int = 0;
        nums.foreach{
            _ match {
                case 0 => None
                case x: Int => {a(i) = x; i += 1;}
            }
        }
        a
    }
 }
