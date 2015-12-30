package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class DefaultEnvir extends alfa.core.runtime.AlfaEnvironment
{
	@Override
	public void init( AlfaEvaluator eval )
	{
		if( ( eval != null ) && !( eval instanceof Evaluator) )
		{
		  throw new RuntimeException("Invalid Evaluator !");
		}
		registerFunc( new alfa.core.runtime.impl.Impl_exportCSV( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_tasos2( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_tasos3( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_printSchema( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_join( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_alex( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_exportAvro( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_printVars( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_exit( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_nLinRegression( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_show( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_save( eval ) );
		registerFunc( new alfa.core.runtime.impl.Impl_debug( eval ) );
	}
}

