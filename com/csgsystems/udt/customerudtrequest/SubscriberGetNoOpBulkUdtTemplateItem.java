/*
 * Generated code DO NOT EDIT
 * Generated file: SubscriberGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SubscriberGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SubscriberGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SubscriberObjectData noOpIn;

/**
 *
 * Constructor to create a   SubscriberGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SubscriberGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SubscriberObjectData noOpInIn) {
    super(id, context, "SubscriberGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PolicyInstance", SubscriberObjectHelper.toMap(noOpIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
/**
 *
 * Sets the  PolicyInstance
 * @param noOpInIn SubscriberObjectData to set
 *
 */
  public void setPolicyInstance(SubscriberObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PolicyInstance passed into the constructor
 * @return Simulated response
 *
 */
  public SubscriberObjectData getPolicyInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SubscriberObjectHelper.fromMap(inputMap, "PolicyInstance");
  }
}
