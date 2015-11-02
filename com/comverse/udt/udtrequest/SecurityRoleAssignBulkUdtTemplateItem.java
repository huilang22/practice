/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleAssignBulkUdtTemplateItem.java
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
 * Class used to create a SecurityRoleAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityRoleAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityRoleObjectData[] SecurityRoleAssignIn;
  protected BigInteger a_res_id;
  protected String a_user_name;
/**
 *
 * Constructor to create a  SecurityRoleAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityRoleAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleAssignInIn, BigInteger a_res_idIn, String a_user_nameIn) {
    super(id, context, "SecurityRoleAssign");
    SecurityRoleAssignIn = SecurityRoleAssignInIn;
    a_res_id = a_res_idIn;
    a_user_name = a_user_nameIn;
  }

  public void translateToMap() {
    if (SecurityRoleAssignIn != null) {
      if (SecurityRoleAssignIn != null) {
        Object[] list = new Object[SecurityRoleAssignIn.length];
        for (int i = 0; i < SecurityRoleAssignIn.length; i++) {
          list[i] = SecurityRoleObjectHelper.getMap(SecurityRoleAssignIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
        }
        addInput("SecurityRoleList", list);
      }
    }
    if (a_res_id != null) {
      addInput("AResId", a_res_id);
    }
    if (a_user_name != null) {
      addInput("AUserName", a_user_name);
    }
  }


/**
 *
 * Sets the SecurityRole
 * @param SecurityRoleAssignInIn Value of the SecurityRoleAssignIn
 *
 */

  public void setSecurityRole(SecurityRoleObjectData[] SecurityRoleAssignInIn) {
    SecurityRoleAssignIn = SecurityRoleAssignInIn;
  }

/**
 *
 * Sets the AResId
 * @param a_res_idIn Value of the a_res_id
 *
 */

  public void setAResId(BigInteger a_res_idIn) {
    a_res_id = a_res_idIn;
  }

/**
 *
 * Sets the AUserName
 * @param a_user_nameIn Value of the a_user_name
 *
 */

  public void setAUserName(String a_user_nameIn) {
    a_user_name = a_user_nameIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("SecurityRoleList");
    if (list != null) {
      SecurityRoleAssignIn = new SecurityRoleObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        SecurityRoleAssignIn[i] = SecurityRoleObjectHelper.getObj((Map) list[i]);
        SecurityRoleAssignIn[i].resetFlags(true, true);
      }
    }
    a_res_id = (BigInteger)inputMap.get("AResId");
    a_user_name = (String)inputMap.get("AUserName");
  }

/**
 *
 * Gets the SecurityRole
 * @return Value of the SecurityRole
 *
 */

  public SecurityRoleObjectData[] getSecurityRole( ) {
    return SecurityRoleAssignIn;
  }

/**
 *
 * Gets the AResId
 * @return Value of the AResId
 *
 */

  public BigInteger getAResId( ) {
    return a_res_id;
  }

/**
 *
 * Gets the AUserName
 * @return Value of the AUserName
 *
 */

  public String getAUserName( ) {
    return a_user_name;
  }

}
