/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_calculadora;

import javax.jws.WebService;
/*import javax.jws.WebMethod;
import javax.jws.WebParam;*/

/**
 *
 * @author aschneider
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    public int suma(int a, int b) {
        return (a + b);
    }

    public int resta(int a, int b) {
        return (a - b);
    }

    public int multiplicacion(int a, int b) {
        return (a * b);
    }

    public int division(int a, int b) {
        return (a / b);
    }
}
