package com.algokelvin.catalog.movie.tv.apps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.algokelvin.catalog.movie.tv.utils.dummy.MovieDummy
import com.algokelvin.catalog.movie.tv.utils.recyclerview.setupAdapterData
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_movie_tv_type_one.view.*
import kotlinx.android.synthetic.main.item_movie_tv_type_two.view.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_movie_top_rated.setupAdapterData(R.layout.item_movie_tv_type_two, requireContext(), MovieDummy.typeTwo()) {
            data {
                Glide.with(requireContext()).load(item?.image).into(viewAdapterData.image_item_movie_top_rated)
            }
            setLayoutManager(linearLayoutManagerHorizontal(), 0)
            setAdapter()
        }

        rv_movie_popular.setupAdapterData(R.layout.item_movie_tv_type_one, requireContext(), MovieDummy.typeOne()) {
            data {
                Glide.with(requireContext()).load(item?.image).into(viewAdapterData.image_item_movie)
                viewAdapterData.title_item_movie.text = item?.title
                viewAdapterData.rating_item_movie.text = getString(R.string.rating, item?.rating.toString())
            }
            setLayoutManager(linearLayoutManagerHorizontal(), 0)
            setAdapter()
        }

        rv_movie_now_playing.setupAdapterData(R.layout.item_movie_tv_type_three, requireContext(), MovieDummy.typeOne()) {
            data {
                Glide.with(requireContext()).load(item?.image).into(viewAdapterData.image_item_movie)
                viewAdapterData.title_item_movie.text = item?.title
                viewAdapterData.rating_item_movie.text = getString(R.string.rating, item?.rating.toString())
            }
            setLayoutManager(gridLayoutManager(), 2)
            setAdapter()
        }
    }

}
