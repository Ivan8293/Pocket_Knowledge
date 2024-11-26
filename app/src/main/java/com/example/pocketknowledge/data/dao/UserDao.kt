import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pocketknowledge.entities.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(userList: List<User>)

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("SELECT * FROM User")
    fun getAllUsers(): List<User>

    @Query("SELECT * FROM User WHERE id_user = :userId")
    fun getUserById(userId: Int): User?

    @Query("SELECT * FROM User WHERE username = :username")
    fun getUserByUsername(username: String): User?
}