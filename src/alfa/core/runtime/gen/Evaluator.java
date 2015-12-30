package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public interface Evaluator extends alfa.core.runtime.AlfaEvaluator
{
	public Object exportCSV( Object ... actuals ) throws Exception;
	public Object tasos2( Object ... actuals ) throws Exception;
	public Object tasos3( Object ... actuals ) throws Exception;
	public Object printSchema( Object ... actuals ) throws Exception;
	public Object join( Object ... actuals ) throws Exception;
	public Object alex( Object ... actuals ) throws Exception;
	public Object exportAvro( Object ... actuals ) throws Exception;
	public Object printVars( Object ... actuals ) throws Exception;
	public Object exit( Object ... actuals ) throws Exception;
	public Object nLinRegression( Object ... actuals ) throws Exception;
	public Object show( Object ... actuals ) throws Exception;
	public Object save( Object ... actuals ) throws Exception;
	public Object debug( Object ... actuals ) throws Exception;
}

