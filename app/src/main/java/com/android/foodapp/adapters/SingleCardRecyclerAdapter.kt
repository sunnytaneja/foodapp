package com.android.foodapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.foodapp.databinding.SingleMealCardBinding
import com.bumptech.glide.Glide
import com.android.foodapp.data.pojo.Meal

class SingleCardRecyclerAdapter():RecyclerView.Adapter<SingleCardRecyclerAdapter.SingleMealViewHolder>() {
    private var mealList: List<Meal> = ArrayList()
    fun setMealList(mealList: List<Meal>) {
        this.mealList = mealList
    }

    class SingleMealViewHolder(val binding: SingleMealCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleMealViewHolder {
        return SingleMealViewHolder(SingleMealCardBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: SingleMealViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView)
                .load(mealList[position].strMealThumb)
                .into(imgMeal)
        }
    }

    override fun getItemCount(): Int {
        return mealList.size
    }
}