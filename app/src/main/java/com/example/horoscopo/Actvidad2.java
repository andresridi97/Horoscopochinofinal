package com.example.horoscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Actvidad2 extends AppCompatActivity {
    private TextView tvh;
    private TextView tve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvidad2);
        tvh = (TextView)findViewById(R.id.textView5);
        tve = (TextView)findViewById(R.id.textView3);

    }


    public void anterior(View view){
        String dh = getIntent().getStringExtra("dias");
        String mh = getIntent().getStringExtra("meses");
        String ah = getIntent().getStringExtra("años");
        int num_d = Integer.parseInt(dh);
        int num_m = Integer.parseInt(mh);
        int num_a = Integer.parseInt(ah);
        int nan = 2019 - num_a;
        String result = String.valueOf(nan);
        tve.setText(result);
        ImageView imag = (ImageView)findViewById(R.id.imageView3);

        if(num_a == 1913 || num_a == 1925 || num_a == 1937 || num_a == 1949 || num_a == 1961 || num_a == 1973 || num_a == 1985 || num_a == 1997 || num_a == 2009) {
            String result1 = getApplicationContext().getString(R.string.rat);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.rata);
        }
        if(num_a == 1914 || num_a == 1926 || num_a == 1938 || num_a == 1950 || num_a == 1962 || num_a == 1974 || num_a == 1986 || num_a == 1998 || num_a == 2010){
            String result1 = getApplicationContext().getString(R.string.buf);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.bufa);
        }

        if(num_a == 1915 || num_a == 1927 || num_a == 1939 || num_a == 1951 || num_a == 1963 || num_a == 1975 || num_a == 1987 || num_a == 1999 || num_a == 2011){
            String result1 = getApplicationContext().getString(R.string.tig);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.tigre);
        }

        if(num_a == 1916 || num_a == 1928 || num_a == 1940 || num_a == 1952 || num_a == 1964 || num_a == 1976 || num_a == 1988 || num_a == 2000 || num_a == 2012){
            String result1 = getApplicationContext().getString(R.string.con);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.cone);
    }

        if(num_a == 1917 || num_a == 1929 || num_a == 1941 || num_a == 1953 || num_a == 1965 || num_a == 1977 || num_a == 1989 || num_a == 2001 || num_a == 2013){
            String result1 = getApplicationContext().getString(R.string.dra);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.dra);
        }

        if(num_a == 1918 || num_a == 1930 || num_a == 1942 || num_a == 1954 || num_a == 1966 || num_a == 1978 || num_a == 1990 || num_a == 2002 || num_a == 2014){
            String result1 = getApplicationContext().getString(R.string.serp);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.serp);
        }

        if(num_a == 1919 || num_a == 1931 || num_a == 1943 || num_a == 1955 || num_a == 1967 || num_a == 1979 || num_a == 1991 || num_a == 2003 || num_a == 2015){
            String result1 = getApplicationContext().getString(R.string.cab);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.caba);
        }

        if(num_a == 1920 || num_a == 1932 || num_a == 1944 || num_a == 1956 || num_a == 1968 || num_a == 1980 || num_a == 1992 || num_a == 2004 || num_a == 2016){
            String result1 = getApplicationContext().getString(R.string.cabra);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.cabra);
        }

        if(num_a == 1921 || num_a == 1933 || num_a == 1945 || num_a == 1957 || num_a == 1969 || num_a == 1981 || num_a == 1993 || num_a == 2005 || num_a == 2017){
            String result1 = getApplicationContext().getString(R.string.mon);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.mono);
        }

        if(num_a == 1922 || num_a == 1934 || num_a == 1946 || num_a == 1958 || num_a == 1970 || num_a == 1982 || num_a == 1994 || num_a == 2006 || num_a == 2018){
            String result1 = getApplicationContext().getString(R.string.gal);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.gallo);
        }

        if(num_a == 1923 || num_a == 1935 || num_a == 1947 || num_a == 1959 || num_a == 1971 || num_a == 1983 || num_a == 1995 || num_a == 2007 || num_a == 2019){
            String result1 = getApplicationContext().getString(R.string.pe);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.perro);
        }

        if(num_a == 1924 || num_a == 1936 || num_a == 1948 || num_a == 1960 || num_a == 1972 || num_a == 1984 || num_a == 1996 || num_a == 2008 || num_a == 2020){
            String result1 = getApplicationContext().getString(R.string.cer);
            tvh.setText(result1);
            imag.setImageResource(R.drawable.cerdo);
        }






    }

    public void Regresar(View view){
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }
}
