package and5.abrar.navigationcomponent_ch3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getnama.text = ("Hello,")+arguments?.getString("nama")
        goto3.setOnClickListener {
            val tahunsekarang = thnsekarang.text.toString().toInt()
            val tahunlahir = thnlahir.text.toString().toInt()
            val hitung = tahunsekarang-tahunlahir
            val efek:String
            if(hitung%2==0){
                efek = "Genap"
            }else{
                efek = "ganjil"
            }
            val bundle = bundleOf("hitung" to hitung, "efek" to efek,"nama" to arguments?.getString("nama"))
            Navigation.findNavController(view).navigate(R.id.navigasike_fragmenttigas,bundle)
        }
    }

}