package nu.drinkapp.auth;

import nu.drinkapp.bb.LoginBB;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "NavFilter", urlPatterns = {"/*"})
public class NavFilter implements Filter {

    @Inject
    private LoginBB lb;

    /*
     Filter that forwards you to another web page if you're not supposed/allowed
     to access them through the address-field or any other way.
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hsr = (HttpServletRequest) request;
        String url = hsr.getRequestURI();
        if (lb.isLoggedIn()) {
            if (url.contains("/partials/login/")) {
                hsr.getRequestDispatcher("/index.xhtml").forward(request, response);
            } else if (url.contains("/partials/auth/registerSuccess.xhtml")) {
                hsr.getRequestDispatcher("/index.xhtml").forward(request, response);
            }
            chain.doFilter(request, response);
        } else {
            if (url.contains("register.xhtml")) {
                hsr.getRequestDispatcher("/partials/login/register.xhtml").forward(request, response);
            } else if (url.contains("login.xhtml")) {
                hsr.getRequestDispatcher("/partials/login/login.xhtml").forward(request, response);
            } else {
                chain.doFilter(request, response);
            }
        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}
