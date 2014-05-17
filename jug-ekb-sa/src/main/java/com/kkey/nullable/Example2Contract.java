package com.kkey.nullable;

import checkers.nullness.quals.Nullable;
import org.jetbrains.annotations.Contract;

/**
 * @link http://blog.jetbrains.com/idea/2013/10/better-control-flow-analysis-with-contract-annotations-and-intellij-idea-13/
 */
@SuppressWarnings({"ResultOfMethodCallIgnored", "UnusedDeclaration"})
public class Example2Contract
{
	public void doSomething()
	{
		getValue(null).intern();
		getValue("value").intern();
	}

	@Contract("null -> null; !null -> !null")
	public String getValue(@Nullable Object obj)
	{
		String s = obj.toString();

		return obj.toString();
	}
}
