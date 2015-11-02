/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceUnassignBulkUdtTemplateItem.java
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
 * Class used to create a SecurityResourceUnassignBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityResourceUnassignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityResourceObjectData[] SecurityResourceUnassignIn;
  protected BigInteger b_role_id;
/**
 *
 * Constructor to create a  SecurityResourceUnassignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityResourceUnassignBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceUnassignInIn, BigInteger b_role_idIn) {
    super(id, context, "SecurityResourceUnassign");
    SecurityResourceUnassignIn = SecurityResourceUnassignInIn;
    b_role_id = b_role_idIn;
  }

  public void translateToMap() {
    if (SecurityResourceUnassignIn != null) {
      if (SecurityResourceUnassignIn != null) {
        Object[] list = new Object[SecurityResourceUnassignIn.length];
        for (int i = 0; i < SecurityResourceUnassignIn.length; i++) {
          list[i] = SecurityResourceObjectHelper.getMap(SecurityResourceUnassignIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
        }
        addInput("SecurityResourceList", list);
      }
    }
    if (b_role_id != null) {
      addInput("BRoleId", b_role_id);
    }
  }


/**
 *
 * Sets the SecurityResource
 * @param SecurityResourceUnassignInIn Value of the SecurityResourceUnassignIn
 *
 */

  public void setSecurityResource(SecurityResourceObjectData[] SecurityResourceUnassignInIn) {
    SecurityResourceUnassignIn = SecurityResourceUnassignInIn;
  }

/**
 *
 * Sets the BRoleId
 * @param b_role_idIn Value of the b_role_id
 *
 */

  public void setBRoleId(BigInteger b_role_idIn) {
    b_role_id = b_role_idIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("SecurityResourceList");
    if (list != null) {
      SecurityResourceUnassignIn = new SecurityResourceObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        SecurityResourceUnassignIn[i] = SecurityResourceObjectHelper.getObj((Map) list[i]);
        SecurityResourceUnassignIn[i].resetFlags(true, true);
      }
    }
    b_role_id = (BigInteger)inputMap.get("BRoleId");
  }

/**
 *
 * Gets the SecurityResource
 * @return Value of the SecurityResource
 *
 */

  public SecurityResourceObjectData[] getSecurityResource( ) {
    return SecurityResourceUnassignIn;
  }

/**
 *
 * Gets the BRoleId
 * @return Value of the BRoleId
 *
 */

  public BigInteger getBRoleId( ) {
    return b_role_id;
  }

}
