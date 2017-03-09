package controller.Valivator;

import org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by root on 17-3-8.
 */
public class RequestParseWrapper extends JakartaMultiPartRequest {
    @Override
    public void parse(HttpServletRequest request, String saveDir) throws IOException {

    }
}
