package edu.whu.csvtopostgres.dao;

import edu.whu.csvtopostgres.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointDao extends JpaRepository<Point, Integer> {

}
