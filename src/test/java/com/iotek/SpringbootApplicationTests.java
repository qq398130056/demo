package com.iotek;

import com.iotek.dao.StudentMapper;
import com.iotek.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
	StudentMapper studentMapper;
	@Test
	public void contextLoads() {
		Student s = new Student();
		s.setAge(14);
		s.setName("aaa");
		System.out.println(studentMapper.insert(s));
	}
    @Test
	public void test(){
		System.out.println(studentMapper.selectByPrimaryKey(1L));
	}
}
