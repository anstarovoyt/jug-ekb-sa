package com.kkey.nullable;


import java.util.Optional;

import static java.lang.System.out;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Example4Optional
{
	public void doSomething()
	{
		Optional<String> value = getValue(false);

		if (value == null)
		{
			value = Optional.of("default");
		}


		getValue(false).orElse("default").intern();

		getValue(false).ifPresent(out::print);


		Optional<String> value1 = getValue(false);
		if (value1.isPresent())
		{
			value1.get();
		}
	}

	public Optional<String> getValue(boolean empty)
	{
		return empty ? Optional.<String>empty() : Optional.of("result");
	}
}

