/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityCallBulkUdtTemplateItem.java
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
import com.csgsystems.sec.data.*;

/**
 *
 * Class used to create a SecurityCallBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityCallBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityPortalObjectData SecurityPortalIn;
/**
 *
 * Constructor to create a  SecurityCallBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityCallBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityPortalObjectData SecurityPortalInIn) {
    super(id, context, "SecurityCall");
    SecurityPortalIn = SecurityPortalInIn;
  }

  public void translateToMap() {
    if (SecurityPortalIn != null) {
      SecurityPortalIn.resetFlags(true, true);
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(SecurityPortalIn, new HashMap(), "SecurityPortal").get("SecurityPortal"));
    }
  }


/**
 *
 * Sets the SecurityPortal
 * @param SecurityPortalInIn Value of the SecurityPortalIn
 *
 */

  public void setSecurityPortal(SecurityPortalObjectData SecurityPortalInIn) {
    SecurityPortalIn = SecurityPortalInIn;
  }

  public void translateFromMap() {
    SecurityPortalIn = SecurityPortalObjectHelper.fromMap(inputMap, "SecurityPortal");
  }

/**
 *
 * Gets the SecurityPortal
 * @return Value of the SecurityPortal
 *
 */

  public SecurityPortalObjectData getSecurityPortal( ) {
    return SecurityPortalIn;
  }

}
