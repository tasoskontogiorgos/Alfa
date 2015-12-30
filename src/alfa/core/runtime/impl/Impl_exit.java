package alfa.core.runtime.impl;


import alfa.core.*;

import alfa.core.runtime.*;

public class Impl_exit extends alfa.core.runtime.gen.exit
{
/*
	BOOL 
*/
	public Impl_exit( alfa.core.runtime.AlfaEvaluator e )
	{
		super( e );
	}

	@Override
	public Object eval( Object ... actuals ) throws Exception
	{
		throw new RuntimeException( "Not Implemented ! ");
	}

}

