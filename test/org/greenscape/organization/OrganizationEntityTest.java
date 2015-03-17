package org.greenscape.organization;

import java.util.Date;

import junit.framework.TestCase;

public class OrganizationEntityTest extends TestCase {

	public void testCopyConstructor() {
		OrganizationEntity entity1 = new OrganizationEntity();
		entity1.setActive(true);
		entity1.setCreatedDate(new Date());
		entity1.setHomeURL("/Test");
		entity1.setModelId("1");
		entity1.setLogoId(1L);
		entity1.setMaxUsers(2000);
		entity1.setModifiedDate(new Date());
		entity1.setName("Test");
		OrganizationEntity entity2 = new OrganizationEntity(entity1);

		assertEquals(true, entity2.isActive().booleanValue() == entity1.isActive().booleanValue());
		assertEquals(true, entity2.getCreatedDate().getTime() == entity1.getCreatedDate().getTime());
		assertEquals(true, entity2.getHomeURL().equals(entity1.getHomeURL()));
		assertEquals(true, entity2.getModelId().equals("1"));
		assertEquals(true, entity2.getLogoId().intValue() == entity1.getLogoId().intValue());
		assertEquals(true, entity2.getMaxUsers().intValue() == entity1.getMaxUsers().intValue());
		assertEquals(true, entity2.getModifiedDate().getTime() == entity1.getModifiedDate().getTime());
		assertEquals(true, entity2.getName().equals(entity1.getName()));
	}

	public void testPropertySet() {
		OrganizationEntity entity = new OrganizationEntity();
		entity.setActive(true);
		Date now = new Date();
		entity.setCreatedDate(now);
		entity.setHomeURL("/Test");
		entity.setModelId("1");
		entity.setLogoId(1L);
		entity.setMaxUsers(2000);
		entity.setModifiedDate(now);
		entity.setName("Test");

		// test using property name
		assertEquals(true, entity.isActive().booleanValue() == true);
		assertEquals(true, entity.getCreatedDate().getTime() == now.getTime());
		assertEquals(true, entity.getHomeURL().equals("/Test"));
		assertEquals(true, entity.getModelId().equals("1"));
		assertEquals(true, entity.getLogoId().intValue() == 1);
		assertEquals(true, entity.getMaxUsers().intValue() == 2000);
		assertEquals(true, entity.getModifiedDate().getTime() == now.getTime());
		assertEquals(true, entity.getName().equals("Test"));

		// test using generic getProperty method
		assertEquals(true, ((Boolean) entity.getProperty(OrganizationEntity.ACTIVE)).booleanValue() == true);
		assertEquals(true, ((Date) entity.getProperty(OrganizationEntity.CREATED_DATE)).getTime() == now.getTime());
		assertEquals(true, entity.getProperty(OrganizationEntity.HOME_URL).equals("/Test"));
		assertEquals(true, entity.getProperty(OrganizationEntity.MODEL_ID).equals("1"));
		assertEquals(true, ((Long) entity.getProperty(OrganizationEntity.LOGO_ID)).intValue() == 1);
		assertEquals(true, ((Integer) entity.getProperty(OrganizationEntity.MAX_USERS)).intValue() == 2000);
		assertEquals(true, ((Date) entity.getProperty(OrganizationEntity.MODIFIED_DATE)).getTime() == now.getTime());
		assertEquals(true, entity.getProperty(OrganizationEntity.NAME).equals("Test"));
	}
}
