/*
 * generated by Xtext
 */
package org.xtext.jlog.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractJlogDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.jlog.jlogDsl.JlogDslPackage.eINSTANCE);
		return result;
	}
}
