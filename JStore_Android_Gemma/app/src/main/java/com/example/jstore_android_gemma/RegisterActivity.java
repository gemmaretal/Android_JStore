package com.example.jstore_android_gemma;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameInput = (EditText) findViewById(R.id.nameInput);
        final EditText emailInput = (EditText) findViewById(R.id.emailRegInput);
        final EditText passInput = (EditText) findViewById(R.id.passRegInput);
        final Button registerButton = (Button) findViewById(R.id.regButton);
        final EditText userInput = (EditText) findViewById(R.id.usernameInput);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = nameInput.getText().toString();
                final String email = emailInput.getText().toString();
                final String password = passInput.getText().toString();
                final String username = userInput.getText().toString();

                if (name.isEmpty()) {
                    nameInput.setError("Name Field Required");
                    nameInput.requestFocus();
                    return;
                }
                if (username.isEmpty()) {
                    userInput.setError("Username field required");
                    userInput.requestFocus();
                    return;
                }
                if (email.isEmpty()) {
                    emailInput.setError("Email field required");
                    emailInput.requestFocus();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailInput.setError("Please Enter a valid email");
                    emailInput.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    passInput.setError("Password field required");
                    passInput.requestFocus();
                    return;
                }
                if (password.length() < 8) {
                    passInput.setError("Password should be at least 8 characters long");
                    passInput.requestFocus();
                    return;
                }
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null){
                                
                                Toast.makeText(RegisterActivity.this, "Register Success!", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Register failed!").create().show();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name, email,username, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });

        final TextView loginClickable = (TextView) findViewById(R.id.loginClickable);
        loginClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
