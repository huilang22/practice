/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BillingFrequencyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BillingFrequencyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BFObjectData BFUpdateIn;
/**
 *
 * Constructor to create a  BillingFrequencyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillingFrequencyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BFObjectData BFUpdateInIn) {
    super(id, context, "BillingFrequencyUpdate");
    BFUpdateIn = BFUpdateInIn;
  }

  public void translateToMap() {
    if (BFUpdateIn != null) {
      BFUpdateIn.resetFlags(true, true);
      addInput("BillingFrequency", BFObjectHelper.toMap(BFUpdateIn, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }


/**
 *
 * Sets the BillingFrequency
 * @param BFUpdateInIn Value of the BFUpdateIn
 *
 */

  public void setBillingFrequency(BFObjectData BFUpdateInIn) {
    BFUpdateIn = BFUpdateInIn;
  }

  public void translateFromMap() {
    BFUpdateIn = BFObjectHelper.fromMap(inputMap, "BillingFrequency");
  }

/**
 *
 * Gets the BillingFrequency
 * @return Value of the BillingFrequency
 *
 */

  public BFObjectData getBillingFrequency( ) {
    return BFUpdateIn;
  }

}
