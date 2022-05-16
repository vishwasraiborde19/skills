package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import algos.ArrayUtils;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration
public class ArrayUtilsTest {

	@Autowired
	private ArrayUtils arrayUtils;

	@Test
	public void getIndextOfLowestValuefromArrayTest() {
		String sample = "1112334415";
		List<Integer> inputArray = arrayUtils.converStringArrytoInt(sample);

		Integer smallestKth = 3;

		String value = arrayUtils.getIndextOfLowestValuefromArray(inputArray, smallestKth);
		assertEquals(4, Integer.parseInt(value));
	}

	@Test
	public void converStringArrytoIntTest() {
		String str = "12345";
		List<Integer> arrays = arrayUtils.converStringArrytoInt(str);
		assertNotNull(arrays);
	}

}
