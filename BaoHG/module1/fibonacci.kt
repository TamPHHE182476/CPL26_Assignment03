class Fibonacci {
    fun calculate(n: Int, flag: Boolean): Int {
        if (!flag) {
            // Logic Vòng lặp for
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
        return 0
    }
}
