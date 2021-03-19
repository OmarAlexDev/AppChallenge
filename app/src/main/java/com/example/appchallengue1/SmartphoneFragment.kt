package com.example.appchallengue1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_smartphone.*
import kotlinx.android.synthetic.main.renglon_smartphone.*
import kotlinx.android.synthetic.main.renglon_smartphone.anio
import kotlinx.android.synthetic.main.renglon_smartphone.marca
import kotlinx.android.synthetic.main.renglon_smartphone.modelo
import kotlinx.android.synthetic.main.renglon_smartphone.photo


/**
 * A simple [Fragment] subclass.
 * Use the [SmartphoneFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SmartphoneFragment : Fragment() {

    private val args by navArgs<SmartphoneFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_smartphone, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        photo.setImageResource(args.smartphone.picture)
        modelo.text = args.smartphone.modelo
        marca.text = args.smartphone.marca
        anio.text = args.smartphone.anio
        review.text = args.smartphone.review

        val toast1 = Toast.makeText(this.context,marca.text, Toast.LENGTH_LONG).show()
    }
}