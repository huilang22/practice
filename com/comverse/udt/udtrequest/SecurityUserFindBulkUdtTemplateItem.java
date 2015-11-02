/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserFindBulkUdtTemplateItem.java
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
 * Class used to create a SecurityUserFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityUserFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityUserObjectFilter SecurityUserFindIn;
/**
 *
 * Constructor to create a  SecurityUserFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityUserFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityUserObjectFilter SecurityUserFindInIn) {
    super(id, context, "SecurityUserFind");
    SecurityUserFindIn = SecurityUserFindInIn;
  }

  public void translateToMap() {
    if (SecurityUserFindIn != null) {
      Integer index =  SecurityUserFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(SecurityUserFindIn, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }


/**
 *
 * Sets the SecurityUser
 * @param SecurityUserFindInIn Value of the SecurityUserFindIn
 *
 */

  public void setSecurityUser(SecurityUserObjectFilter SecurityUserFindInIn) {
    SecurityUserFindIn = SecurityUserFindInIn;
  }

  public void translateFromMap() {
    SecurityUserFindIn = SecurityUserObjectHelper.fromMapFilter(inputMap, "SecurityUser");
  }

/**
 *
 * Gets the SecurityUser
 * @return Value of the SecurityUser
 *
 */

  public SecurityUserObjectFilter getSecurityUser( ) {
    return SecurityUserFindIn;
  }

}
