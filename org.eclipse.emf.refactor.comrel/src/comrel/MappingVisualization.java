/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mapping Visualization</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see comrel.ComrelPackage#getMappingVisualization()
 * @model
 * @generated
 */
public enum MappingVisualization implements Enumerator {
	/**
	 * The '<em><b>Arrows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROWS_VALUE
	 * @generated
	 * @ordered
	 */
	ARROWS(0, "arrows", "arrows"),

	/**
	 * The '<em><b>Colored Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLORED_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	COLORED_PORTS(1, "coloredPorts", "coloredPorts"),

	/**
	 * The '<em><b>Indices</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICES_VALUE
	 * @generated
	 * @ordered
	 */
	INDICES(2, "indices", "indices"),

	/**
	 * The '<em><b>Arrows And Colored Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROWS_AND_COLORED_PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	ARROWS_AND_COLORED_PORTS(3, "arrowsAndColoredPorts", "arrowsAndColoredPorts"),

	/**
	 * The '<em><b>Arrows And Indices</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROWS_AND_INDICES_VALUE
	 * @generated
	 * @ordered
	 */
	ARROWS_AND_INDICES(4, "arrowsAndIndices", "arrowsAndIndices");

	/**
	 * The '<em><b>Arrows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arrows</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROWS
	 * @model name="arrows"
	 * @generated
	 * @ordered
	 */
	public static final int ARROWS_VALUE = 0;

	/**
	 * The '<em><b>Colored Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Colored Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLORED_PORTS
	 * @model name="coloredPorts"
	 * @generated
	 * @ordered
	 */
	public static final int COLORED_PORTS_VALUE = 1;

	/**
	 * The '<em><b>Indices</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indices</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICES
	 * @model name="indices"
	 * @generated
	 * @ordered
	 */
	public static final int INDICES_VALUE = 2;

	/**
	 * The '<em><b>Arrows And Colored Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arrows And Colored Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROWS_AND_COLORED_PORTS
	 * @model name="arrowsAndColoredPorts"
	 * @generated
	 * @ordered
	 */
	public static final int ARROWS_AND_COLORED_PORTS_VALUE = 3;

	/**
	 * The '<em><b>Arrows And Indices</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arrows And Indices</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROWS_AND_INDICES
	 * @model name="arrowsAndIndices"
	 * @generated
	 * @ordered
	 */
	public static final int ARROWS_AND_INDICES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Mapping Visualization</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MappingVisualization[] VALUES_ARRAY =
		new MappingVisualization[] {
			ARROWS,
			COLORED_PORTS,
			INDICES,
			ARROWS_AND_COLORED_PORTS,
			ARROWS_AND_INDICES,
		};

	/**
	 * A public read-only list of all the '<em><b>Mapping Visualization</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MappingVisualization> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mapping Visualization</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingVisualization get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MappingVisualization result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mapping Visualization</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingVisualization getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MappingVisualization result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mapping Visualization</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingVisualization get(int value) {
		switch (value) {
			case ARROWS_VALUE: return ARROWS;
			case COLORED_PORTS_VALUE: return COLORED_PORTS;
			case INDICES_VALUE: return INDICES;
			case ARROWS_AND_COLORED_PORTS_VALUE: return ARROWS_AND_COLORED_PORTS;
			case ARROWS_AND_INDICES_VALUE: return ARROWS_AND_INDICES;
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
	private MappingVisualization(int value, String name, String literal) {
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
	
} //MappingVisualization
