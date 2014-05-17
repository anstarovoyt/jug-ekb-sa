package com.kkey.nullable;

import checkers.nullness.quals.NonNull;
import checkers.nullness.quals.Nullable;

@SuppressWarnings({"ResultOfMethodCallIgnored", "UnusedDeclaration"})
public class Example1NullNotNull
{
	@Nullable
	private final String nullValue;
	@NonNull
	private final String notNullValue;

	public Example1NullNotNull(@Nullable String nullValue, @Nullable String notNullValue)
	{
		this.nullValue = nullValue;
		this.notNullValue = notNullValue;
	}

	public void doSomething()
	{
		if (nullValue != null)
		{
			nullValue.intern();
		}

		notNullValue.intern();

		nullableMethod().intern();
	}

	@NonNull
	public String incorrectContract(@Nullable Object obj)
	{
		return null;
	}

	@Nullable
	public String nullableMethod()
	{
		return "";
	}
}
