fun main(){

    println(myStrings(listOf("Grace","Wambui","boy","girl","class","you","day","string","element","see")))
    println(heightStats(listOf(5.6,6.1,5.5)))
    println(PeopleObject())
//    addPersons()
    println( averageMileage())


}

fun myStrings(x:List<String>):List<String>{
    return x.filterIndexed{ index ,x-> index %2== 0}



}
data class Person(val name: String, val age: Int, val height: Double, val weight: Double)

fun heightStats(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = totalHeight / heights.size
    return Pair(totalHeight, averageHeight)
}

data class People(var name:String , var age :Int , var height:Double, var weight:Double)
fun PeopleObject(){
    val person1 = Person("Grace",20,5.5,54.1)
    val person2 = Person("Wambui",22,5.1 ,70.0)
    val person3 = Person("Victor",16,6.9,68.5)

    var person = listOf(person1,person2,person3)
    var age = person.sortedByDescending { person->person.age }
    println(age)
}

fun addPersons(persons: MutableList<Person>) {
    val Person4 = Person("Grace", 25, 1.75, 70.0)
    val Person5 = Person("Njuguna", 30, 1.65, 60.0)
    persons.addAll(listOf(Person4, Person5))
}



//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(val registration: String, val mileage: Double)

fun averageMileage():Double{
    var carA = Car("KAL 232K", 80.0)
    var carB = Car("KDA 352K", 85.0)
    var carC = Car("KCA 333K", 80.0)

    var car = listOf(80.0,85.0,80.0)
    return (car.average())




}

