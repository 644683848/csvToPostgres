package edu.whu.csvtopostgres.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Point {
    @Id
    @CsvBindByPosition(position = 6)
    private Integer id;
    // 城市
    @CsvBindByPosition(position = 4)
    private String city;
    // 城区
    @CsvBindByPosition(position = 5)
    private String district;
    // 经度
    @CsvBindByPosition(position = 2)
    private double longitude;
    // 纬度
    @CsvBindByPosition(position = 3)
    private double latitude;
    // 类型
    @CsvBindByPosition(position = 1)
    private String type;
    // 名称
    @CsvBindByPosition(position = 0)
    private String name;
}
