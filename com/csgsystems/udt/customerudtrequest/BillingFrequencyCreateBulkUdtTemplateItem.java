/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyCreateBulkUdtTemplateItem.java
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
 * Class used to create a BillingFrequencyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillingFrequencyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BFObjectData BFCreateIn;
/**
 *
 * Constructor to create a  BillingFrequencyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillingFrequencyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectData BFCreateInIn) {
    super(id, context, "BillingFrequencyCreate");
    BFCreateIn = BFCreateInIn;
  }

  public void translateToMap() {
    if (BFCreateIn != null) {
      BFCreateIn.resetFlags(true, true);
      addInput("BillingFrequency", BFObjectHelper.toMap(BFCreateIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }


/**
 *
 * Sets the BillingFrequency
 * @param BFCreateInIn Value of the BFCreateIn
 *
 */

  public void setBillingFrequency(BFObjectData BFCreateInIn) {
    BFCreateIn = BFCreateInIn;
  }

  public void translateFromMap() {
    BFCreateIn = BFObjectHelper.fromMap(inputMap, "BillingFrequency");
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public BFObjectData getBillingFrequency( ) {
    return BFCreateIn;
  }

}
