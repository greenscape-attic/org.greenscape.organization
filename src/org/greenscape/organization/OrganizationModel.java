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
	public static final String MODEL_NAME = "Organization";
	public static final String ORGANIZATION_ID = "organizationId";
	public static final String NAME = "name";
	public static final String HOME_URL = "homeURL";
	public static final String LOGO_ID = "logoId";
	public static final String MAX_USERS = "maxUsers";
	public static final String IS_ACTIVE = "isActive";

	/**
	 * Returns the organization ID of this organization.
	 * 
	 * @return the organization ID of this organization
	 */
	public Long getOrganizationId();

	/**
	 * Sets the organization ID of this organization.
	 * 
	 * @param organizationId
	 *            the organization ID of this organization
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setOrganizationId(Long organizationId);

	/**
	 * Gets the name of this organization
	 * 
	 * @return the organization's name
	 */
	public String getName();

	/**
	 * Sets the name of this organization
	 * 
	 * @param name
	 *            the name to set
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setName(String name);

	/**
	 * Returns the home u r l of this organization.
	 * 
	 * @return the home u r l of this organization
	 */
	public String getHomeURL();

	/**
	 * Sets the home u r l of this organization.
	 * 
	 * @param homeURL
	 *            the home u r l of this organization
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setHomeURL(String homeURL);

	/**
	 * Returns the logo ID of this organization.
	 * 
	 * @return the logo ID of this organization
	 */
	public Long getLogoId();

	/**
	 * Sets the logo ID of this organization.
	 * 
	 * @param logoId
	 *            the logo ID of this organization
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setLogoId(Long logoId);

	/**
	 * Returns the max users of this organization.
	 * 
	 * @return the max users of this organization
	 */
	public Integer getMaxUsers();

	/**
	 * Sets the max users of this organization.
	 * 
	 * @param maxUsers
	 *            the max users of this organization
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setMaxUsers(Integer maxUsers);

	/**
	 * Returns <code>true</code> if this organization is active.
	 * 
	 * @return <code>true</code> if this organization is active;
	 *         <code>false</code> otherwise
	 */
	public Boolean isActive();

	/**
	 * Sets whether this organization is active.
	 * 
	 * @param active
	 *            the active of this organization
	 * @return this organization for fluent interface
	 */
	public OrganizationModel setActive(Boolean active);
}
