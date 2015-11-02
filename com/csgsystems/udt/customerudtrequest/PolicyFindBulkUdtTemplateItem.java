/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyFindBulkUdtTemplateItem.java
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
 * Class used to create a PolicyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyObjectFilter PolicyFindIn;
/**
 *
 * Constructor to create a  PolicyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectFilter PolicyFindInIn) {
    super(id, context, "PolicyFind");
    PolicyFindIn = PolicyFindInIn;
  }

  public void translateToMap() {
    if (PolicyFindIn != null) {
      Integer index =  PolicyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Policy", PolicyObjectHelper.toMap(PolicyFindIn, new HashMap(), "Policy").get("Policy"));
    }
  }


/**
 *
 * Sets the Policy
 * @param PolicyFindInIn Value of the PolicyFindIn
 *
 */

  public void setPolicy(PolicyObjectFilter PolicyFindInIn) {
    PolicyFindIn = PolicyFindInIn;
  }

  public void translateFromMap() {
    PolicyFindIn = PolicyObjectHelper.fromMapFilter(inputMap, "Policy");
  }

/**
 *
 * Gets the Policy
 * @return Value of the Policy
 *
 */

  public PolicyObjectFilter getPolicy( ) {
    return PolicyFindIn;
  }

}
