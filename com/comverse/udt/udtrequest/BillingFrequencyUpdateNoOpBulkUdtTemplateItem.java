/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillingFrequencyUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillingFrequencyUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BFObjectData noOpIn;

/**
 *
 * Constructor to create a   BillingFrequencyUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillingFrequencyUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectData noOpInIn) {
    super(id, context, "BillingFrequencyUpdate");
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
