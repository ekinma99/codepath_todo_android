package com.codepath.ekinma;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import java.util.ArrayList;
        import java.util.List;
        import android.view.View;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;
        import android.widget.Button;
        import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    TextView etItem;
    RecyclerView rvItems;
    ItemsAdapter itemsAdapter;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        etItem = findViewById(R.id.etItem);
        rvItems = findViewById(R.id.rvItems);
        //etItem.setText("wWhat's this!");
        // This list should automatically populate when I open the app    
        items = new ArrayList<String>();
        items.add("Java");
        items.add("Kotlin");
        items.add("Javascript");
        final ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        rvItems.setAdapter(itemsAdapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String todoItem = etItem.getText().toString();
                itemsAdapter.notifyItemInserted(items.size() - 1);
                etItem.setText("");
            }
        });
    }
}
