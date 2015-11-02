/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceGetBulkUdtTemplateItem.java
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
 * Class used to create a SecurityResourceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityResourceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityResourceObjectData SECGetIn;
/**
 *
 * Constructor to create a  SecurityResourceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityResourceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectData SECGetInIn) {
    super(id, context, "SecurityResourceGet");
    SECGetIn = SECGetInIn;
  }

  public void translateToMap() {
    if (SECGetIn != null) {
      SECGetIn.resetFlags(true, true);
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECGetIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }


/**
 *
 * Sets the SecurityResource
 * @param SECGetInIn Value of the SECGetIn
 *
 */

  public void setSecurityResource(SecurityResourceObjectData SECGetInIn) {
    SECGetIn = SECGetInIn;
  }

  public void translateFromMap() {
    SECGetIn = SecurityResourceObjectHelper.fromMap(inputMap, "SecurityResource");
  }

/**
 *
 * Gets the SecurityResource
 * @return Value of the SecurityResource
 *
 */

  public SecurityResourceObjectData getSecurityResource( ) {
    return SECGetIn;
  }

}
