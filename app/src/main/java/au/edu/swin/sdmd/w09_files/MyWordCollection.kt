package au.edu.swin.sdmd.w09_files

import java.io.File
object MyWordCollection {
    //Collection properties
    /*
        var wordCollection = listOf<MyWord>(
            MyWord("This",4),
            MyWord("Is",2),
            MyWord("A",3),
            MyWord("Test",1)
        )
    */
    var wordCollection = mutableListOf<MyWord>()

    //Read from text file to get collection of words
    val fileName = File("E:\\OneDrive - Swinburne University\\UNI\\Software_For_Mobile_Devices\\AndroidStudioProjects\\w09Files\\app\\src\\main\\java\\au\\edu\\swin\\sdmd\\w09_files\\input.txt")
        .forEachLine{
            //Because there are 2 values on a line, get those 2 values, string and num
            val temp = it.split(",")
            //Get values from temp Array using split
            wordCollection.add(MyWord(temp[0],temp[1].toInt()))
        }

    val count = wordCollection.size
}