package com.atilsamancioglu.parselearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DATABASE DATABASE DATABASE DATABASE DATABASE DATABASE

        /*

        ParseObject object = new ParseObject("Fruits");

        object.put("name","banana");
        object.put("calories",150);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e!=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Object Saved",Toast.LENGTH_LONG).show();
                }
            }
        });


        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.getInBackground("uex1Qwo0LZ", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e != null) {
                    e.printStackTrace();
                } else {
                    String objectName = object.getString("name");
                    int objectCalories = object.getInt("calories");

                    System.out.println("object name: " + objectName);
                    System.out.println("object calories: " + objectCalories);
                }
            }
        });

        */

        /*


        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.whereLessThan("calories",130);
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e != null) {
                    e.printStackTrace();
                } else {
                    if (objects.size() > 0) {

                        for (ParseObject object : objects) {

                            String objectName = object.getString("name");
                            int objectCalorie = object.getInt("calories");

                            System.out.println("object name: " + objectName);
                            System.out.println("object calorie: " + objectCalorie);

                        }

                    }
                }
            }
        });

        */


        // USER USER USER USER USER USER USER USER


        /*

        ParseUser user = new ParseUser();
        user.setUsername("James");
        user.setPassword("123456");
        
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e!=null){
                    e.printStackTrace();
                } else {
                    Toast.makeText(MainActivity.this, "User Signed Up!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });



        ParseUser.logInInBackground("James", "123456", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e!= null) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Welcome: "+ user.getUsername(), Toast.LENGTH_SHORT).show();
                }
            }
        });

         */

    }
}
