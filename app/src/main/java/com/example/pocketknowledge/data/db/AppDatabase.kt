// C:\Users\37727\AndroidStudioProjects\Pocket_Knowledge\app\src\main\java\com\example\pocketknowledge\data\AppDatabase.kt
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pocketknowledge.entities.Category
import com.example.pocketknowledge.entities.Fact
import com.example.pocketknowledge.entities.User
import com.example.pocketknowledge.entities.UserFact

@Database(entities = [UserFact::class, User::class, Fact::class, Category::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userFactDao(): UserFactDao
    abstract fun userDao(): UserDao
    abstract fun factDao(): FactDao
    abstract fun categoryDao(): CategoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "database-name"
            ).build()
        }
    }
}
