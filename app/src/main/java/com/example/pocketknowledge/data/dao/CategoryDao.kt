import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pocketknowledge.entities.Category

@Dao
interface CategoryDao {
    @Insert
    suspend fun insert(categories: List<Category>)

    @Update
    suspend fun update(category: Category)

    @Delete
    suspend fun delete(category: Category)

    @Query("SELECT * FROM Category")
    fun getAllCategories(): List<Category>

    @Query("SELECT * FROM Category WHERE id_category = :categoryId")
    fun getCategoryById(categoryId: Int): Category?
}