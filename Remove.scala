//'Rextester' class is the entry point for your code.
//Don't declare a package.
//scala 2.11.7

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
