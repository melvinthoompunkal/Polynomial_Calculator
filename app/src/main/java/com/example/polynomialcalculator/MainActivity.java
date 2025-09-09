package com.example.polynomialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonDelete;
    Button buttonClear;
    Button buttonAdd;
    Button buttonSubtract;
    Button buttonMultiply;
    Button buttonExponent;
    Button buttonDivision;
    Button buttonCalculate;
    Button buttonVariable;
    TextView onTopText;

    String str = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonClear = findViewById(R.id.buttonClear);
        buttonAdd = findViewById(R.id.buttonAddition);
        buttonSubtract = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonExponent = findViewById(R.id.buttonExponent);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonCalculate = findViewById(R.id.buttonEqual);
        buttonVariable = findViewById(R.id.buttonVariable);
        onTopText = findViewById(R.id.textViewTop);

        onTopText.setText("");
        ArrayList<String> num = new ArrayList<String>();
        int total = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "1";
                onTopText.setText(str);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "2";
                onTopText.setText(str);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "3";
                onTopText.setText(str);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "4";
                onTopText.setText(str);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "5";
                onTopText.setText(str);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "6";
                onTopText.setText(str);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "7";
                onTopText.setText(str);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "8";
                onTopText.setText(str);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "9";
                onTopText.setText(str);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str += "0";
                onTopText.setText(str);

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                str = "";
                onTopText.setText(str);

            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                onTopText.setText(((String)onTopText.getText()));
                if(str.length()>=1)
                {
                    str = str.substring(0,str.length()-1);
                }
                onTopText.setText(str);

            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "+";
                onTopText.setText(str);
            }

        });
        buttonSubtract.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "-";
                onTopText.setText(str);


            }

        });
        buttonMultiply.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "*";
                onTopText.setText(str);
            }

        });
        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "/";
                onTopText.setText(str);
            }

        });
        buttonVariable.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "X";
                onTopText.setText(str);
            }

        });
        buttonExponent.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view)
            {
                onTopText.setText(((String)onTopText.getText()));
                str+= "^";
                onTopText.setText(str);
            }

        });
        buttonCalculate.setOnClickListener(new View.OnClickListener(){
            @Override


            public void onClick(View view)
            {


                onTopText.setText((calculate(str ,num,  total )));

            }

        });





    }



    public static boolean errCheck(String str)
    {
        if(str.length()> 0) {
            for (int i = 0; i < str.length() - 1; i++) {
                char a = str.charAt(i);
                char b = str.charAt(i + 1);
                // ^+
                if (a == '^' && (b == '+' || b == '-' || b == '*' || b == '^' || b == 'X')) {
                    return true;
                }
                // +^
                else if (a == '+' && (b == '+' || b == '-' || b == '*' || b == '^')) {
                    return true;
                }
                // 3X3 (like its the variable)
                else if (a == 'X' && (Character.isDigit(b) || b == '^')) {
                    return true;
                }

            }
        }
        return false;
    }
    public static ArrayList<String> polyCheck(ArrayList<String> nums)
    {
        int bub = 0;
        for(int i = 0; i<nums.size()-1; i++)
        {
            String item = nums.get(i);
            //this solves like actual exponents and not coefficients
            if(item.contains("^") && !item.contains("X"))
            {
               try {
                   int base = Integer.parseInt(item.substring(0, item.indexOf("^")));
                   int temp = item.indexOf("^");
                   int exponent = Integer.parseInt(item.substring(item.indexOf("^")), temp + 1);
                   String end = Integer.toString((int)(Math.pow(base, exponent)));
                   if (Integer.parseInt(end) == Integer.MAX_VALUE) {
                       throw new NumberFormatException();
                   }else {
                       nums.set(i, end);
                   }
                   //if the number too big
               }catch(NumberFormatException e)
               {
                   throw new NumberFormatException();
               }
            }
        }

        for(int i=0; i<nums.size(); i++){
            String item = nums.get(i);
            if(item.equals("-")){
                nums.set(i, "+");
                nums.set(i+1, "-" + nums.get(i+1));
            }
        }
        for(int i=0; i<nums.size(); i++){
            String item = nums.get(i);
            if(item.equals("-")){
                nums.set(i, "+");
                nums.set(i+1, "-" + nums.get(i+1));
            }
        }

        return nums;
    }

    public static ArrayList<String> polyOrder (ArrayList<String> nums)
    {
        int biggestExp;
        int firstExp;
        int secondExp;
        String maxNum;
        for(int i = 0; i<nums.size()-1; i++)
        {
            String firstItem = nums.get(i);

            if(firstItem.contains("^")) {
                firstExp = Integer.parseInt(firstItem.substring(firstItem.indexOf("^")+1));
            }
            else if (firstItem.contains("X")) {
                firstExp = 1;
            }
            else {
                firstExp = 0;
            }

            biggestExp = firstExp;
            maxNum = firstItem;

            for(int j = i+1; j<nums.size(); j++)
            {
                String secondItem = nums.get(j);
                if(secondItem.contains("^"))
                {
                    secondExp = Integer.parseInt(secondItem.substring(secondItem.indexOf("^")+1));
                }
                else if(secondItem.contains("X"))
                {
                    secondExp = 1;
                }
                else {
                    secondExp = 0;
                }

                if(secondExp > biggestExp)
                {
                    biggestExp = secondExp;
                    maxNum = secondItem;

                }
            }
            Collections.swap(nums, nums.indexOf(maxNum), nums.indexOf(firstExp));
        }
        for(int i=0; i<nums.size(); i++){
            String item = nums.get(i);
            System.out.println(item);
            if(i%2!=0 && i!=nums.size() && item.contains("-")){
                nums.set(i, item.substring(item.indexOf("-")+1));
                nums.add(i, "-");
            }
            else if(i%2!=0 && i!=nums.size()){
                nums.add(i, "+");
            }
        }

        return nums;
    }

    public static ArrayList<String> Multiply (ArrayList<String> nums) {
        int constant = 1;
        int exp = 0;
        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).equals("*")) {
                StringTokenizer before = new StringTokenizer(nums.get(i - 1), "X", true);
                StringTokenizer after = new StringTokenizer(nums.get(i + 1), "X", true);


                while (before.hasMoreTokens()) {
                    String term1 = before.nextToken();
                    if (term1.equals("x")) {
                        exp++;
                    } else if (term1.contains("^")) {
                        temp = Integer.parseInt(term1.substring(term1.indexOf("^") + 1)) - 1;
                        exp += temp;
                    } else {
                        constant *= Integer.parseInt(term1);
                    }
                }
                //term 2, checking if it has an exponent, variable, and constant
                while (after.hasMoreTokens()) {
                    String term2 = after.nextToken();
                    if (term2.equals("x")) {
                        exp++;
                    } else if (term2.contains("^")) {
                        temp = Integer.parseInt(term2.substring(term2.indexOf("^") + 1)) - 1;

                        exp += temp;
                    } else {
                        constant *= Integer.parseInt(term2);
                    }
                }
            }


        }
        return nums;
    }

    public static ArrayList<String> Addition (ArrayList<String> nums)
    {
        for(int i=nums.size()-1; i>=0; i--){
            if(nums.get(i).equals("+")){
                nums.remove(i);
            }
        }
        for(int i=0; i<nums.size(); i++){
            String term1 = nums.get(i);
            String exp1;
            boolean exp = false;
            boolean variable = false;
            //find degree of polynomial to compare with
            if(term1.contains("^")){
                exp1 = term1.substring(term1.indexOf("^")+1);
                exp = true;
            }
            else if(term1.contains("x")){
                exp1 = "1";
                variable = true;
            }
            else{
                exp1 = "0";
            }
            for(int j=0; j<nums.size(); j++){
                String term2 = nums.get(j);
                String exp2;
                int constant=0;
                //find degree of polynomial to compare with
                if(term2.contains("^")){
                    exp2 = term2.substring(term2.indexOf("^")+1);
                }
                else if(term2.contains("x")){
                    exp2 = "1";
                }
                else{
                    exp2 = "0";
                }
                //compare to see if any are equal
                if(exp1.equals(exp2) && i!=j){
                    if(term1.contains("x")){
                        try{
                            constant += Integer.parseInt(term1.substring(0,term1.indexOf("x")));
                        }catch(NumberFormatException e){
                            if(term1.contains("-")){
                                constant += -1;
                            }
                            else{
                                constant += 1;
                            }
                        }
                    }
                    else{
                        constant += Integer.parseInt(term1);
                    }
                    if(term2.contains("x")){
                        try{
                            constant += Integer.parseInt(term2.substring(0,term2.indexOf("x")));
                        }catch(NumberFormatException e){
                            if(term2.contains("-")){
                                constant += -1;
                            }
                            else{
                                constant += 1;
                            }
                        }
                    }
                    else{
                        constant += Integer.parseInt(term2);
                    }
                    //replacing the term and deleting the other two terms
                    if(exp){
                        nums.set(nums.indexOf(term2), constant + "x^" + exp1);
                        nums.remove(term1);
                        i--;
                        if(i<0){
                            i=0;
                        }
                        term1 = constant + "x^" + exp1;
                    }
                    else if(variable){
                        nums.set(nums.indexOf(term2), constant + "x");
                        nums.remove(term1);
                        i--;
                        if(i<0){
                            i=0;
                        }
                        term1 = constant + "x";
                    }
                    else{
                        nums.set(nums.indexOf(term2), Integer.toString(constant));
                        nums.remove(term1);
                        i--;
                        if(i<0){
                            i=0;
                        }
                        term1 = Integer.toString(constant);
                    }
                }
            }
        }


        return nums;
    }



    public static String calculate(String str, ArrayList<String> nums,  int total)
    {
        if(!errCheck(str)) {
            StringTokenizer s = new StringTokenizer(str, "*+-/", true);
            while (s.hasMoreTokens()) {
                nums.add(s.nextToken());
            }

            try{
                nums = polyCheck(nums);
                nums = Multiply(nums);
                nums = Addition(nums);
                nums = polyOrder(nums);
                //error with number computations
            }catch(NumberFormatException e){
                nums.clear();
                nums.add("OVERFLOW Error");
            }
        }

        return nums.get(0);
        }
    }





