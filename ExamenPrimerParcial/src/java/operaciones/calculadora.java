package operaciones;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   calculadora  extends   HttpServlet
{
@Override
public   void   doPost(HttpServletRequest   request,   HttpServletResponse response)
throws   ServletException,   IOException
    {
    double  n,result;
    int     operacion;

    try (ServletOutputStream out = response.getOutputStream()) {
        n = Double.parseDouble(request.getParameter("num"));
        operacion = Integer.parseInt(request.getParameter("ope"));
        result = calcularR(n,operacion);
        out.println("<html>");
        out.println("<head><title>Convertidor a pesos</title></head>");
        out.println("<body>");
        out.println("<h1><center>Cantidad: $"+ n +"</center></h1>");
        out.println("<h2><b><center>Conversión: "+ result +"</center></b></h2>");
        out.println("<a href=\"index.html\">Regresar</a>");
        out.println("</body>");
        out.println("</html>");
    }
    }

    public   double   calcularR(double   n,   int   operacion)
    {
    double   result=0;
        
        switch(operacion)
        {
            case 1:
            return n / 20;
            
            case 2:
            return n * 20;
        
        }

    return   result;
    
    }
}
 