/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BilledUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectKeyData BilledUsagegetIn;
/**
 *
 * Constructor to create a  BilledUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectKeyData BilledUsagegetInIn) {
    super(id, context, "BilledUsageGet");
    BilledUsagegetIn = BilledUsagegetInIn;
  }

  public void translateToMap() {
    if (BilledUsagegetIn != null) {
      BilledUsagegetIn.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(BilledUsagegetIn, new HashMap(), "BilledUsageObjectKeyData").get("BilledUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagegetInIn Value of the BilledUsagegetIn
 *
 */

  public void setBilledUsage(BilledUsageObjectKeyData BilledUsagegetInIn) {
    BilledUsagegetIn = BilledUsagegetInIn;
  }

  public void translateFromMap() {
    BilledUsagegetIn = BilledUsageObjectKeyHelper.fromMap(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectKeyData getBilledUsage( ) {
    return BilledUsagegetIn;
  }

}
