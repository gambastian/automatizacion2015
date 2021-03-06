/**
 *
 * $Id$
 */
package quality_requirements_metamodel.validation;

import org.eclipse.emf.common.util.EList;

import quality_requirements_metamodel.Architecture;
import quality_requirements_metamodel.QualityScenario;
import quality_requirements_metamodel.ResponseMetric;

/**
 * A sample validator interface for {@link quality_requirements_metamodel.Dashboard}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DashboardValidator {
	boolean validate();

	boolean validateArchitectures(EList<Architecture> value);
	boolean validateMetrics(EList<ResponseMetric> value);
	boolean validateScenarios(EList<QualityScenario> value);
	boolean validateId(String value);
}
