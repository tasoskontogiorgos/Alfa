package alfa.core.runtime.gen;


import alfa.core.*;

import alfa.core.runtime.*;

public class DefaultEnvir extends alfa.core.runtime.AlfaEnvironment
{
	@Override
	public void init(  )
	{
		registerFunc( new alfa.core.runtime.impl.Impl_exportCSV(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_tasos2(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_tasos3(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_printSchema(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_join(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_alex(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_exportAvro(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_printVars(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_exit(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_nLinRegression(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_show(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_save(  ) );
		registerFunc( new alfa.core.runtime.impl.Impl_debug(  ) );
	}
}

