package com.kkey.threads;


import net.jcip.annotations.Immutable;

@SuppressWarnings({"UnusedDeclaration", "FieldCanBeLocal"})

@Immutable
public class Example2Immutable
{
	private int value = 0;

	public void setValue(int newValue)
	{
		value = newValue;
	}
}
