package cn.hellomyheart.springboottest8;

import cn.hellomyheart.springboottest8.entity.TestEntity;
import com.alibaba.excel.EasyExcel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringBootTest1ApplicationTests {
    private List<TestEntity> data() {
        List<TestEntity> list = new ArrayList<TestEntity>();
        for (int i = 0; i < 10; i++) {
            TestEntity entity = new TestEntity("test"+i,new Date(),0.5*i,"test"+i);
            list.add(entity);
        }
        return list;
    }

    @Test
    public void simpleWrite() {
        // 写法1
        String fileName = "./excel/TestEasyExcel.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName, TestEntity.class).sheet("模板").doWrite(data());
    }

}
