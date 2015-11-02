/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BillingFrequencyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BillingFrequencyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BFObjectKeyData BFDeleteIn;
/**
 *
 * Constructor to create a  BillingFrequencyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillingFrequencyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectKeyData BFDeleteInIn) {
    super(id, context, "BillingFrequencyDelete");
    BFDeleteIn = BFDeleteInIn;
  }

  public void translateToMap() {
    if (BFDeleteIn != null) {
      BFDeleteIn.resetFlags(true, true);
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(BFDeleteIn, new HashMap(), "BFObjectKeyData").get("BFObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillingFrequency
 * @param BFDeleteInIn Value of the BFDeleteIn
 *
 */

  public void setBillingFrequency(BFObjectKeyData BFDeleteInIn) {
    BFDeleteIn = BFDeleteInIn;
  }

  public void translateFromMap() {
    BFDeleteIn = BFObjectKeyHelper.fromMap(inputMap, "BillingFrequency");
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public BFObjectKeyData getBillingFrequency( ) {
    return BFDeleteIn;
  }

}
