package de.wl.andy.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2,  button3, button4, button5, button6, button7, button8,button9,
           buttonAdd, buttonSub, buttonDivi, buttonMul, button10, buttonC,buttonEqual;

    EditText EditText;

    float mValue1, mValue2;

    boolean ifAdd, ifSub, ifMul,ifDivi;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button zuordnen

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivi = (Button) findViewById(R.id.buttonDivi);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        button8 = (Button) findViewById(R.id.button8);

        //Edittext zuordnen

        EditText = (EditText) findViewById(R.id.edit1);

        //Ziffertasten werden im Text hinzugefügt

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText.setText(EditText.getText()+ "1");
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "2");
                }

        });

        button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "3");
                }

        });

        button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "4");
                }

        });

        button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "5");
                }

        });

        button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "6");
                }

        });

        button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "7");
                }

        });

        button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "8");
                }

        });

        button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "9");
                }

        });

        button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText(EditText.getText()+ "0");
                }

        });

            // Operatoren sehen sich den Text an

        buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (EditText == null) {

                        EditText.setText("");

                    } else {
                        mValue1 = Float.parseFloat(EditText.getText() + "");
                        ifAdd = true;
                        EditText.setText(null);

                    }

                }
            });

        buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (EditText == null) {

                        EditText.setText("");

                    } else {
                        mValue1 = Float.parseFloat(EditText.getText() + "");
                        ifSub = true;
                        EditText.setText(null);

                    }

                }
            });

        buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (EditText == null) {

                        EditText.setText("");

                    } else {
                        mValue1 = Float.parseFloat(EditText.getText() + "");
                        ifMul = true;
                        EditText.setText(null);

                    }

                }
            });

        buttonDivi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (EditText == null) {

                        EditText.setText("");

                    } else {
                        mValue1 = Float.parseFloat(EditText.getText() + "");
                        ifDivi = true;
                        EditText.setText(null);

                    }

                }
            });

            //Equal berechnet die Ziffern mit dem Opperatoren

        buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mValue2 = Float.parseFloat((EditText.getText()+""));

                    if (ifAdd == true) {

                        EditText.setText(mValue1 + mValue2 + "");
                        ifAdd = false;

                    }

                    if (ifSub == true) {

                        EditText.setText(mValue1 - mValue2 + "");
                        ifSub = false;

                    }

                    if (ifMul == true) {

                        EditText.setText(mValue1 * mValue2 + "");
                        ifMul = false;

                    }
                    if (ifDivi == true) {

                        EditText.setText(mValue1 / mValue2 + "");
                        ifDivi = false;

                    }


                }
            });

            //Clear setzt den EditText auf dem Normalzutand zurück

        buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText.setText("");

                }
            });

            // *10

        button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        EditText.setText(EditText.getText() + ".");
                }
            });


        }
}