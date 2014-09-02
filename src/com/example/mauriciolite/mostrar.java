package com.example.mauriciolite;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class mostrar  extends Fragment{
	private Button button2;
	private TextView mTextView;
	private TextView mTextView2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.mostrar, container, false);

		mTextView = (TextView) rootView.findViewById(R.id.nombre);
		mTextView2 = (TextView) rootView.findViewById(R.id.numero);

		Integer val = getArguments().getInt("someInt", 0);

		mTextView.setText(getArguments().getString("nombre").toString());
		mTextView2.setText(getArguments().getString("numero").toString());

		button2 = (Button) rootView.findViewById(R.id.salir);

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				getActivity().getSupportFragmentManager().popBackStack();
			}
		});

		return rootView;
	}

}
