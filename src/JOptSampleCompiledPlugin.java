import com.pnfsoftware.jeb.core.units.code.java.AbstractJOptimizer;

/**
 * A sample AST optimizer plugin for dexdec.
 * 
 * @author Nicolas Falliere
 *
 */
public class JOptSampleCompiledPlugin extends AbstractJOptimizer {

    public JOptSampleCompiledPlugin() {
        super();
    }

    @Override
    public int perform() {
        logger.info("dexdec AST optimizer plugin is being called");
        return 0;
   }
}