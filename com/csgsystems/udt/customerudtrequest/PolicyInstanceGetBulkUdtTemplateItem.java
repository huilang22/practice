/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceGetBulkUdtTemplateItem.java
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
 * Class used to create a PolicyInstanceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyInstanceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PolicyInstanceObjectKeyData piGetIn;
/**
 *
 * Constructor to create a  PolicyInstanceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyInstanceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectKeyData piGetInIn) {
    super(id, context, "PolicyInstanceGet");
    piGetIn = piGetInIn;
  }

  public void translateToMap() {
    if (piGetIn != null) {
      piGetIn.resetFlags(true, true);
      addInput("PolicyInstance", PolicyInstanceObjectKeyHelper.toMap(piGetIn, new HashMap(), "PolicyInstanceObjectKeyData").get("PolicyInstanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the PolicyInstance
 * @param piGetInIn Value of the piGetIn
 *
 */

  public void setPolicyInstance(PolicyInstanceObjectKeyData piGetInIn) {
    piGetIn = piGetInIn;
  }

  public void translateFromMap() {
    piGetIn = PolicyInstanceObjectKeyHelper.fromMap(inputMap, "PolicyInstance");
  }

/**
 *
 * Gets the PolicyInstance
 * @return Value of the PolicyInstance
 *
 */

  public PolicyInstanceObjectKeyData getPolicyInstance( ) {
    return piGetIn;
  }

}
