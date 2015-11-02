/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceCreateBulkUdtTemplateItem.java
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
 * Class used to create a SecurityResourceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SecurityResourceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SecurityResourceObjectData SECreateIn;
/**
 *
 * Constructor to create a  SecurityResourceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SecurityResourceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityResourceObjectData SECreateInIn) {
    super(id, context, "SecurityResourceCreate");
    SECreateIn = SECreateInIn;
  }

  public void translateToMap() {
    if (SECreateIn != null) {
      SECreateIn.resetFlags(true, true);
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECreateIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }


/**
 *
 * Sets the SecurityResource
 * @param SECreateInIn Value of the SECreateIn
 *
 */

  public void setSecurityResource(SecurityResourceObjectData SECreateInIn) {
    SECreateIn = SECreateInIn;
  }

  public void translateFromMap() {
    SECreateIn = SecurityResourceObjectHelper.fromMap(inputMap, "SecurityResource");
  }

/**
 *
 * Gets the SecurityResource
 * @return Value of the SecurityResource
 *
 */

  public SecurityResourceObjectData getSecurityResource( ) {
    return SECreateIn;
  }

}
