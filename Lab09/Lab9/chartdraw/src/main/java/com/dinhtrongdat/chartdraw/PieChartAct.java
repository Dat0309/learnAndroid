package com.dinhtrongdat.chartdraw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> visitors = new ArrayList<>();
        visitors.add(new PieEntry(getIntent().getIntExtra("t2",0),"Thứ 2"));
        visitors.add(new PieEntry(getIntent().getIntExtra("t3",0),"Thứ 3"));
        visitors.add(new PieEntry(getIntent().getIntExtra("t4",0),"Thứ 4"));
        visitors.add(new PieEntry(getIntent().getIntExtra("t5",0),"Thứ 5"));
        visitors.add(new PieEntry(getIntent().getIntExtra("t6",0),"Thứ 6"));
        visitors.add(new PieEntry(getIntent().getIntExtra("t7",0),"Thứ 7"));
        visitors.add(new PieEntry(getIntent().getIntExtra("cn",0),"Chủ nhật"));

        PieDataSet pieDataSet = new PieDataSet(visitors, "Chú thích");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Pie Chart");
        pieChart.animate();;
    }
}