package ua.com.quadr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.quadr.entity.Coefficients;

@Repository
public interface CoefficientsDao extends JpaRepository<Coefficients, Integer> {

}
