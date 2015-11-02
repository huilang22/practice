/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageGetBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectKeyData UnbilledUsagegetIn;
/**
 *
 * Constructor to create a  UnbilledUsageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectKeyData UnbilledUsagegetInIn) {
    super(id, context, "UnbilledUsageGet");
    UnbilledUsagegetIn = UnbilledUsagegetInIn;
  }

  public void translateToMap() {
    if (UnbilledUsagegetIn != null) {
      UnbilledUsagegetIn.resetFlags(true, true);
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(UnbilledUsagegetIn, new HashMap(), "UnbilledUsageObjectKeyData").get("UnbilledUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsagegetInIn Value of the UnbilledUsagegetIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectKeyData UnbilledUsagegetInIn) {
    UnbilledUsagegetIn = UnbilledUsagegetInIn;
  }

  public void translateFromMap() {
    UnbilledUsagegetIn = UnbilledUsageObjectKeyHelper.fromMap(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectKeyData getUnbilledUsage( ) {
    return UnbilledUsagegetIn;
  }

}
