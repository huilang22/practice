/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeValuesFindBulkUdtTemplateItem.java
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
 * Class used to create a StatisticTypeValuesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class StatisticTypeValuesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatisticTypeValuesObjectFilter StatisticTypeValuesFindIn;
/**
 *
 * Constructor to create a  StatisticTypeValuesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatisticTypeValuesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeValuesObjectFilter StatisticTypeValuesFindInIn) {
    super(id, context, "StatisticTypeValuesFind");
    StatisticTypeValuesFindIn = StatisticTypeValuesFindInIn;
  }

  public void translateToMap() {
    if (StatisticTypeValuesFindIn != null) {
      Integer index =  StatisticTypeValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(StatisticTypeValuesFindIn, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }


/**
 *
 * Sets the StatisticTypeValues
 * @param StatisticTypeValuesFindInIn Value of the StatisticTypeValuesFindIn
 *
 */

  public void setStatisticTypeValues(StatisticTypeValuesObjectFilter StatisticTypeValuesFindInIn) {
    StatisticTypeValuesFindIn = StatisticTypeValuesFindInIn;
  }

  public void translateFromMap() {
    StatisticTypeValuesFindIn = StatisticTypeValuesObjectHelper.fromMapFilter(inputMap, "StatisticTypeValues");
  }

/**
 *
 * Gets the StatisticTypeValues
 * @return Value of the StatisticTypeValues
 *
 */

  public StatisticTypeValuesObjectFilter getStatisticTypeValues( ) {
    return StatisticTypeValuesFindIn;
  }

}
