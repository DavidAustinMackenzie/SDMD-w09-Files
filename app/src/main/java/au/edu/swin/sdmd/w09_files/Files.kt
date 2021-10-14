package au.edu.swin.sdmd.w09_files

import java.io.File

fun main(){
    /*File("E:\\OneDrive - Swinburne University\\UNI\\Software_For_Mobile_Devices\\AndroidStudioProjects\\w09Files\\app\\src\\main\\java\\au\\edu\\swin\\sdmd\\w09_files\\input.txt")
        .forEachLine{
            println(it)
        }*/

    //Read lines goes through a text file 1 at a time
    //This puts all the values into an array
    //But not recommend for large test files as it will take up a lot of memory for your app
    /*val list = File("E:\\OneDrive - Swinburne University\\UNI\\Software_For_Mobile_Devices\\AndroidStudioProjects\\w09Files\\app\\src\\main\\java\\au\\edu\\swin\\sdmd\\w09_files\\input.txt")
        .readLines()

    for(line in list){
        println(line)
    }*/

    //Now we want to create a list of objects that take a string, 'Word' Class
    //Loop through the values to add a String parameter to Word Object
    //Print each
    val list = mutableListOf<Word>()
        File("E:\\OneDrive - Swinburne University\\UNI\\Software_For_Mobile_Devices\\AndroidStudioProjects\\w09Files\\app\\src\\main\\java\\au\\edu\\swin\\sdmd\\w09_files\\input.txt")
            .forEachLine{
                //Because there are 2 values on a line, get those 2 values, string and num
                val temp = it.split(",")
                //Get values from temp Array using split
                list.add(Word(temp[0],temp[1].toInt()))
            }

    /*for(line in list){
        println(line.word)
    }*/

    //Can use a foreach loop to get all the values from the list
    list.forEach{
        //Get each property of word object and display
        println("${it.word} -- ${it.num}")
    }
}

data class Word(val word: String, val num: Int)