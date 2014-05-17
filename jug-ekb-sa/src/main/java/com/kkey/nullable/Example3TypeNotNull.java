package com.kkey.nullable;


import checkers.nullness.quals.NonNull;
import checkers.nullness.quals.Nullable;

import java.util.ArrayList;

@SuppressWarnings({"ResultOfMethodCallIgnored", "UnusedDeclaration"})
public class Example3TypeNotNull
{
	@NonNull
	private final ArrayList<@NonNull String> notNullList = new ArrayList<>();
	@NonNull
	private final ArrayList<@Nullable String> nullableList = new ArrayList<>();

	public Example3TypeNotNull(@Nullable String value1, @Nullable String value2)
	{
		notNullList.add(value1);
		nullableList.add(value2);
	}

	public void doSomething()
	{
		String sNotNull = notNullList.get(0);
		sNotNull.intern();

		String sNullable = nullableList.get(0);
		if (sNullable != null)
		{
			sNullable.intern();
		}

		@NonNull String s = nullableList.get(1);
		s.intern();
	}
}
