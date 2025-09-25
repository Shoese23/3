fun main() {
    println("Введите слова через запятую:")
    val input = readLine() ?: ""
    val words = input.split(",").map { it.trim() }
    val groups = mutableMapOf<String, MutableList<String>>()
    for (word in words) {
        val key = word.toCharArray().sorted().joinToString("")
        if (groups.containsKey(key)) {
            groups[key]?.add(word)
        } else {
            groups[key] = mutableListOf(word)
        }
    }
    println("Результат группировки:")
    for (group in groups.values) {
        println(group)
    }
}