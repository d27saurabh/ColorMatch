    package com.example.d27sa.colormatch;

    import android.content.Intent;
    import android.graphics.Color;
    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;
    import android.widget.TextView;
    import android.widget.Toast;


    public class MainActivity extends AppCompatActivity {

        //Blue ,Red, Green defined
        String blue = "#2196F3";
        String green = "#68EFAD";
        String red = "#F50057";
        // b1 to b9 for 9 buttons to store the current colour of the button. Initially defined to default colour of the button.
        String b1 = "#E0E0E0";
        String b2 = "#E0E0E0";
        String b3 = "#E0E0E0";
        String b4 = "#E0E0E0";
        String b5 = "#E0E0E0";
        String b6 = "#E0E0E0";
        String b7 = "#E0E0E0";
        String b8 = "#E0E0E0";
        String b9 = "#E0E0E0";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            if (savedInstanceState!=null){
                this.onRestoreInstanceState(savedInstanceState);
            }

        }

        @Override
        protected void onSaveInstanceState(Bundle outState){
            super.onSaveInstanceState(outState);
        }

        /* Method Terget_Button is called when Target button is clicked to shift from main activity to target activity.
     FLAG_ACTIVITY_REORDER_TO_FRONT this flag will cause the launched activity to be brought to the front
     of its task's history stack if it is already running.
     */
        public void Target_Button(View view){
            Intent i = new Intent(this, Target.class);
            i.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(i);
        }

        /*ColourChangeb1 method is set on the OnClick attribute of the Button 1.
        Onclicking the button1 , it sets the background colour of the button to blue
        and further clicks changes to green to red to blue.
         */
        public void ColourChangeb1(View btn) {
            if ((b1 == "#E0E0E0") || (b1 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b1 = blue;
                check();
                return;
            }
            if ((b1 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b1 = green;
                check();
                return;
            }

            if ((b1 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b1 = red;
                check();
                return;
            }

        }

        public void ColourChangeb2(View btn) {
            if ((b2 == "#E0E0E0") || (b2 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b2 = blue;
                check();
                return;
            }
            if ((b2 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b2 = green;
                check();
                return;
            }

            if ((b2 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b2 = red;
                check();
                return;
            }
        }

        public void ColourChangeb3(View btn) {
            if ((b3 == "#E0E0E0") || (b3 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b3 = blue;
                check();
                return;
            }
            if ((b3 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b3 = green;
                check();
                return;
            }

            if ((b3 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b3 = red;
                check();
                return;
            }


        }

        public void ColourChangeb4(View btn) {
            if ((b4 == "#E0E0E0") || (b4 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b4 = blue;
                check();
                return;
            }
            if ((b4 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b4 = green;
                check();
                return;
            }

            if ((b4 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b4 = red;
                check();
                return;
            }
        }

        public void ColourChangeb5(View btn) {
            if ((b5 == "#E0E0E0") || (b5 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b5 = blue;
                check();
                return;
            }
            if ((b5 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b5 = green;
                check();
                return;
            }

            if ((b5 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b5 = red;
                check();
                return;
            }
        }

        public void ColourChangeb6(View btn) {
            if ((b6 == "#E0E0E0") || (b6 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b6 = blue;
                check();
                return;
            }
            if ((b6 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b6 = green;
                check();
                return;
            }

            if ((b6 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b6 = red;
                check();
                return;
            }
        }

        public void ColourChangeb7(View btn) {
            if ((b7 == "#E0E0E0") || (b7 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b7 = blue;
                check();
                return;
            }
            if ((b7 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b7 = green;
                check();
                return;
            }

            if ((b7 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b7 = red;
                check();
                return;
            }
        }

        public void ColourChangeb8(View btn) {
            if ((b8 == "#E0E0E0") || (b8 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b8 = blue;
                check();
                return;
            }
            if ((b8 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b8 = green;
                check();
                return;
            }

            if ((b8 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b8 = red;
                check();
                return;
            }
        }

        public void ColourChangeb9(View btn) {
            if ((b9 == "#E0E0E0") || (b9 == red)) {
                btn.setBackgroundColor(Color.parseColor(blue));
                b9 = blue;
                check();
                return;
            }
            if ((b9 == blue)) {
                btn.setBackgroundColor(Color.parseColor(green));
                b9 = green;
                check();
                return;
            }

            if ((b9 == green)) {
                btn.setBackgroundColor(Color.parseColor(red));
                b9 = red;
                check();
                return;
            }
        }
        /*This is to check the mainactivity colour pattern matches with the target colour pattern.
        If the colour pattern is matched , a success message is displayed in the TextView as well as a flash message is
        displayed using the Toast.
         */
         public void check(){
            if((b1==blue)&&(b2==green)&&(b3==red)&&(b4==green)&&(b5==green)&&(b6==red)&&(b7==green)&&(b8==blue)&&(b9==blue)){
            displayMessage("Success!");
                Toast.makeText(getApplicationContext(), "Success!",
                        Toast.LENGTH_SHORT).show();
            }
             else {
                displayMessage(" ");
            }
        }

        public void displayMessage(String message){
            TextView statusTextView = (TextView) findViewById(R.id.textView);
            statusTextView.setText(message);
        }
    }
