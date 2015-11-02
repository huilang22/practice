/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageFindBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageObjectFilter RUFindIn;
/**
 *
 * Constructor to create a  RateUsageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectFilter RUFindInIn) {
    super(id, context, "RateUsageFind");
    RUFindIn = RUFindInIn;
  }

  public void translateToMap() {
    if (RUFindIn != null) {
      Integer index =  RUFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateUsage", RateUsageObjectHelper.toMap(RUFindIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }


/**
 *
 * Sets the RateUsage
 * @param RUFindInIn Value of the RUFindIn
 *
 */

  public void setRateUsage(RateUsageObjectFilter RUFindInIn) {
    RUFindIn = RUFindInIn;
  }

  public void translateFromMap() {
    RUFindIn = RateUsageObjectHelper.fromMapFilter(inputMap, "RateUsage");
  }

/**
 *
 * Gets the RateUsage
 * @return Value of the RateUsage
 *
 */

  public RateUsageObjectFilter getRateUsage( ) {
    return RUFindIn;
  }

}
