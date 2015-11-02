/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRoleUnassignBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a SecurityRoleUnassignBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityRoleUnassignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityRoleObjectData[] SecurityRoleUnassignIn;
  protected BigInteger b_res_id;
/**
 *
 * Constructor to create a  SecurityRoleUnassignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityRoleUnassignBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityRoleObjectData[] SecurityRoleUnassignInIn, BigInteger b_res_idIn) {
    super(id, context, "SecurityRoleUnassign");
    SecurityRoleUnassignIn = SecurityRoleUnassignInIn;
    b_res_id = b_res_idIn;
  }

  public void translateToMap() {
    if (SecurityRoleUnassignIn != null) {
      if (SecurityRoleUnassignIn != null) {
        Object[] list = new Object[SecurityRoleUnassignIn.length];
        for (int i = 0; i < SecurityRoleUnassignIn.length; i++) {
          list[i] = SecurityRoleObjectHelper.getMap(SecurityRoleUnassignIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
        }
        addInput("SecurityRoleList", list);
      }
    }
    if (b_res_id != null) {
      addInput("BResId", b_res_id);
    }
  }


/**
 *
 * Sets the SecurityRole
 * @param SecurityRoleUnassignInIn Value of the SecurityRoleUnassignIn
 *
 */

  public void setSecurityRole(SecurityRoleObjectData[] SecurityRoleUnassignInIn) {
    SecurityRoleUnassignIn = SecurityRoleUnassignInIn;
  }

/**
 *
 * Sets the BResId
 * @param b_res_idIn Value of the b_res_id
 *
 */

  public void setBResId(BigInteger b_res_idIn) {
    b_res_id = b_res_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("SecurityRoleList");
    if (list != null) {
      SecurityRoleUnassignIn = new SecurityRoleObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        SecurityRoleUnassignIn[i] = SecurityRoleObjectHelper.getObj((Map) list[i]);
        SecurityRoleUnassignIn[i].resetFlags(true, true);
      }
    }
    b_res_id = (BigInteger)inputMap.get("BResId");
  }

/**
 *
 * Gets the SecurityRole
 * @return Value of the SecurityRole
 *
 */

  public SecurityRoleObjectData[] getSecurityRole( ) {
    return SecurityRoleUnassignIn;
  }

/**
 *
 * Gets the BResId
 * @return Value of the BResId
 *
 */

  public BigInteger getBResId( ) {
    return b_res_id;
  }

}
