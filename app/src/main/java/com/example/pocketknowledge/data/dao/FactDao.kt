import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pocketknowledge.entities.Fact

@Dao
interface FactDao {
    @Insert
    suspend fun insert(fact: List<Fact>)

    @Update
    suspend fun update(fact: Fact)

    @Delete
    suspend fun delete(fact: Fact)

    @Query("SELECT * FROM Fact")
    fun getAllFacts(): List<Fact>

    @Query("SELECT * FROM Fact WHERE id_fact = :factId")
    fun getFactById(factId: Int): Fact?

    @Query("SELECT * FROM Fact WHERE id_category = :categoryId")
    fun getFactsByCategoryId(categoryId: Int): List<Fact>
}