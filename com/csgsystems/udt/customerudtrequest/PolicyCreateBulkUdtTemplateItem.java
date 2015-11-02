/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PolicyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyObjectData PolicyCreateIn;
/**
 *
 * Constructor to create a  PolicyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectData PolicyCreateInIn) {
    super(id, context, "PolicyCreate");
    PolicyCreateIn = PolicyCreateInIn;
  }

  public void translateToMap() {
    if (PolicyCreateIn != null) {
      PolicyCreateIn.resetFlags(true, true);
      addInput("Policy", PolicyObjectHelper.toMap(PolicyCreateIn, new HashMap(), "Policy").get("Policy"));
    }
  }


/**
 *
 * Sets the Policy
 * @param PolicyCreateInIn Value of the PolicyCreateIn
 *
 */

  public void setPolicy(PolicyObjectData PolicyCreateInIn) {
    PolicyCreateIn = PolicyCreateInIn;
  }

  public void translateFromMap() {
    PolicyCreateIn = PolicyObjectHelper.fromMap(inputMap, "Policy");
  }

/**
 *
 * Gets the Policy
 * @return Value of the Policy
 *
 */

  public PolicyObjectData getPolicy( ) {
    return PolicyCreateIn;
  }

}
