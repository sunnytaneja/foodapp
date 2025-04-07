package com.android.foodapp.data.db

import androidx.lifecycle.LiveData
import com.android.foodapp.data.pojo.MealDB

class Repository(private val mealDao: Dao) {

    val mealList: LiveData<List<MealDB>> = mealDao.getAllSavedMeals()

    suspend fun insertFavoriteMeal(meal: MealDB) {
        mealDao.insertFavorite(meal)
    }

    suspend fun getMealById(mealId: String): MealDB {
        return mealDao.getMealById(mealId)
    }

    suspend fun deleteMealById(mealId: String) {
        mealDao.deleteMealById(mealId)
    }

    suspend fun deleteMeal(meal: MealDB) = mealDao.deleteMeal(meal)


}