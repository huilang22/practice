/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PolicyInstanceCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a PolicyInstanceCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyInstanceCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyInstanceObjectData noOpIn;

/**
 *
 * Constructor to create a   PolicyInstanceCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyInstanceCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectData noOpInIn) {
    super(id, context, "PolicyInstanceCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(noOpIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
/**
 *
 * Sets the  PolicyInstance
 * @param noOpInIn PolicyInstanceObjectData to set
 *
 */
  public void setPolicyInstance(PolicyInstanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PolicyInstance passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyInstanceObjectData getPolicyInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyInstanceObjectHelper.fromMap(inputMap, "PolicyInstance");
  }
}
