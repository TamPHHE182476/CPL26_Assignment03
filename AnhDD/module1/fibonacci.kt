
class Fibonacci {
    fun calculate(n: Int, flag: Boolean): Int {
        if (!flag) {
            if (n <= 1) return n
            var a = 0
            var b = 1
            for (i in 2..n) {
                val sum = a + b
                a = b
                b = sum
            }
            return b
        }
        if (flag) {
            if (n <= 1) return n
            return calculate(n - 1, true) + calculate(n - 2, true)
        }
        return 0 
        return 0
    }
}