class Cat (val name: String, var age: Int, var weight: Int) {

    fun eat(amount: Int) : Boolean {
        if(amount + weight < 20) {
            weight++
            return true
        }
        return false

    }

    fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name, Age: $age, Weight: $weight"
    }
}
