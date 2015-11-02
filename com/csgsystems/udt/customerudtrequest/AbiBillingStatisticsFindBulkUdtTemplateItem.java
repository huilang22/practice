/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsFindBulkUdtTemplateItem.java
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
 * Class used to create a AbiBillingStatisticsFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AbiBillingStatisticsFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindIn;
/**
 *
 * Constructor to create a  AbiBillingStatisticsFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AbiBillingStatisticsFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindInIn) {
    super(id, context, "AbiBillingStatisticsFind");
    AbiBillingStatisticsFindIn = AbiBillingStatisticsFindInIn;
  }

  public void translateToMap() {
    if (AbiBillingStatisticsFindIn != null) {
      Integer index =  AbiBillingStatisticsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(AbiBillingStatisticsFindIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }


/**
 *
 * Sets the AbiBillingStatistics
 * @param AbiBillingStatisticsFindInIn Value of the AbiBillingStatisticsFindIn
 *
 */

  public void setAbiBillingStatistics(AbiBillingStatisticsObjectFilter AbiBillingStatisticsFindInIn) {
    AbiBillingStatisticsFindIn = AbiBillingStatisticsFindInIn;
  }

  public void translateFromMap() {
    AbiBillingStatisticsFindIn = AbiBillingStatisticsObjectHelper.fromMapFilter(inputMap, "AbiBillingStatistics");
  }

/**
 *
 * Gets the AbiBillingStatistics
 * @return Value of the AbiBillingStatistics
 *
 */

  public AbiBillingStatisticsObjectFilter getAbiBillingStatistics( ) {
    return AbiBillingStatisticsFindIn;
  }

}
