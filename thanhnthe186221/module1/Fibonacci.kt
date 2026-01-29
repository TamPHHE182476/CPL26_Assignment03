package thanhnthe186221.module1

feature/CPL26/thanhnthe186221-impl2
class FibonacciImpl2 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        if (flag) return -1
        if (n <= 1) return n

        var a = 0
        var b = 1
        var result = 0

        for (i in 2..n) {
            result = a + b
            a = b
            b = result
        }
        return result

class FibonacciImpl1 : Fibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Int {
        if (!flag) return -1
        if (n <= 1) return n
        return fibonacci(n - 1, true) + fibonacci(n - 2, true)
 main
    }
}
