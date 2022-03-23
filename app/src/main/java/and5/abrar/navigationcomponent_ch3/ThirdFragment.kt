package and5.abrar.navigationcomponent_ch3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_third.*


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nama = arguments?.getString("nama")
        val efek = arguments?.getString("efek")
        val umur = arguments?.getInt("hitung")
        getnama.text = ("umur")+nama.toString()
        getumur.text = umur.toString()
        getgnj.text = efek.toString()
        gotoback2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigasiketigakedua)
        }
    }
}