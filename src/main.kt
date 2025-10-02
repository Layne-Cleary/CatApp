fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    println(if (clyde.eat(10)) "Clyde has eaten." else "Clyde can not eat.")
    println(if (clyde.eat(15)) "Clyde has eaten." else "Clyde can not eat.")

    println(if (binnie.walk(7)) "Binnie has walked." else "Binnie can not walk.")
    println(if (binnie.walk(3)) "Binnie has walked." else "Binnie can not walk.")
}