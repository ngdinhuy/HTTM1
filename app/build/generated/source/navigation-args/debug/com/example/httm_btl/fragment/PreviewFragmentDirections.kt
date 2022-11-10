package com.example.httm_btl.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.httm_btl.R

public class PreviewFragmentDirections private constructor() {
  public companion object {
    public fun actionPreviewFragmentToResultFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_previewFragment_to_resultFragment)
  }
}
