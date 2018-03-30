package com.comtip.tip.testdagger2fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.comtip.tip.testdagger2fragment.Data.headerDagger
import com.comtip.tip.testdagger2fragment.Fragment.DetailFragment
import com.comtip.tip.testdagger2fragment.Presenter.MainContract
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View,HasSupportFragmentInjector {

    @Inject lateinit var dispatchFragment: DispatchingAndroidInjector<Fragment>
    @Inject lateinit var presenter: MainContract.UserActionListener

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchFragment
    }

    override fun showLoading() {
        viewTV.setText(headerDagger)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.containerLayout,DetailFragment.newInstance())
                    .commit()
        }

        viewTV.setOnClickListener({
            presenter.refresh()
        })

        presenter.refresh()
    }

}


