/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyGetBulkUdtTemplateItem.java
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
 * Class used to create a PolicyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyObjectKeyData PolicyGetIn;
/**
 *
 * Constructor to create a  PolicyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectKeyData PolicyGetInIn) {
    super(id, context, "PolicyGet");
    PolicyGetIn = PolicyGetInIn;
  }

  public void translateToMap() {
    if (PolicyGetIn != null) {
      PolicyGetIn.resetFlags(true, true);
      addInput("Policy", PolicyObjectKeyHelper.toMap(PolicyGetIn, new HashMap(), "PolicyObjectKeyData").get("PolicyObjectKeyData"));
    }
  }


/**
 *
 * Sets the Policy
 * @param PolicyGetInIn Value of the PolicyGetIn
 *
 */

  public void setPolicy(PolicyObjectKeyData PolicyGetInIn) {
    PolicyGetIn = PolicyGetInIn;
  }

  public void translateFromMap() {
    PolicyGetIn = PolicyObjectKeyHelper.fromMap(inputMap, "Policy");
  }

/**
 *
 * Gets the Policy
 * @return Value of the Policy
 *
 */

  public PolicyObjectKeyData getPolicy( ) {
    return PolicyGetIn;
  }

}
