package br.com.ahsr.tortuga;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allyson on 07/05/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://tortuga.hostei.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, int cpf, int password, String email, int phone, int cep, int number, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("cpf", cpf+"");
        params.put("password", password+"");
        params.put("phone", phone+"");
        params.put("email", email);
        params.put("cep", cep+"");
        params.put("number", number+"");
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }



}
