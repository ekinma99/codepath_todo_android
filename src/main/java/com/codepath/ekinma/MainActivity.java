package com.codepath.ekinma;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import java.util.ArrayList;
        import java.util.List;

        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;
        import android.widget.Button;
        import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    TextView etItem;
    RecyclerView rvItems;
    List <String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items= new ArrayList<String>();
        items.add("Java");
        items.add("Kotlin");
        items.add("Javascript");
        setContentView(R.layout.activity_main);
        btnAdd= findViewById(R.id.btnAdd);
        etItem=findViewById(R.id.etItem);
        rvItems=findViewById(R.id.rvItems);
       // etItem.setText("Lord, what's this mess!");
        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        rvItems.setAdapter(itemsAdapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));

    }
}