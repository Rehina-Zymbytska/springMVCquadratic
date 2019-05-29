package ua.com.quadr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.quadr.dao.CoefficientsDao;
import ua.com.quadr.entity.Coefficients;
import ua.com.quadr.service.CalculationService;
import ua.com.quadr.service.coefserv.CoefServiceImpl;


@Controller
public class MainController {

    @Autowired
    CoefServiceImpl coefServiceImpl;

    @Autowired
    CalculationService calculationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String goToIndex() {
        return "index";
    }

    @RequestMapping(value = "/saveCoeficientsToDB", method = RequestMethod.POST)
    String saveCoeficientsToDB(@RequestParam int a, int b, int c, Model model) {
        int discriminant = calculationService.calculateOfDiscriminant(a, b, c);
        Coefficients coefficients = calculationService.createCoefForSaveToDB(a, b, c, discriminant);
        System.out.println(coefficients.toString());
        coefServiceImpl.saveCoefToDB(coefficients);
        calculationService.dataOutputToThePage(model,coefficients);
        return "index";
    }


}
