package edu.whu.csvtopostgres;

import com.opencsv.bean.CsvToBeanBuilder;
import edu.whu.csvtopostgres.dao.PointDao;
import edu.whu.csvtopostgres.model.Point;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;
import java.util.List;

@SpringBootTest
class CsvToPostgresApplicationTests {
    private static final String path = "C:\\Users\\22733\\Documents\\workspace\\上海市POI数据.csv";

    @Autowired
    private PointDao pointDao;

    @Test
    void loadCsv() throws Exception {
        List<Point> points = beanBuilderExample(path);
        System.out.println(points);
    }

    public List<Point> beanBuilderExample(String path) throws Exception {
        return new CsvToBeanBuilder<Point>(new FileReader(path))
                //                .withProfile("customer 1")
                .withType(Point.class)
                .build()
                .parse();
    }

    @Test
    void contextLoads() throws Exception {
        List<Point> points = beanBuilderExample(path);
        pointDao.saveAll(points);
    }

}
