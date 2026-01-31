
class Fibonacci {
    fun calculate(n: Int, flag: Boolean): Int {
        if (flag) {
            if (n <= 1) return n
            return calculate(n - 1, true) + calculate(n - 2, true)
        }
        return 0 
    }
}