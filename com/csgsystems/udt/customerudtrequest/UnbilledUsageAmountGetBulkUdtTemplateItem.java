/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectKeyData UnbilledUsageAmountIn;
/**
 *
 * Constructor to create a  UnbilledUsageAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsageAmountInIn) {
    super(id, context, "UnbilledUsageAmountGet");
    UnbilledUsageAmountIn = UnbilledUsageAmountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsageAmountIn != null) {
      UnbilledUsageAmountIn.resetFlags(true, true);
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(UnbilledUsageAmountIn, new HashMap(), "UnbilledUsageObjectKeyData").get("UnbilledUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsageAmountInIn Value of the UnbilledUsageAmountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectKeyData UnbilledUsageAmountInIn) {
    UnbilledUsageAmountIn = UnbilledUsageAmountInIn;
  }

  public void translateFromMap() {
    UnbilledUsageAmountIn = UnbilledUsageObjectKeyHelper.fromMap(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectKeyData getUnbilledUsage( ) {
    return UnbilledUsageAmountIn;
  }

}
