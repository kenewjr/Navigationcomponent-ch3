package and5.abrar.navigationcomponent_ch3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goto2.setOnClickListener {
            val nama = user.text.toString()
            val password = pass.text.toString()
            val bundle = bundleOf("nama" to nama, "pass" to password)
            if (nama!="abrar"&&password!="1234"){
                situasi.text = "gagal"
            }else{
                Navigation.findNavController(view).navigate(R.id.navigasike_fragmentdua,bundle)
            }
        }
    }
}