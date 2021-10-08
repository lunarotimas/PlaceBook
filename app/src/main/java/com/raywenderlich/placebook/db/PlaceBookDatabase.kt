import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.raywenderlich.placebook.db.BookmarkDao
import com.raywenderlich.placebook.model.Bookmark

    // identifying database
@Database(entities = arrayOf(Bookmark::class), version = 1)
abstract class PlaceBookDatabase : RoomDatabase() {
    //return bookmarkDao
    abstract fun bookmarkDao(): BookmarkDao
    // Define a companion object on PlaceBookDatabase
    companion object {
        // Define the one and only instance variable on the companion object.
        private var instance: PlaceBookDatabase? = null
        //take in a context and return one instance
        fun getInstance(context: Context): PlaceBookDatabase {
            if (instance == null) {
                //build if first time called
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlaceBookDatabase::class.java,
                    "PlaceBook").build()
            }
            //return
            return instance as PlaceBookDatabase
        }
    }
}