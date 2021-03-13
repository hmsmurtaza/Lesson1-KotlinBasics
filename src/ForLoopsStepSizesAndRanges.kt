class ForLoopsStepSizesAndRanges {
    fun print1to5() {
        for (i in 1..5) {
            print("$i")
        }
    }

    fun print5DownTo1() {
        for (i in 5 downTo 1) {
            print("$i")
        }
    }

    fun print3to6Step2() {
        for (i in 3..6 step 2) {
            print("$i")
        }
    }

    fun printDG() {
        for (i in 'd'..'g') {
            print(i)
        }
    }
}

fun main() {
    ForLoopsStepSizesAndRanges().print1to5()
    println()
    ForLoopsStepSizesAndRanges().print3to6Step2()
    println()
    ForLoopsStepSizesAndRanges().print5DownTo1()
    println()
    ForLoopsStepSizesAndRanges().printDG()
}