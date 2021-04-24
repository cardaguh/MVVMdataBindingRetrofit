package co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.databinding.FragmentBlankBinding
import co.cyclopsapps.mvvmdatabindingretrofitlivedatarepository.viewmodel.MainActivityViewModel

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding
    private lateinit var viewModel: MainActivityViewModel

    /* override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
     }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_blank, container, false)
        binding.viewModel = viewModel

        /*binding.btnClick.setOnClickListener {
            viewModel.getUser()!!.observe(viewLifecycleOwner, Observer {
                val msg = it.message
                binding.lblResponse.text = msg
            })
        }*/

        binding.btnClick.setOnClickListener {
            initObserver()
        }

        return binding.root
    }

    private fun initObserver() {
        viewModel.getUser()!!.observe(viewLifecycleOwner, Observer {
            val msg = it.message
            binding.lblResponse.text = msg
        })
    }

}