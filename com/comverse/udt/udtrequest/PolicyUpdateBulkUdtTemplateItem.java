/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PolicyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyObjectData PolicyUpdateIn;
/**
 *
 * Constructor to create a  PolicyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectData PolicyUpdateInIn) {
    super(id, context, "PolicyUpdate");
    PolicyUpdateIn = PolicyUpdateInIn;
  }

  public void translateToMap() {
    if (PolicyUpdateIn != null) {
      PolicyUpdateIn.resetFlags(true, true);
      addInput("Policy", PolicyObjectHelper.toMap(PolicyUpdateIn, new HashMap(), "Policy").get("Policy"));
    }
  }


/**
 *
 * Sets the Policy
 * @param PolicyUpdateInIn Value of the PolicyUpdateIn
 *
 */

  public void setPolicy(PolicyObjectData PolicyUpdateInIn) {
    PolicyUpdateIn = PolicyUpdateInIn;
  }

  public void translateFromMap() {
    PolicyUpdateIn = PolicyObjectHelper.fromMap(inputMap, "Policy");
  }

/**
 *
 * Gets the Policy
 * @return Value of the Policy
 *
 */

  public PolicyObjectData getPolicy( ) {
    return PolicyUpdateIn;
  }

}
