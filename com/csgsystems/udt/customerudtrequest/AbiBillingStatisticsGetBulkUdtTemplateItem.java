/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsGetBulkUdtTemplateItem.java
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
 * Class used to create a AbiBillingStatisticsGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillingStatisticsGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetIn;
/**
 *
 * Constructor to create a  AbiBillingStatisticsGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillingStatisticsGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetInIn) {
    super(id, context, "AbiBillingStatisticsGet");
    AbiBillingStatisticsGetIn = AbiBillingStatisticsGetInIn;
  }

  public void translateToMap() {
    if (AbiBillingStatisticsGetIn != null) {
      AbiBillingStatisticsGetIn.resetFlags(true, true);
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectKeyHelper.toMap(AbiBillingStatisticsGetIn, new HashMap(), "AbiBillingStatisticsObjectKeyData").get("AbiBillingStatisticsObjectKeyData"));
    }
  }


/**
 *
 * Sets the AbiBillingStatistics
 * @param AbiBillingStatisticsGetInIn Value of the AbiBillingStatisticsGetIn
 *
 */

  public void setAbiBillingStatistics(AbiBillingStatisticsObjectKeyData AbiBillingStatisticsGetInIn) {
    AbiBillingStatisticsGetIn = AbiBillingStatisticsGetInIn;
  }

  public void translateFromMap() {
    AbiBillingStatisticsGetIn = AbiBillingStatisticsObjectKeyHelper.fromMap(inputMap, "AbiBillingStatistics");
  }

/**
 *
 * Gets the AbiBillingStatistics
 * @return Value of the AbiBillingStatistics
 *
 */

  public AbiBillingStatisticsObjectKeyData getAbiBillingStatistics( ) {
    return AbiBillingStatisticsGetIn;
  }

}
