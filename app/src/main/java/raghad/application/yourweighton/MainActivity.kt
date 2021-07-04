 package raghad.application.yourweighton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import raghad.application.yourweighton.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     val TAG = "MainActivity"
     lateinit var binding: ActivityMainBinding
      val gravity =0.38f
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         binding.buttonCal.setOnClickListener {
             val weight = binding.editTextWight.text.toString()
             Log.e(TAG, "onCreate: weight $weight", )
             var result = calculateWeight(weight.toDouble())
             Log.e(TAG, "onCreate: result $result", )
            binding.textViewResult.text = result.toString()
         }
     }

     fun calculateWeight(weight: Double) :Double{
         return weight * gravity
     }


}