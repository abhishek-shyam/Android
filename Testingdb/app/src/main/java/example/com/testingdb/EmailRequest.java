package example.com.testingdb;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 02-04-2017.
 */

public class EmailRequest extends StringRequest {
    private static final String Email_REQUEST_URL="https://admincom.000webhostapp.com/email.php";
    private Map<String, String> params;

    public EmailRequest(String email, String mp, Response.Listener<String> listener){
        super(Request.Method.POST, Email_REQUEST_URL, listener, null);
        params=new HashMap<>();
        params.put("email",email);
        params.put("mp",mp);
    }
    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
