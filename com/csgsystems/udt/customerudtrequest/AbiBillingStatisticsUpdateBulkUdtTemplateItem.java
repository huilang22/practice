/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AbiBillingStatisticsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillingStatisticsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateIn;
/**
 *
 * Constructor to create a  AbiBillingStatisticsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillingStatisticsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateInIn) {
    super(id, context, "AbiBillingStatisticsUpdate");
    AbiBillingStatisticsUpdateIn = AbiBillingStatisticsUpdateInIn;
  }

  public void translateToMap() {
    if (AbiBillingStatisticsUpdateIn != null) {
      AbiBillingStatisticsUpdateIn.resetFlags(true, true);
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(AbiBillingStatisticsUpdateIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }


/**
 *
 * Sets the AbiBillingStatistics
 * @param AbiBillingStatisticsUpdateInIn Value of the AbiBillingStatisticsUpdateIn
 *
 */

  public void setAbiBillingStatistics(AbiBillingStatisticsObjectData AbiBillingStatisticsUpdateInIn) {
    AbiBillingStatisticsUpdateIn = AbiBillingStatisticsUpdateInIn;
  }

  public void translateFromMap() {
    AbiBillingStatisticsUpdateIn = AbiBillingStatisticsObjectHelper.fromMap(inputMap, "AbiBillingStatistics");
  }

/**
 *
 * Gets the AbiBillingStatistics
 * @return Value of the AbiBillingStatistics
 *
 */

  public AbiBillingStatisticsObjectData getAbiBillingStatistics( ) {
    return AbiBillingStatisticsUpdateIn;
  }

}
