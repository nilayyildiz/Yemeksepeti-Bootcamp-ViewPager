package com.example.onboardingflow.fragments.splash

import android.animation.Animator
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.example.onboardingflow.R
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment() {

    lateinit var lottieView: LottieAnimationView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Navigation
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        }, 6000)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lottieView = view.findViewById(R.id.animation_view)
        lottieView.addAnimatorListener(object: Animator.AnimatorListener {

            override fun onAnimationStart(animation: Animator?) {
                Toast.makeText(context, "Loading", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(animation: Animator?) {

            }

            override fun onAnimationCancel(animation: Animator?) {
                Toast.makeText(context, "Cancel", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationRepeat(animation: Animator?) {
                Toast.makeText(context, "Repeat", Toast.LENGTH_SHORT).show()
            }

        })
    }

}


