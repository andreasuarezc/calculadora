package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long restar(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicar(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Long dividir(Long number1, Long number2) {
        try{
            logger.info( "Summing {} / {}", number1, number2 );
            return number1 / number2;
        }catch (ArithmeticException arithmeticException){
            logger.error(arithmeticException.getMessage()+". Error. La división entre cero no tiene un resultado definido");
            return 0L;
        }

    }
}
