/**
 *
 * $Id$
 */
package quality_requirements_metamodel.validation;

import java.math.BigDecimal;

import quality_requirements_metamodel.ResponseMetric;
import quality_requirements_metamodel.Stimulus;

/**
 * A sample validator interface for {@link quality_requirements_metamodel.QualityScenario}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QualityScenarioValidator {
	boolean validate();

	boolean validateResponseMetric(ResponseMetric value);
	boolean validateService(Stimulus value);
	boolean validateTestResult(BigDecimal value);
	boolean validateName(String value);
}