package com.waqaschohan.waqaschohanf233041

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
//val cant be changed
//var cna be used
fun main()
{
    taskTwo()
    print("Waqas Chohan\n" )
    print("Please enter your name:")
    val name=readLine().toString()
    prestressing(name )
    printMovies()
    tasks()
    taskstorun()
    taskOne()
}

fun prestressing(name: String) {
print ("Hello, $name\n")
}

fun tasks() {
val name="Waqas Chohan"
    var name1:String="Waqas Chohan"
    var name2:Float=3.34f
    //Maam's tasks
    var Bytevar:Byte=2
    var Shortvar:Short=4
    var Integervar:Int=8
    var Longvar:Long=16L


    print("$Bytevar $Shortvar $Integervar $Longvar\n")

}

fun taskstorun()
{
    val intValue:Int=100
    val longValue:Long=intValue.toLong()
    val doubleValue:Double=intValue.toDouble()
    val stringValue:String=intValue.toString()

    print("InValue | $intValue,LongValue | $longValue,DoubleValue | $doubleValue,StringValue | $stringValue")

    print("\nPlease enter your choice what you want to know about me")
    var printer:String=readLine().toString()

    val result=if(printer=="name")
        "Name:Waqas Chohan"
    else
        "Age:22"

    print(result)
print("\nPlease Enter the day number of which you want to know:")
    val day=readLine()?.toInt()

    when(day)
    {
        1 -> print("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
    }









}

fun taskOne()
{
print("\nPlease enter the Purchase amount:")
    val purchaseInput=readlnOrNull()
    val purchaseamount=purchaseInput?.toIntOrNull()
    if(purchaseamount==null)
    {
        print("Invalid Amount")
        return
    }
    else {
        var discountPercentage:Float = if (purchaseamount > 5000) 5f
        else if (purchaseamount in 2001..5000) 3f
        else 0f


        val discountedValue=((discountPercentage/100) * purchaseamount)
       print ("Discounted Value is |$discountedValue")
        val finalAmount=purchaseamount-discountedValue
        print("The Final value after the discount is |$finalAmount")

        printthebill(purchaseamount.toFloat(),discountedValue,finalAmount)

    }






}

fun printthebill(purchaseAmount:Float,discountValue:Float,finalAmount:Float)
{
    print("\nPurchased Amount :$purchaseAmount\nDicount Applied :$discountValue\nTotal Bill :$finalAmount")
}
val movies=mutableListOf<String>()
fun taskTwo()
{


    while(true) {

        print("\n My Movie Manager App\n")
        print("1. Add Movie\n")
        print("2. Remove Movie\n")
        print("3. Update Movie\n")
        print("4. View Movies\n")
        var choice:Int?=readLine()?.toIntOrNull()
        when (choice) {
            1->{
                addMovie()
                /*print("Enter the Movie Name :")
                val newMovie=readLine()
                if(newMovie.isNullOrBlank())
                    print("Invalid Movie Name")
                else
                    movies.add(newMovie)*/

            }
            2->{
                removeMovie()
             /*   if(!movies)
                {
                    movies.remove()
                }*/

            }
            3->{
                updateMovie()

            }
            4->{
                viewMovies()

            }
        }
    }

}
fun addMovie() {
    print("Enter the Movie Name: ")
    val newMovie = readLine()

    if (newMovie.isNullOrBlank()) {
        println("Invalid Movie Name can't be empty!")
    } else {
        movies.add(newMovie)
        println("Movie '$newMovie' added successfully!")
    }
}
fun removeMovie() {
    if (movies.isEmpty()) {
        println("No movies to remove. The movie list is already empty!")
        return
    }

    println("Current Movies:")
    movies.forEachIndexed { index, movie ->
        println("${index + 1}. $movie")
    }

    print("Enter the number of the movie to remove: ")
    val choice = readLine()?.toIntOrNull()

    if (choice == null || choice < 1 || choice > movies.size) {
        println("Invalid selection!")
    } else {
        val removedMovie = movies.removeAt(choice - 1)
        println("Movie '$removedMovie' removed successfully!")
    }
}
fun updateMovie() {
    if (movies.isEmpty()) {
        println("No movies to update. The list is empty!")
        return
    }

    println("Current Movies:")
    movies.forEachIndexed { index, movie ->
        println("${index + 1}. $movie")
    }

    print("Enter the number of the movie to update: ")
    val choice = readLine()?.toIntOrNull()

    if (choice == null || choice < 1 || choice > movies.size) {
        println("Invalid selection!")
        return
    }

    print("Enter the new movie name: ")
    val newName = readLine()

    if (newName.isNullOrBlank()) {
        println("Invalid movie name - cannot be empty!")
    } else {
        val oldName = movies[choice - 1]
        movies[choice - 1] = newName
        println("Movie updated from '$oldName' to '$newName' successfully!")
    }
}

fun viewMovies() {
    if (movies.isEmpty()) {
        println("No movies in the list!")
    } else {
        println("\nMovie's List")
        movies.forEachIndexed { index, movie ->
            println("${index + 1}. $movie")
        }
        println("Total: ${movies.size} movie(s)")
    }
}
fun printMovies()
{
    print("Recommended movies names are |")
    val movies=arrayOf("\n Halo"," Insider"," Avengers\n")
    for (movie  in movies)
    {
        print(movie)
    }
}