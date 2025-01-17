package kr.ac.kpu.ce2019152012.hair_you.designer.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kr.ac.kpu.ce2019152012.hair_you.adapter.MyChattingRecyclerviewAdapter
import kr.ac.kpu.ce2019152012.hair_you.databinding.FragmentDesignerChattingBinding

class DesignerChattingFragment : Fragment() {

    private lateinit var binding: FragmentDesignerChattingBinding
    private lateinit var mAdapter : MyChattingRecyclerviewAdapter
    private lateinit var mChatRecyclerView: RecyclerView

 

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDesignerChattingBinding.bind(view)
        // Activity의 Oncreate에서 했던 작업을 여기에서 한다

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDesignerChattingBinding.inflate(inflater, container, false);

        mChatRecyclerView=binding.chattingRcv
        mAdapter= MyChattingRecyclerviewAdapter()

        mChatRecyclerView.adapter=mAdapter
        mChatRecyclerView.layoutManager=LinearLayoutManager(getActivity())
        mChatRecyclerView.layoutManager=LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false)


        return binding.root
    }
}