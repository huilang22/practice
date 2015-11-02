/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceAssignBulkUdtTemplateItem.java
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
 * Class used to create a SecurityResourceAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityResourceAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityResourceObjectData[] SecurityResourceAssignIn;
  protected BigInteger a_role_id;
  protected String a_user_name;
/**
 *
 * Constructor to create a  SecurityResourceAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityResourceAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectData[] SecurityResourceAssignInIn, BigInteger a_role_idIn, String a_user_nameIn) {
    super(id, context, "SecurityResourceAssign");
    SecurityResourceAssignIn = SecurityResourceAssignInIn;
    a_role_id = a_role_idIn;
    a_user_name = a_user_nameIn;
  }

  public void translateToMap() {
    if (SecurityResourceAssignIn != null) {
      if (SecurityResourceAssignIn != null) {
        Object[] list = new Object[SecurityResourceAssignIn.length];
        for (int i = 0; i < SecurityResourceAssignIn.length; i++) {
          list[i] = SecurityResourceObjectHelper.getMap(SecurityResourceAssignIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
        }
        addInput("SecurityResourceList", list);
      }
    }
    if (a_role_id != null) {
      addInput("ARoleId", a_role_id);
    }
    if (a_user_name != null) {
      addInput("AUserName", a_user_name);
    }
  }


/**
 *
 * Sets the SecurityResource
 * @param SecurityResourceAssignInIn Value of the SecurityResourceAssignIn
 *
 */

  public void setSecurityResource(SecurityResourceObjectData[] SecurityResourceAssignInIn) {
    SecurityResourceAssignIn = SecurityResourceAssignInIn;
  }

/**
 *
 * Sets the ARoleId
 * @param a_role_idIn Value of the a_role_id
 *
 */

  public void setARoleId(BigInteger a_role_idIn) {
    a_role_id = a_role_idIn;
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
    Object[] list = (Object[]) inputMap.get("SecurityResourceList");
    if (list != null) {
      SecurityResourceAssignIn = new SecurityResourceObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        SecurityResourceAssignIn[i] = SecurityResourceObjectHelper.getObj((Map) list[i]);
        SecurityResourceAssignIn[i].resetFlags(true, true);
      }
    }
    a_role_id = (BigInteger)inputMap.get("ARoleId");
    a_user_name = (String)inputMap.get("AUserName");
  }

/**
 *
 * Gets the SecurityResource
 * @return Value of the SecurityResource
 *
 */

  public SecurityResourceObjectData[] getSecurityResource( ) {
    return SecurityResourceAssignIn;
  }

/**
 *
 * Gets the ARoleId
 * @return Value of the ARoleId
 *
 */

  public BigInteger getARoleId( ) {
    return a_role_id;
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
