package com.mycompany.aopxml;

import java.util.List;

public interface Person {
	public void  useAxe();
	public void  testAfterThrowing();
	public List<Integer> testAfterReturing();
	void testArgs(int a, String b, byte[] bytes, List<Integer> list);
}
