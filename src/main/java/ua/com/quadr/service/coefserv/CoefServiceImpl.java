package ua.com.quadr.service.coefserv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.quadr.dao.CoefficientsDao;
import ua.com.quadr.entity.Coefficients;

@Service
public class CoefServiceImpl implements coefService {

    @Autowired
    CoefficientsDao coefficientsDao;

    @Override
    public void saveCoefToDB(Coefficients coefficients) {
        coefficientsDao.save(coefficients);

    }
}
