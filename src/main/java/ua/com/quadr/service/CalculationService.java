package ua.com.quadr.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import ua.com.quadr.entity.Coefficients;

@Component
public class CalculationService {

    public Integer calculateOfDiscriminant(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    private double calculateOfsquareRoot1(int a, int b, int c, int discriminant) {
        return ((-b + (Math.sqrt(discriminant))) / 2 * a);

    }

    private double calculateOfsquareRoot2(int a, int b, int c, int discriminant) {
        return ((-b - (Math.sqrt(discriminant))) / 2 * a);
    }

    public Coefficients createCoefForSaveToDB(int a, int b, int c, int discriminant){
        if (discriminant > 0){
            double squareRoot1 = calculateOfsquareRoot1(a, b, c, discriminant);
            double squareRoot2 = calculateOfsquareRoot2(a, b, c, discriminant);
            return new Coefficients(a, b, c, discriminant, squareRoot1, squareRoot2);
        } else if (discriminant == 0){
            double squareRoot1 = calculateOfsquareRoot1(a, b, c, discriminant);
            return new Coefficients(a, b, c, discriminant, squareRoot1);
        } else return new Coefficients(a, b, c, discriminant);
    }


    public void dataOutputToThePage(Model model, Coefficients coefficients ){
        String message1 = "Дискримінант данного рівняння має від'ємне значення, тому це рівняння немає рішення";
        String message2 = "Дискримінант данного рівняння дорівнює 0, тому це рівнння має лише один корінь.";
        if (coefficients.getDiscriminant() < 0){
            model.addAttribute("a", coefficients.getA());
            model.addAttribute("b", coefficients.getB());
            model.addAttribute("c", coefficients.getC());
            model.addAttribute("discriminant", coefficients.getDiscriminant());
            model.addAttribute("message", message1);
        } else if (coefficients.getDiscriminant()== 0){
            model.addAttribute("a", coefficients.getA());
            model.addAttribute("b", coefficients.getB());
            model.addAttribute("c", coefficients.getC());
            model.addAttribute("discriminant", coefficients.getDiscriminant());
            model.addAttribute("SquareRoot1",coefficients.getSquareRoot1());
            model.addAttribute("message", message2);
        } else model.addAttribute("a", coefficients.getA());
        model.addAttribute("b", coefficients.getB());
        model.addAttribute("c", coefficients.getC());
        model.addAttribute("discriminant", coefficients.getDiscriminant());
        model.addAttribute("SquareRoot1",coefficients.getSquareRoot1());
        model.addAttribute("SquareRoot2",coefficients.getSquareRoot2());

    }
}

