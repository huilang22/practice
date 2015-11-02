/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleFindBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SecurityRoleFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityRoleFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityRoleObjectFilter SecurityRoleFindIn;
/**
 *
 * Constructor to create a  SecurityRoleFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityRoleFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityRoleObjectFilter SecurityRoleFindInIn) {
    super(id, context, "SecurityRoleFind");
    SecurityRoleFindIn = SecurityRoleFindInIn;
  }

  public void translateToMap() {
    if (SecurityRoleFindIn != null) {
      Integer index =  SecurityRoleFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(SecurityRoleFindIn, new HashMap(), "SecurityRole").get("SecurityRole"));
    }
  }


/**
 *
 * Sets the SecurityRole
 * @param SecurityRoleFindInIn Value of the SecurityRoleFindIn
 *
 */

  public void setSecurityRole(SecurityRoleObjectFilter SecurityRoleFindInIn) {
    SecurityRoleFindIn = SecurityRoleFindInIn;
  }

  public void translateFromMap() {
    SecurityRoleFindIn = SecurityRoleObjectHelper.fromMapFilter(inputMap, "SecurityRole");
  }

/**
 *
 * Gets the SecurityRole
 * @return Value of the SecurityRole
 *
 */

  public SecurityRoleObjectFilter getSecurityRole( ) {
    return SecurityRoleFindIn;
  }

}
