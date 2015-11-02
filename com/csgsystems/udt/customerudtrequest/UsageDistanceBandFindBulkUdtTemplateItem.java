/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandFindBulkUdtTemplateItem.java
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
 * Class used to create a UsageDistanceBandFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UsageDistanceBandFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UsageDistBandObjectFilter UDBFindIn;
/**
 *
 * Constructor to create a  UsageDistanceBandFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UsageDistanceBandFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectFilter UDBFindInIn) {
    super(id, context, "UsageDistanceBandFind");
    UDBFindIn = UDBFindInIn;
  }

  public void translateToMap() {
    if (UDBFindIn != null) {
      Integer index =  UDBFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBFindIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }


/**
 *
 * Sets the UsageDistanceBand
 * @param UDBFindInIn Value of the UDBFindIn
 *
 */

  public void setUsageDistanceBand(UsageDistBandObjectFilter UDBFindInIn) {
    UDBFindIn = UDBFindInIn;
  }

  public void translateFromMap() {
    UDBFindIn = UsageDistBandObjectHelper.fromMapFilter(inputMap, "UsageDistanceBand");
  }

/**
 *
 * Gets the UsageDistanceBand
 * @return Value of the UsageDistanceBand
 *
 */

  public UsageDistBandObjectFilter getUsageDistanceBand( ) {
    return UDBFindIn;
  }

}
