package alfa.core.runtime.impl;


import alfa.core.*;

import alfa.core.runtime.*;

public class Impl_alex extends alfa.core.runtime.gen.alex
{
/*
	(VAR|NUM) (VAR|STR) REG(NUM)? 
*/
	public Impl_alex( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception
	{
		throw new RuntimeException( "Not Implemented ! ");
	}

}

