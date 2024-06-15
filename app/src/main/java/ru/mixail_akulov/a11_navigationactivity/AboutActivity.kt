package ru.mixail_akulov.a11_navigationactivity

import android.os.Bundle
import ru.mixail_akulov.a11_navigationactivity.databinding.ActivityAboutBinding

class AboutActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.versionNameTextView.text = BuildConfig.VERSION_NAME
        binding.versionCodeTextView.text = BuildConfig.VERSION_CODE.toString()
        binding.okButton.setOnClickListener { onOkPressed() }
    }

    private fun onOkPressed() {
        finish()
    }
}