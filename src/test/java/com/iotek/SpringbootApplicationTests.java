package com.iotek;

import com.iotek.dao.StudentMapper;
import com.iotek.entity.Student;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.KeyFactory;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
    @Autowired
	StudentMapper studentMapper;
	@Autowired
	DataSource dataSource;

	@Test
	public void data(){
		System.out.println(dataSource.getClass());
	}
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
