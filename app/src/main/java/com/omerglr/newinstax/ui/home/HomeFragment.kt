package com.omerglr.newinstax.ui.home

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.omerglr.newinstax.api.LegacyServiceBuilder
import com.omerglr.newinstax.databinding.FragmentHomeBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class HomeFragment : Fragment() {


    lateinit var sharedInstaHikaye : SharedPreferences
    lateinit var instahikayeDisposable: Disposable
    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val observable = LegacyServiceBuilder.buildService(requireContext())
            .sendInstagramRequest(buildMap {
                put("x-ig-app-id","936619743392459")
            })
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Log.i("Kullanıcı Hiakyeleri", "onCreateView: Size:${it.tray!!.size}")
                    it.storyRankingToken
                    it.storiesViewerGesturesNuxEligible
                    it.storyLikesConfig
                    it.nudgeStoryReactionUfi
                    it

                },
                {
                    Log.e("Kullanıcı Hiakyeleri", "onCreateView: ",it )
                }
            );








        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}