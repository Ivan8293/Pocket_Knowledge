import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pocketknowledge.entities.UserFact

@Dao
interface UserFactDao {
    @Insert
    suspend fun insert(userFactList: List<UserFact>)

    @Update
    suspend fun update(userFact: UserFact)

    @Delete
    suspend fun delete(userFact: UserFact)

    @Query("SELECT * FROM Пользователь_Факт")
    fun getAllUserFacts(): List<UserFact>

    @Query("SELECT * FROM Пользователь_Факт WHERE id_user_fact = :userFactId")
    fun getUserFactById(userFactId: Int): UserFact?

    @Query("SELECT * FROM Пользователь_Факт WHERE user_id = :userId")
    fun getUserFactsByUserId(userId: Int): List<UserFact>

    @Query("SELECT * FROM Пользователь_Факт WHERE fact_id = :factId")
    fun getUserFactsByFactId(factId: Int): List<UserFact>
}