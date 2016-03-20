package com.example.android.sandubamix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MontandoActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montando);
    }

//    public void preco(View view){
//        Intent intent = new Intent(this, PrecoActivity.class);
//        startActivity(intent);
//    }



    private int valorSanduba(boolean pBurguer, boolean pDeForma, boolean pIntegral,boolean hBoi,boolean hFrango, boolean hFile, boolean hFileFrango, boolean qCheddar, boolean qPrato, boolean qMussarela, boolean fPresunto, boolean fPeru, boolean fDefumado, boolean sAlface, boolean sRucula, boolean sPepino, boolean sTomate, boolean sCebola, boolean sAzeitona, boolean mMaionese, boolean mCatchup, boolean mMostarda) {
        int preco = 0;

        if (pBurguer){
            preco = preco + 2;
        }
        if (pDeForma){
            preco = preco + 2;
        }
        if (pIntegral){
            preco = preco + 2;
        }

        if (hBoi){
            preco = preco + 2;
        }
        if (hFrango){
            preco = preco + 2;
        }
        if (hFile){
            preco = preco + 4;
        }
        if (hFileFrango){
            preco = preco + 3;
        }

        if (qCheddar){
            preco = preco + 2;
        }
        if (qPrato){
            preco = preco + 2;
        }
        if (qMussarela){
            preco = preco + 1;
        }
        if (fPresunto){
            preco = preco + 1;
        }
        if (fPeru){
            preco = preco + 2;
        }
        if (fDefumado){
            preco = preco + 3;
        }

        if (sAlface){
            preco = preco + 1;
        }
        if (sRucula){
            preco = preco + 1;
        }
        if (sPepino){
            preco = preco + 1;
        }
        if (sTomate){
            preco = preco + 1;
        }
        if (sCebola){
            preco = preco + 1;
        }
        if (sAzeitona){
            preco = preco + 1;
        }

        if (mMaionese){
            preco = preco + 1;
        }
        if (mCatchup){
            preco = preco + 1;
        }
        if (mMostarda){
            preco = preco + 2;
        }

        int price = preco;
        return price;
    }

    public void pronto(View view){
        EditText nameField = (EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        RadioButton paoHamburguer = (RadioButton)findViewById(R.id.radio_hamburguer);
        boolean comHamburguer = paoHamburguer.isChecked();
        RadioButton paoForma = (RadioButton)findViewById(R.id.radio_forma);
        boolean comForma = paoForma.isChecked();
        RadioButton paoIntegral = (RadioButton)findViewById(R.id.radio_integral);
        boolean comIntegral = paoIntegral.isChecked();

        CheckBox hamburguer =(CheckBox) findViewById(R.id.boi);
        boolean hamBoi = hamburguer.isChecked();
        CheckBox frango =(CheckBox) findViewById(R.id.frango);
        boolean hamFrango = frango.isChecked();
        CheckBox file =(CheckBox) findViewById(R.id.file);
        boolean hamFile = file.isChecked();
        CheckBox fileFrango =(CheckBox) findViewById(R.id.filefrango);
        boolean hamFileFrango = fileFrango.isChecked();

        CheckBox cheddar =(CheckBox) findViewById(R.id.cheddar);
        boolean comCheddar = cheddar.isChecked();
        CheckBox prato =(CheckBox) findViewById(R.id.prato);
        boolean comPrato = prato.isChecked();
        CheckBox mussarela =(CheckBox) findViewById(R.id.mussarela);
        boolean comMussarela = mussarela.isChecked();
        CheckBox presunto =(CheckBox) findViewById(R.id.presunto);
        boolean comPresunto = presunto.isChecked();
        CheckBox peru =(CheckBox) findViewById(R.id.peru);
        boolean comPeru = peru.isChecked();
        CheckBox defumado =(CheckBox) findViewById(R.id.defumado);
        boolean comDefumado = defumado.isChecked();

        CheckBox alface =(CheckBox) findViewById(R.id.alface);
        boolean comAlface = alface.isChecked();
        CheckBox rucula =(CheckBox) findViewById(R.id.rucula);
        boolean comRucula = rucula.isChecked();
        CheckBox pepino =(CheckBox) findViewById(R.id.pepino);
        boolean comPepino = pepino.isChecked();
        CheckBox tomate =(CheckBox) findViewById(R.id.tomate);
        boolean comTomate = tomate.isChecked();
        CheckBox cebola =(CheckBox) findViewById(R.id.cebola);
        boolean comCebola = cebola.isChecked();
        CheckBox azeitona =(CheckBox) findViewById(R.id.azeitona);
        boolean comAzeitona = azeitona.isChecked();

        CheckBox maionese =(CheckBox) findViewById(R.id.maionese);
        boolean comMaionese = maionese.isChecked();
        CheckBox catchup =(CheckBox) findViewById(R.id.catchup);
        boolean comCatchup = catchup.isChecked();
        CheckBox mostarda =(CheckBox) findViewById(R.id.mostarda);
        boolean comMostarda = mostarda.isChecked();

        String priceMessege = createOrderSummary(name, valorSanduba(comHamburguer, comForma, comIntegral, hamBoi, hamFrango, hamFile, hamFileFrango, comCheddar, comPrato, comMussarela, comPresunto, comPeru, comDefumado, comAlface, comRucula, comPepino, comTomate, comCebola, comAzeitona, comMaionese, comCatchup, comMostarda));
        displayMessage(priceMessege);
    }

    private String createOrderSummary(String name, int price){
        return
                "Seu Sanduba " +name+

                "\n\n Total: R$"+price+
                "\n Obrigado!";

    }

    private void displayMessage(String message) {
       TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
      orderSummaryTextView.setText(message);
    }

}
