package tsingtaopad.et.liststretchdemo;

import java.util.ArrayList;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;
	private ListAdapter adapter;
	private ArrayList<Hotel> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.list);
		list = new ArrayList<Hotel>();
		list.add(new Hotel("中明洞天空花园酒店", "7", "2699", "20"));
		list.add(new Hotel("上海中福大酒店", "7.5", "459", "23"));
		list.add(new Hotel("上海中福世福汇大酒店", "8", "616", "21"));
		list.add(new Hotel("桔子酒店精选", "8", "359", "3"));
		list.add(new Hotel("上海广场嘉廷酒店", "5", "369", "6.8"));
		
		/*list.add(new Hotel("上海光大会展中心国际大酒店", "9", "448", "21"));
		list.add(new Hotel("上海华美国际酒店", "7.5", "270", "17"));
		list.add(new Hotel("24K国际连锁酒店", "8", "189", "9"));
		list.add(new Hotel("上海五角场智选假日酒店", "7", "441", "3"));
		list.add(new Hotel("上海裕景大饭店", "8", "792", "16"));
		
		list.add(new Hotel("上海金茂君悦大酒店", "9", "2174", "36"));
		list.add(new Hotel("宜必思仁寺洞首尔大使酒店", "7", "550", "19"));
		list.add(new Hotel("中明洞天空花园酒店", "7", "2699", "20"));
		list.add(new Hotel("上海中福大酒店", "7.5", "459", "23"));
		list.add(new Hotel("上海中福世福汇大酒店", "8", "616", "21"));
		list.add(new Hotel("桔子酒店精选", "8", "359", "3"));
		list.add(new Hotel("上海广场嘉廷酒店", "5", "369", "6.8"));
		
		list.add(new Hotel("上海光大会展中心国际大酒店", "9", "448", "21"));
		list.add(new Hotel("上海华美国际酒店", "7.5", "270", "17"));
		list.add(new Hotel("24K国际连锁酒店", "8", "189", "9"));
		list.add(new Hotel("上海五角场智选假日酒店", "7", "441", "3"));
		list.add(new Hotel("上海裕景大饭店", "8", "792", "16"));
		
		list.add(new Hotel("上海金茂君悦大酒店", "9", "2174", "36"));
		list.add(new Hotel("宜必思仁寺洞首尔大使酒店", "7", "550", "19"));*/
		    
		adapter = new ListAdapter(this, list);
		listView.setAdapter(adapter);
	}


}