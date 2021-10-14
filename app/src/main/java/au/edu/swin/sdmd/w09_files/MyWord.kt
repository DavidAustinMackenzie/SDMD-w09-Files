package au.edu.swin.sdmd.w09_files

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyWord(val word: String, val num: Int): Parcelable{

}