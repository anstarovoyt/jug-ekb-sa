package com.kkey.threads;

import net.jcip.annotations.GuardedBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@SuppressWarnings({"UnusedDeclaration", "MismatchedQueryAndUpdateOfCollection"})
public class Example1GuardedBy
{
	@GuardedBy("lockNotExists")
	private List<String> valuesWithoutLock = new ArrayList<>();

	@GuardedBy("lock")
	private List<String> values = new ArrayList<>();

	private final ReentrantLock lock = new ReentrantLock();

	public void add()
	{
		values.add("1");
	}

	public void addWithLock()
	{
		lock.lock();
		try
		{
			values.add("1");
		} finally
		{
			lock.unlock();
		}
	}
}
