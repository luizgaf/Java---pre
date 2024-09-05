package calc;

import javax.swing.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.graalvm.polyglot.*;


public class Func {
    
    public static String calculate(String expression) {
        expression = expression.replace("x", "*").replace("÷", "/");

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            Object result = engine.eval(expression);  
            return result.toString();  
        } catch (ScriptException e) {
            return "Erro";  
        }
    }
}
