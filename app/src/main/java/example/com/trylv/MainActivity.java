package example.com.trylv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Song> songs;
    ListView lvSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDummySongs();

        lvSongs = (ListView) findViewById(R.id.lvSongs);
        lvSongs.setAdapter(new SongAdapter(this,songs));
        lvSongs.setOnItemClickListener(this);

    }

    private void initDummySongs() {
        songs = new ArrayList<>();
        songs.add(new Song("Heal the World","Best of MJ"));
        songs.add(new Song("Thriller","Best of MJ"));
        songs.add(new Song("We are the champion","The Beatles"));
        songs.add(new Song("Bicycle","The Beatles"));
        songs.add(new Song("ASDASD","One Republic"));
        songs.add(new Song("I live","One Republic"));
        songs.add(new Song("Heal the World","Best of MJ"));
        songs.add(new Song("Thriller","Best of MJ"));
        songs.add(new Song("We are the champion","The Beatles"));
        songs.add(new Song("Bicycle","The Beatles"));
        songs.add(new Song("ASDASD","One Republic"));
        songs.add(new Song("I live","One Republic"));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Playing: "+songs.get(position).judul, Toast.LENGTH_LONG).show();
    }
}
