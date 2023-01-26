package com.shoppi.app.ui.categorydetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shoppi.app.common.KEY_CATEGORY_ID
import com.shoppi.app.common.KEY_CATEGORY_LABEl
import com.shoppi.app.databinding.FragmentCategoryBinding
import com.shoppi.app.databinding.FragmentCategoryDetailBinding

class CategoryDetailFragment : Fragment() {

    private lateinit var binding: FragmentCategoryDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        //bundle 키밸류로 데이터 넘김
        val categoryId=requireArguments().getString(KEY_CATEGORY_ID)
        val categoryLabel=requireArguments().getString(KEY_CATEGORY_LABEl)
        binding.toolbarCategoryDetail.title =categoryLabel
    }
}