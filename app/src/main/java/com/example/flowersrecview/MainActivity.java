package com.example.flowersrecview;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFlowers;
    private ArrayList<String> flowersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvFlowers = findViewById(R.id.rv_flowers);
        loadData();

        FlowersAdapters flowersAdapters = new FlowersAdapters(flowersList);
        rvFlowers.setAdapter(flowersAdapters);

    }

    private void loadData() {

        flowersList.add("роза");
        flowersList.add("пион");
        flowersList.add("астра");
        flowersList.add("тюльпан");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
        flowersList.add("роза");
    }
}