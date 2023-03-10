package com.example.giuaky.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.giuaky.R;
import com.example.giuaky.adapter.TourAdapter;
import com.example.giuaky.adapter.TourNoiBatAdapter;
import com.example.giuaky.model.Tour;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        List<Tour> items = new ArrayList<>();
        items.add(new Tour(R.drawable.bien1, "Bi???n Ng???c"));
        items.add(new Tour(R.drawable.bien2, "Bi???n L?? S??n"));
        items.add(new Tour(R.drawable.bien3, "Bi???n Kh??nh H??a"));
        items.add(new Tour(R.drawable.bien4, "Bi???n V??ng T??u"));
        TourAdapter adapter = new TourAdapter(getActivity(), items);
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerView2 = view.findViewById(R.id.my_recycler_view2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        List<Tour> items2 = new ArrayList<>();
        items2.add(new Tour(R.drawable.bien1, "Bi???n Ng???c"));
        items2.add(new Tour(R.drawable.bien2, "Bi???n L?? S??n"));
        items2.add(new Tour(R.drawable.bien3, "Bi???n Kh??nh H??a"));
        items2.add(new Tour(R.drawable.bien4, "Bi???n V??ng T??u"));
        TourNoiBatAdapter adapter2 = new TourNoiBatAdapter(getActivity(), items2);
        recyclerView2.setAdapter(adapter2);

        return view;
    }
}