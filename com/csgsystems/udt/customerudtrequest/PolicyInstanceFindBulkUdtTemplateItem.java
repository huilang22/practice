/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a PolicyInstanceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyInstanceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyInstanceObjectFilter piFindIn;
/**
 *
 * Constructor to create a  PolicyInstanceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyInstanceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectFilter piFindInIn) {
    super(id, context, "PolicyInstanceFind");
    piFindIn = piFindInIn;
  }

  public void translateToMap() {
    if (piFindIn != null) {
      Integer index =  piFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(piFindIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param piFindInIn Value of the piFindIn
 *
 */

  public void setPolicyInstance(PolicyInstanceObjectFilter piFindInIn) {
    piFindIn = piFindInIn;
  }

  public void translateFromMap() {
    piFindIn = PolicyInstanceObjectHelper.fromMapFilter(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public PolicyInstanceObjectFilter getPolicyInstance( ) {
    return piFindIn;
  }

}
