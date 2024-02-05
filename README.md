# Практична робота №1.2
### Тема роботи:
Створення першої програми в Android Studio для ОС Android.
### Мета роботи:
Ознайомитися з процесом написання програмних додатків для мобільних пристроїв, що працюють на базі ОС Android. Освоїти принципи додавання в програму елементів користувацького інтерфейсу та особливості обробки їх подій.
# Хід роботи

### Створення та налаштування кнопки та текстового поля
Було додано та розміщено на екрані кнопку з текстовим полем

![image](https://github.com/IlnitskijMaksim/AndroidStudio_PR1/assets/112692170/73cbfb43-2d60-4ff9-9277-e34ddfc7e4bf)

Було змінено ID кнопки та текстового поля, змінено текст кнопки та розмір шрифта текстового поля

![image](https://github.com/IlnitskijMaksim/AndroidStudio_PR1/assets/112692170/1af81a1a-2ddf-462e-a5e5-62a0ff5aca32)

### Написання коду програми

```java
package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button simpleButton;
    private TextView simpleTextView;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleButton = findViewById(R.id.simpleButton);
        simpleTextView = findViewById(R.id.simpleTextView);
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    simpleTextView.setText("Hello!");
                    i++;
                }
                else if (i == 1){
                    simpleTextView.setText("Stop pressing me!");
                    i++;
                }
                else {
                    simpleTextView.setText("\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21\uD83D\uDE21");
                }
            }
        });
    }
}
```






