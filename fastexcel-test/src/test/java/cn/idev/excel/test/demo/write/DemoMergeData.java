package cn.idev.excel.test.demo.write;

import cn.idev.excel.annotation.ExcelProperty;
import cn.idev.excel.annotation.write.style.ContentLoopMerge;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 样式的数据类
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
// 将第6-7行的2-3列合并成一个单元格
// @OnceAbsoluteMerge(firstRowIndex = 5, lastRowIndex = 6, firstColumnIndex = 1, lastColumnIndex = 2)
public class DemoMergeData {
    
    // 这一列 每隔2行 合并单元格
    @ContentLoopMerge(eachRow = 2)
    @ExcelProperty("字符串标题")
    private String string;
    
    @ExcelProperty("日期标题")
    private Date date;
    
    @ExcelProperty("数字标题")
    private Double doubleData;
}
