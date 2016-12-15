package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvComa,
            tvCero,
            tvIgual,
            tvUno,
            tvDos,
            tvTres,
            tvCuatro,
            tvCinco,
            tvSeis,
            tvSiete,
            tvOcho,
            tvNueve,
            tvCE,
            tvDivision,
            tvMultiplicacion,
            tvResta,
            tvSuma,
            tvResultado;
    private String ini="0";
    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        tvComa=(TextView)findViewById(R.id.tvComa);
        tvCero=(TextView)findViewById(R.id.tvCero);
        tvIgual=(TextView)findViewById(R.id.tvIgual);
        tvUno=(TextView)findViewById(R.id.tvUno);
        tvDos=(TextView)findViewById(R.id.tvDos);
        tvTres=(TextView)findViewById(R.id.tvTres);
        tvCuatro=(TextView)findViewById(R.id.tvCuatro);
        tvCinco=(TextView)findViewById(R.id.tvCinco);
        tvSeis=(TextView)findViewById(R.id.tvSeis);
        tvSiete=(TextView)findViewById(R.id.tvSiete);
        tvOcho=(TextView)findViewById(R.id.tvOcho);
        tvNueve=(TextView)findViewById(R.id.tvNueve);
        tvCE=(TextView)findViewById(R.id.tvCE);
        tvDivision=(TextView)findViewById(R.id.tvDivision);
        tvMultiplicacion=(TextView)findViewById(R.id.tvMultiplicacion);
        tvResta=(TextView)findViewById(R.id.tvResta);
        tvSuma=(TextView)findViewById(R.id.tvSuma);
        tvResultado=(TextView)findViewById(R.id.tvResultado);
        tvResultado.setText(ini);
    }

    public void ce(View view){
        tvResultado.setText(ini);
    }
    public void coma(View view){
        res=tvResultado.getText().toString();
        int sw=0,sw1=0;
        String num1="",num2="";
        int l=res.length();
        for (int i=1;i<=l;i++){
            String s=res.substring(i-1,i);
            if (esNum(s)){
                if (sw==0){
                    num1=num1+s;
                }else{
                    num2=num2+s;
                }
            }else{
                sw++;
            }
        }
        if (num2.equals("")){
            int l1=num1.length();
            for(int i=1;i<=l1;i++){
                String s=num1.substring(i-1,i);
                if (s.equals(".")){
                    sw1++;
                }
            }
            if (sw1==0){
                tvResultado.setText(res+".");
            }
        }else{
            int l1=num2.length();
            for(int i=1;i<=l1;i++){
                String s=num2.substring(i-1,i);
                if (s.equals(".")){
                    sw1++;
                }
            }
            if (sw1==0){
                tvResultado.setText(res+".");
            }
        }
    }
    public void cero(View view){
        res=tvResultado.getText().toString();
        if (!res.equals(ini)){
            tvResultado.setText(res+"0");
        }
    }
    public void uno(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(res+"1");
        }
    }
    public void dos(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(res+"2");
        }
    }
    public void tres(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(res+"3");
        }
    }
    public void cuatro(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(res+"4");
        }
    }
    public void cinco(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(res+"5");
        }
    }
    public void seis(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(res+"6");
        }
    }
    public void siete(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(res+"7");
        }
    }
    public void ocho(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(res+"8");
        }
    }
    public void nueve(View view){
        res=tvResultado.getText().toString();
        if (res.equals(ini)){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(res+"9");
        }
    }
    public void division(View view){
        res=tvResultado.getText().toString();
        tvResultado.setText(res+"/");
    }
    public void multiplicacion(View view){
        res=tvResultado.getText().toString();
        tvResultado.setText(res+"*");
    }
    public void resta(View view){
        res=tvResultado.getText().toString();
        tvResultado.setText(res+"-");
    }
    public void suma(View view){
        res=tvResultado.getText().toString();
        tvResultado.setText(res+"+");
    }
    public void igual(View view){
        res=tvResultado.getText().toString();
        String num1="",num2="",signo="";
        int sw=0;
        int l=res.length();
        for (int i=1;i<=l;i++){
            String s=res.substring(i-1,i);
            if (esNum(s)){
                if (sw==0){
                    num1=num1+s;
                }else{
                    num2=num2+s;
                }
            }else{
                signo=s;
                sw++;
            }
        }
        double n1=Double.parseDouble(num1);
        double n2=Double.parseDouble(num2);
        double calculo=0;
        switch (signo){
            case "/":
                calculo=n1/n2;
            break;
            case "*":
                calculo=n1*n2;
                break;
            case "-":
                calculo=n1-n2;
                break;
            case "+":
                calculo=n1+n2;
                break;
        }
        tvResultado.setText(calculo+"");
    }
    public boolean esNum(String x){
        if(x.equals("0")||x.equals("1")||x.equals("2")||x.equals("3")
                ||x.equals("4")||x.equals("5")||x.equals("6")
                ||x.equals("7")||x.equals("8")||x.equals("9")||x.equals(".")){
            return true;
        }else{
            return false;
        }
    }
}
