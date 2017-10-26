package example.com.trylv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by User on 10/26/2017.
 */

public class SongAdapter extends BaseAdapter{

    ArrayList<Song> mData;
    Context mCtx;

    public SongAdapter(Context ctx, ArrayList<Song> songs){
        mCtx = ctx;
        mData = songs;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_song,parent,false);

        TextView tvJudul = (TextView) rowView.findViewById(R.id.tvJudul);
        tvJudul.setText(mData.get(position).judul);
        TextView tvAlbum = (TextView) rowView.findViewById(R.id.tvAlbum);
        tvAlbum.setText(mData.get(position).album);

        return rowView;
    }
}
