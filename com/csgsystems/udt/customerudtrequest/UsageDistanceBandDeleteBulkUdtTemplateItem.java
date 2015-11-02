/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandDeleteBulkUdtTemplateItem.java
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
 * Class used to create a UsageDistanceBandDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageDistanceBandDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageDistBandObjectKeyData UDBDeleteIn;
/**
 *
 * Constructor to create a  UsageDistanceBandDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageDistanceBandDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectKeyData UDBDeleteInIn) {
    super(id, context, "UsageDistanceBandDelete");
    UDBDeleteIn = UDBDeleteInIn;
  }

  public void translateToMap() {
    if (UDBDeleteIn != null) {
      UDBDeleteIn.resetFlags(true, true);
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(UDBDeleteIn, new HashMap(), "UsageDistBandObjectKeyData").get("UsageDistBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the UsageDistanceBand
 * @param UDBDeleteInIn Value of the UDBDeleteIn
 *
 */

  public void setUsageDistanceBand(UsageDistBandObjectKeyData UDBDeleteInIn) {
    UDBDeleteIn = UDBDeleteInIn;
  }

  public void translateFromMap() {
    UDBDeleteIn = UsageDistBandObjectKeyHelper.fromMap(inputMap, "UsageDistanceBand");
  }

/**
 *
 * Gets the UsageDistanceBand
 * @return Value of the UsageDistanceBand
 *
 */

  public UsageDistBandObjectKeyData getUsageDistanceBand( ) {
    return UDBDeleteIn;
  }

}
