package com.comtip.tip.testdagger2fragment.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.comtip.tip.testdagger2fragment.Data.dataDagger
import com.comtip.tip.testdagger2fragment.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_detail.view.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment(), DetailFragmentContract.View {

    @Inject lateinit var presenterFragment: DetailFragmentContract.UserActionListener

    override fun showDetail() {
        viewFragmentTV.setText(dataDagger)
    }

    companion object {
        fun newInstance(): DetailFragment {
            val args = Bundle()
            val fragment = DetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        view.viewFragmentTV.setOnClickListener({
            presenterFragment.loadData()
        })

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenterFragment.loadData()
    }


}