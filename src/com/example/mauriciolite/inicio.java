package com.example.mauriciolite;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.sax.RootElement;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class inicio extends Fragment{
	private mostrar mostrar;
	@Override
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = inflater.inflate(R.layout.fra1, container, false);
		
		ListView list = (ListView) rootView.findViewById(R.id.listView1);
        list.setClickable(true);
        final List<contacto> contactos = new ArrayList<contacto>();
        contactos.add(new contacto("mauricio","3216547"));
        contactos.add(new contacto("javier","3258736"));
        adaptador ada= new adaptador(rootView.getContext(),contactos);
        list.setAdapter(ada);
        
        list.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
            	System.out.println("sadsfsf");
                Toast.makeText(rootView.getContext(), contactos.get(position).getNombre(), Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
	}
	
	
    
}
