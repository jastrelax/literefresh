/*
 * Copyright 2018 yinpinjiu@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package literefresh.sample.ui.fragment

import android.os.Bundle
import android.view.View
import literefresh.sample.R
import literefresh.sample.base.ui.BaseFragment
import literefresh.sample.databinding.FragmentTempBinding
import layoutbinder.annotations.BindLayout


class TempFragment : BaseFragment() {

    @BindLayout(R.layout.fragment_temp)
    lateinit var binding: FragmentTempBinding

    companion object {
        val KEY_MESSAGE = "TempFragment.KEY_MESSAGE"

        fun newInstance(message: String): TempFragment {

            val args = Bundle()
            args.putString(KEY_MESSAGE, message)
            val fragment = TempFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvMessage.text = arguments?.getString(KEY_MESSAGE)
    }
}