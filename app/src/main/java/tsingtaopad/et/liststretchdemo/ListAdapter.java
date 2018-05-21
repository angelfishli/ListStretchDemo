package tsingtaopad.et.liststretchdemo;

import java.util.ArrayList;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListAdapter extends BaseAdapter {

	private LayoutInflater inflater = null;
	private ArrayList<Hotel> list = null;
	private int currentItem = -1;
	private Context context = null;

	public ListAdapter(Context context, ArrayList<Hotel> list) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.inflater = LayoutInflater.from(context);
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Hotel getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.cabin_more_item, null);
			holder.name = (TextView) convertView.findViewById(R.id.tv_name);
			holder.zhekou = (TextView) convertView.findViewById(R.id.tv_zhekou);
			holder.price = (TextView) convertView.findViewById(R.id.tv_price);
			holder.num = (TextView) convertView.findViewById(R.id.tv_number);
			holder.rl_title = (RelativeLayout) convertView.findViewById(R.id.rl_title);
			holder.ll_footer = (LinearLayout) convertView.findViewById(R.id.ll_footer);
			holder.tui = (Button)convertView.findViewById(R.id.button_tui);
			holder.ding = (Button)convertView.findViewById(R.id.button_ding);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		final Hotel hotel = list.get(position);
		if (currentItem == position) {
			holder.ll_footer.setVisibility(View.VISIBLE);
		} else {
			holder.ll_footer.setVisibility(View.GONE);
		}
		holder.rl_title.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int tag = (Integer) v.getTag();
				if (tag == currentItem) {
					currentItem = -1;
				} else {
					currentItem = tag;
				}
				notifyDataSetChanged();
			}
		});
		holder.tui.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(context, "我要退"+hotel.getName(), Toast.LENGTH_SHORT).show();
			}
		});
		holder.ding.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(context, "我定退"+hotel.getName(), Toast.LENGTH_SHORT).show();
			}
		});
		
		holder.name.setText(hotel.getName());
		holder.zhekou.setText("折："+hotel.getZhe());
		holder.price.setText(hotel.getPrice());
		holder.num.setText("剩余："+hotel.getNum());
		holder.rl_title.setTag(position);
		return convertView;
	}
	
	class ViewHolder {
		public RelativeLayout rl_title;
		public TextView name;
		public TextView zhekou;
		public TextView price;
		public TextView num;
		public LinearLayout ll_footer;
		public Button tui;
		public Button ding;

	}
	
}