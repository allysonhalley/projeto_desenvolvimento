package br.com.ahsr.tortuga;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allyson on 08/05/2017.
 */

public class LoginRequest extends StringRequest{
    private static final String LOGIN_REQUEST_URL = "http://tortuga.hostei.com/Login.php";
    private Map<String, String> params;

    public LoginRequest(int cpf, int password, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("cpf", cpf+"");
        params.put("password", password+"");
    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
