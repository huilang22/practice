/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillingFrequencyDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillingFrequencyDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BFObjectData noOpIn;

/**
 *
 * Constructor to create a   BillingFrequencyDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillingFrequencyDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectData noOpInIn) {
    super(id, context, "BillingFrequencyDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillingFrequency", BFObjectHelper.toMap(noOpIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
/**
 *
 * Sets the  BillingFrequency
 * @param noOpInIn BFObjectData to set
 *
 */
  public void setBillingFrequency(BFObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillingFrequency passed into the constructor
 * @return Simulated response
 *
 */
  public BFObjectData getBillingFrequency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BFObjectHelper.fromMap(inputMap, "BillingFrequency");
  }
}
