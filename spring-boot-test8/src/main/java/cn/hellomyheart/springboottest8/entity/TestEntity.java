package cn.hellomyheart.springboottest8.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description
 * @className: TestEntity
 * @package: cn.hellomyheart.springboottest8.entity
 * @author: Stephen Shen
 * @date: 2020/9/28 下午8:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
    @ExcelProperty("字符串标题")
    private String string;
    @ExcelProperty("日期标题")
    private Date date;
    @ExcelProperty("数字标题")
    private Double doubleData;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
