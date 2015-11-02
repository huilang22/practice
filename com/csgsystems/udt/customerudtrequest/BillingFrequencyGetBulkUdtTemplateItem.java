/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyGetBulkUdtTemplateItem.java
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
 * Class used to create a BillingFrequencyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BillingFrequencyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BFObjectKeyData BFGetIn;
/**
 *
 * Constructor to create a  BillingFrequencyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillingFrequencyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectKeyData BFGetInIn) {
    super(id, context, "BillingFrequencyGet");
    BFGetIn = BFGetInIn;
  }

  public void translateToMap() {
    if (BFGetIn != null) {
      BFGetIn.resetFlags(true, true);
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(BFGetIn, new HashMap(), "BFObjectKeyData").get("BFObjectKeyData"));
    }
  }


/**
 *
 * Sets the BillingFrequency
 * @param BFGetInIn Value of the BFGetIn
 *
 */

  public void setBillingFrequency(BFObjectKeyData BFGetInIn) {
    BFGetIn = BFGetInIn;
  }

  public void translateFromMap() {
    BFGetIn = BFObjectKeyHelper.fromMap(inputMap, "BillingFrequency");
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public BFObjectKeyData getBillingFrequency( ) {
    return BFGetIn;
  }

}
