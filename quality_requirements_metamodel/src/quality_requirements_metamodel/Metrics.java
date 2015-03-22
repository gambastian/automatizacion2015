/**
 */
package quality_requirements_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metrics</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getMetrics()
 * @model
 * @generated
 */
public enum Metrics implements Enumerator {
	/**
	 * The '<em><b>RESPONSE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_TIME(0, "RESPONSE_TIME", "RESPONSE_TIME"),

	/**
	 * The '<em><b>AVERAGE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_TIME(0, "AVERAGE_TIME", "AVERAGE_TIME"),

	/**
	 * The '<em><b>MAX RESPONSE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_RESPONSE_TIME(0, "MAX_RESPONSE_TIME", "MAX_RESPONSE_TIME"),

	/**
	 * The '<em><b>RESPONSE TIME 90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_90_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_TIME_90(0, "RESPONSE_TIME_90", "RESPONSE_TIME_90"),

	/**
	 * The '<em><b>MEDIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN(0, "MEDIAN", "MEDIAN"),

	/**
	 * The '<em><b>ERROR PERCENTAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_PERCENTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_PERCENTAGE(0, "ERROR_PERCENTAGE", "ERROR_PERCENTAGE"),

	/**
	 * The '<em><b>TROUGHPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TROUGHPUT_VALUE
	 * @generated
	 * @ordered
	 */
	TROUGHPUT(0, "TROUGHPUT", "TROUGHPUT"),

	/**
	 * The '<em><b>BANDWIDTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	BANDWIDTH(0, "BANDWIDTH", "BANDWIDTH"),

	/**
	 * The '<em><b>STANDARD VARIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VARIATION_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_VARIATION(0, "STANDARD_VARIATION", "STANDARD_VARIATION"),

	/**
	 * The '<em><b>THREAD NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREAD_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	THREAD_NUMBER(0, "THREAD_NUMBER", "THREAD_NUMBER"),

	/**
	 * The '<em><b>TEST TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_TIME(0, "TEST_TIME", "TEST_TIME"),

	/**
	 * The '<em><b>LATENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENCY_VALUE
	 * @generated
	 * @ordered
	 */
	LATENCY(0, "LATENCY", "LATENCY"),

	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(0, "SERVICE", "SERVICE"),

	/**
	 * The '<em><b>ELAPSED TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELAPSED_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	ELAPSED_TIME(0, "ELAPSED_TIME", "ELAPSED_TIME"),

	/**
	 * The '<em><b>CODE TIMES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_TIMES_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_TIMES(0, "CODE_TIMES", "CODE_TIMES"),

	/**
	 * The '<em><b>THREAD RESPONSE TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREAD_RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	THREAD_RESPONSE_TIME(0, "THREAD_RESPONSE_TIME", "THREAD_RESPONSE_TIME"),

	/**
	 * The '<em><b>THREAD RESPONSE PERC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREAD_RESPONSE_PERC_VALUE
	 * @generated
	 * @ordered
	 */
	THREAD_RESPONSE_PERC(0, "THREAD_RESPONSE_PERC", "THREAD_RESPONSE_PERC");

	/**
	 * The '<em><b>RESPONSE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESPONSE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_TIME_VALUE = 0;

	/**
	 * The '<em><b>AVERAGE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVERAGE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_TIME_VALUE = 0;

	/**
	 * The '<em><b>MAX RESPONSE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX RESPONSE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_RESPONSE_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_RESPONSE_TIME_VALUE = 0;

	/**
	 * The '<em><b>RESPONSE TIME 90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESPONSE TIME 90</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_90
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_TIME_90_VALUE = 0;

	/**
	 * The '<em><b>MEDIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_VALUE = 0;

	/**
	 * The '<em><b>ERROR PERCENTAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR PERCENTAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_PERCENTAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_PERCENTAGE_VALUE = 0;

	/**
	 * The '<em><b>TROUGHPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TROUGHPUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TROUGHPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TROUGHPUT_VALUE = 0;

	/**
	 * The '<em><b>BANDWIDTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANDWIDTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANDWIDTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANDWIDTH_VALUE = 0;

	/**
	 * The '<em><b>STANDARD VARIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STANDARD VARIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VARIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VARIATION_VALUE = 0;

	/**
	 * The '<em><b>THREAD NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREAD NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREAD_NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREAD_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>TEST TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEST TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEST_TIME_VALUE = 0;

	/**
	 * The '<em><b>LATENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATENCY_VALUE = 0;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 0;

	/**
	 * The '<em><b>ELAPSED TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELAPSED TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELAPSED_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELAPSED_TIME_VALUE = 0;

	/**
	 * The '<em><b>CODE TIMES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CODE TIMES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_TIMES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODE_TIMES_VALUE = 0;

	/**
	 * The '<em><b>THREAD RESPONSE TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREAD RESPONSE TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREAD_RESPONSE_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREAD_RESPONSE_TIME_VALUE = 0;

	/**
	 * The '<em><b>THREAD RESPONSE PERC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THREAD RESPONSE PERC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREAD_RESPONSE_PERC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THREAD_RESPONSE_PERC_VALUE = 0;

	/**
	 * An array of all the '<em><b>Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metrics[] VALUES_ARRAY =
		new Metrics[] {
			RESPONSE_TIME,
			AVERAGE_TIME,
			MAX_RESPONSE_TIME,
			RESPONSE_TIME_90,
			MEDIAN,
			ERROR_PERCENTAGE,
			TROUGHPUT,
			BANDWIDTH,
			STANDARD_VARIATION,
			THREAD_NUMBER,
			TEST_TIME,
			LATENCY,
			SERVICE,
			ELAPSED_TIME,
			CODE_TIMES,
			THREAD_RESPONSE_TIME,
			THREAD_RESPONSE_PERC,
		};

	/**
	 * A public read-only list of all the '<em><b>Metrics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metrics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrics get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrics result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrics getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metrics result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metrics</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metrics get(int value) {
		switch (value) {
			case RESPONSE_TIME_VALUE: return RESPONSE_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Metrics(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Metrics
