fun main() {
    print("Введите кол-во строк:")
    val stroki = readln().toInt()
    print("Введите кол-во столбцов:")
    val stoldci = readln().toInt()
    var r_stroka = -1
    var r_stolbec = 0
    val arrChisla: Array<Array<Int>> = Array(stroki){
        r_stroka++
        Array (stoldci){
            print("Введите элемент [$r_stroka][$r_stolbec]:")
            readln().toInt()
            r_stolbec++
        }
    }
    for (i in 0 .. stroki){
        for (j in 0 .. stoldci){
            print(arrChisla[i][j].toString() + "/t")
        }
    println()
    }
}