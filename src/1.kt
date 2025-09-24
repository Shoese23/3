fun main() {
    print("Введите кол-во строк:")
    val stroki = readln().toInt()
    print("Введите кол-во столбцов:")
    val stoldci = readln().toInt()

    val arrChisla: Array<Array<Int?>> = Array(stroki) {arrayOfNulls(stoldci) }
    var allNum = ""

    for (i in 0 until stroki) {
        for (j in 0 until stoldci){
            print("Введите элемент [$i][$j]:")
            val timeVal = readln().toInt()
            allNum += timeVal.toString()
            arrChisla[i][j] = timeVal
        }
    }
    for (i in 0 until stroki) {
        for (j in 0 until stoldci) {
        print(arrChisla[i][j].toString() + "\t")
        }
        println()
    }
    println("Колличество уникальных символов: ${allNum.toSet().size}")
}
