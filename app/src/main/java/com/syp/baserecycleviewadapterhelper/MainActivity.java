package com.syp.baserecycleviewadapterhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.TextView;

import com.syp.baserecycleviewadapterhelper.databinding.ActivityMainBinding;
import com.syp.library.BaseRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author Song
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;

    private BaseRecycleAdapter adapter;
    private String strAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        initView();
    }

    private void initView() {
        List<String> data = new ArrayList<>();
        for (int i = 0; data.size() < 40; i++) {
            data.add(i + "");
        }

        Box<String> name = new Box<>("SL");

        adapter = new BaseRecycleAdapter(R.layout.item_cache, data);
        mainBinding.rvCache.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mainBinding.rvCache.setAdapter(adapter);

        adapter.setOnDataToViewListener((helper, item, position) -> {
            int positions = helper.getLayoutPosition();

            TextView tvNum = helper.getView(R.id.tv_num);
            TextView tvClient = helper.getView(R.id.tv_client);
            TextView tvMoney = helper.getView(R.id.tv_money);
            TextView tvPurchasePrice = helper.getView(R.id.tv_purchase_price);

            for (int i = 0; i < data.size(); i++) {
                strAmount = data.set(i, "12,456.00");
            }

            tvNum.setText(++positions + "");
            tvClient.setText(name.clientName);
            tvMoney.setText("88,886,666.886");
            tvPurchasePrice.setText(strAmount);
        });
    }

    @Data
    class Box<T> {
        private String clientName;

        public Box(String clientName) {
            this.clientName = clientName;
        }
    }
}