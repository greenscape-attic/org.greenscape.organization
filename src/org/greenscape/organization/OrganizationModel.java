/**
 * 
 */
package org.greenscape.organization;

/**
 * The base model interface for the Organization service. Represents a row in
 * the &quot;Organization&quot; database, with each column mapped to a property
 * of this class.
 * 
 * 
 * @author Sheikh Sajid
 * @see Organization
 * @see org.greenscape.organization.model.impl.OrganizationImpl
 * @see org.greenscape.organization.OrganizationEntity.impl.OrganizationModelImpl
 * 
 */
public interface OrganizationModel {
	String MODEL_NAME = "Organization";
	String ORGANIZATION_ID = "organizationId";
	String NAME = "name";
	String HOME_URL = "homeURL";
	String LOGO_ID = "logoId";
	String MAX_USERS = "maxUsers";
	String IS_ACTIVE = "isActive";

	/**
	 * Returns the organization ID of this organization.
	 * 
	 * @return the organization ID of this organization
	 */
	Long getOrganizationId();

	/**
	 * Sets the organization ID of this organization.
	 * 
	 * @param organizationId
	 *            the organization ID of this organization
	 * @return this organization for fluent interface
	 */
	OrganizationModel setOrganizationId(Long organizationId);

	/**
	 * Gets the name of this organization
	 * 
	 * @return the organization's name
	 */
	String getName();

	/**
	 * Sets the name of this organization
	 * 
	 * @param name
	 *            the name to set
	 * @return this organization for fluent interface
	 */
	OrganizationModel setName(String name);

	/**
	 * Returns the home u r l of this organization.
	 * 
	 * @return the home u r l of this organization
	 */
	String getHomeURL();

	/**
	 * Sets the home u r l of this organization.
	 * 
	 * @param homeURL
	 *            the home u r l of this organization
	 * @return this organization for fluent interface
	 */
	OrganizationModel setHomeURL(String homeURL);

	/**
	 * Returns the logo ID of this organization.
	 * 
	 * @return the logo ID of this organization
	 */
	Long getLogoId();

	/**
	 * Sets the logo ID of this organization.
	 * 
	 * @param logoId
	 *            the logo ID of this organization
	 * @return this organization for fluent interface
	 */
	OrganizationModel setLogoId(Long logoId);

	/**
	 * Returns the max users of this organization.
	 * 
	 * @return the max users of this organization
	 */
	Integer getMaxUsers();

	/**
	 * Sets the max users of this organization.
	 * 
	 * @param maxUsers
	 *            the max users of this organization
	 * @return this organization for fluent interface
	 */
	OrganizationModel setMaxUsers(Integer maxUsers);

	/**
	 * Returns <code>true</code> if this organization is active.
	 * 
	 * @return <code>true</code> if this organization is active;
	 *         <code>false</code> otherwise
	 */
	Boolean isActive();

	/**
	 * Sets whether this organization is active.
	 * 
	 * @param active
	 *            the active of this organization
	 * @return this organization for fluent interface
	 */
	OrganizationModel setActive(Boolean active);
}
