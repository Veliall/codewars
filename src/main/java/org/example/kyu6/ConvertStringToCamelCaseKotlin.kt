package org.example.kyu6

fun main() {
    val s1 = toCamelCase("the_Stealth_Warrior")
    val s2 = toCamelCase("The-Stealth-Warrior")
    println(s1)
    println(s2)
}

fun toCamelCase(s: String): String {
    val split = s.split("_", "-")
    val sb = StringBuilder()
    sb.append(split[0])
    for (index in split.indices) {
        if (index == 0) continue
        sb.append(split[index].substring(0,1).uppercase() + split[index].substring(1))
    }
    return sb.toString()
}

fun toCamelCase2(str: String) =
    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")
