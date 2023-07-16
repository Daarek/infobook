package com.example.infobook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class info extends AppCompatActivity {

    List<Object> objects = new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        RecyclerView rec = findViewById(R.id.list);
        adapter adapt = new adapter(this, objects);
        rec.setAdapter(adapt);

        Bundle got = getIntent().getExtras();
        String type = got.getString("class");

        TextView rule = findViewById(R.id.boxrule);

        switch (type){
            case "safe":
                objects.add(new Object("SCP-005", "Отмычка", "Содержание не требуется. Способность открывать любые виды замков"));
                objects.add(new Object("SCP-168", "Разумный калькулятор", "Содержание не требуется. Калькулятор, умеющий задавать вопросы"));
                rule.setText("Правило коробки: если положить обьект в коробку, убрать подальше, и ничего плохого не случится - это 'Безопасный'");
                break;
            case "euclid":
                objects.add(new Object("SCP-101", "Голодная сумка", "Содержится в огнеупорном запирающемся подвале. Сумка с человеческим ртом, способная изменять свои форму и размеры"));
                objects.add(new Object("SCP-934", "Материковый маяк", "Маяк возле [XXX], способный создавать аномальный туман"));
                rule.setText("Правило коробки: если положить обьект в коробку, убрать подальше, и вы не знаете что произойдет - это 'Евклид'");
                break;
            case "keter":
                objects.add(new Object("SCP-076", "Авель", "Содержится в магмово-базальтовой зоне на глубине 200м под уровнем моря. Представляет из себя агрессивное гуманоидное существо"));
                objects.add(new Object("SCP-090", "Кубик Апокрубика", "Хранится в бункере специального комплекса. Представляет из себя куб 100х100 перестраивающий сам себя. При сборке участков из нескольких сегментов происходят различные бедствия. Полная сборка предположительно приведет к концу света класса XK"));
                rule.setText("Правило коробки: если положить обьект в коробку, убрать подальше, и произойдет катастрофа - это 'Кетер'");
                break;
            case "thaumiel":
                objects.add(new Object("SCP-179", "Сестра солнца", "Не содержится. Гуманойдное существо на орбите солнца, способное предугадывать бедствия и катаклизмы"));
                objects.add(new Object("SCP-411", "Старик-контрамот", "Аномальный человек европиоидной рассы. Процесс старения обьекта идет в обратную сторону, а так же он способен вспоминать будущее"));
                rule.setText("Правило коробки: если обьект и есть коробка - это 'Таумиель'");
                break;
            case "special":
                objects.add(new Object("SCP-139", "Глаз да глаз за Люциан", "Является событием. Представляет из себя ряд аномальных событий с изчесновением специалиста по безопасности Люциана Сакс"));
                rule.setText("Правило коробки: если обьект нельзя положить в коробку - это 'Специальный'");
                break;
        }


        objects.add(new Object("Info", "SCP foundation", "SCP - вымышленная вселенная, проект сделан по её модели"));
    }
}