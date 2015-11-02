/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandCreateBulkUdtTemplateItem.java
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
 * Class used to create a UsageDistanceBandCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageDistanceBandCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageDistBandObjectData UDBCreateIn;
/**
 *
 * Constructor to create a  UsageDistanceBandCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageDistanceBandCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectData UDBCreateInIn) {
    super(id, context, "UsageDistanceBandCreate");
    UDBCreateIn = UDBCreateInIn;
  }

  public void translateToMap() {
    if (UDBCreateIn != null) {
      UDBCreateIn.resetFlags(true, true);
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBCreateIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }


/**
 *
 * Sets the UsageDistanceBand
 * @param UDBCreateInIn Value of the UDBCreateIn
 *
 */

  public void setUsageDistanceBand(UsageDistBandObjectData UDBCreateInIn) {
    UDBCreateIn = UDBCreateInIn;
  }

  public void translateFromMap() {
    UDBCreateIn = UsageDistBandObjectHelper.fromMap(inputMap, "UsageDistanceBand");
  }

/**
 *
 * Gets the UsageDistanceBand
 * @return Value of the UsageDistanceBand
 *
 */

  public UsageDistBandObjectData getUsageDistanceBand( ) {
    return UDBCreateIn;
  }

}
