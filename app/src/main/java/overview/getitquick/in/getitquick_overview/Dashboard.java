package overview.getitquick.in.getitquick_overview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Dashboard extends Activity {
GridView mGrid;
    ArrayList<GridStruct> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mGrid= (GridView) findViewById(R.id.grid_dashboard);
        list=new ArrayList<GridStruct>();
        list.add(new GridStruct(R.drawable.dates,"Red Dates","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.mango,"Mango","Small description","Rs.65"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));
        list.add(new GridStruct(R.drawable.dates,"Red Dates","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.mango,"Mango","Small description","Rs.65"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));
        list.add(new GridStruct(R.drawable.dates,"Red Dates","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.mango,"Mango","Small description","Rs.65"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));
        list.add(new GridStruct(R.drawable.pears,"Fresh Pears","Small description","Rs.180"));
        list.add(new GridStruct(R.drawable.pineapple,"PineApple","Small description","Rs.88"));
        list.add(new GridStruct(R.drawable.star_fruit,"Star Fruit","Small description","Rs.105"));
        list.add(new GridStruct(R.drawable.strawberry,"Strawberry","Small description","Rs.135"));
        list.add(new GridStruct(R.drawable.watermelon,"Water Melon","Small description","Rs.45"));

        mGrid.setAdapter(new gridAdapter(this,list));

        mGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(Dashboard.this,ProductView.class));
            }
        });
    }

class GridStruct{
    private int img;
    private String title;
    private String desc;
    private String price;


    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getPrice() {
        return price;
    }

    GridStruct(int img, String title, String desc, String price) {
        this.img = img;
        this.title = title;
        this.desc = desc;
        this.price = price;
    }
}

    class gridAdapter extends BaseAdapter{
        ArrayList<GridStruct> g;
        Context c;
        ImageView img;
        TextView title;
        TextView desc;
        TextView price;

        gridAdapter(Context c, ArrayList<GridStruct> list) {
            this.c = c;
            this.g = list;

        }


        @Override
        public int getCount() {
            return g.size();
        }

        @Override
        public Object getItem(int i) {
            return g.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            if(view==null){
                LayoutInflater inflater= (LayoutInflater) c.getSystemService(LAYOUT_INFLATER_SERVICE);
                view=inflater.inflate(R.layout.dashboard_grid_layout,null);

            }
            img= (ImageView) view.findViewById(R.id.grid_layout_img);
            title=(TextView) view.findViewById(R.id.grid_layout_title);

            price=(TextView) view.findViewById(R.id.grid_layout_price);

            img.setImageResource(g.get(position).getImg());
            title.setText(g.get(position).getTitle());

            price.setText(g.get(position).getPrice());

            return view;
        }

        class reTag{

        }
    }

}
