/**
 *
 * $Id$
 */
package quality_requirements_metamodel.validation;

import java.math.BigDecimal;

import quality_requirements_metamodel.Metrics;
import quality_requirements_metamodel.RelationalOperators;
import quality_requirements_metamodel.Units;

/**
 * A sample validator interface for {@link quality_requirements_metamodel.ResponseMetric}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResponseMetricValidator {
	boolean validate();

	boolean validateMetric(Metrics value);
	boolean validateOperator(RelationalOperators value);
	boolean validateValue(BigDecimal value);
	boolean validateUnit(Units value);
	boolean validateName(String value);
}