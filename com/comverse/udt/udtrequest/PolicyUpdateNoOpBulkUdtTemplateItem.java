/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PolicyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyObjectData noOpIn;

/**
 *
 * Constructor to create a   PolicyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectData noOpInIn) {
    super(id, context, "PolicyUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Policy", PolicyObjectHelper.toMap(noOpIn, new HashMap(), "Policy").get("Policy"));
    }
  }
/**
 *
 * Sets the  Policy
 * @param noOpInIn PolicyObjectData to set
 *
 */
  public void setPolicy(PolicyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Policy passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyObjectData getPolicy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyObjectHelper.fromMap(inputMap, "Policy");
  }
}
