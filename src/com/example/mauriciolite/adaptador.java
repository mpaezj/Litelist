package com.example.mauriciolite;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class adaptador extends BaseAdapter{
	private Context context;
	private List<contacto> contactos;

	public adaptador (Context context,List<contacto> contactos){
		this.context=context;
		this.contactos=contactos;
	}
	@Override
	public int getCount() {
		return contactos.size();
	}

	@Override
	public Object getItem(int position) {
		return contactos.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		contacto entry = contactos.get(position);
		if(convertView == null){
			LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row, null);
		}
        TextView tvContact = (TextView) convertView.findViewById(R.id.nombre);
        tvContact.setText(entry.getNombre());

        TextView tvPhone = (TextView) convertView.findViewById(R.id.numero);
        tvPhone.setText(entry.getNumero());        
        return convertView;
		
	}

	

}
