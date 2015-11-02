/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a StatisticTypeValuesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatisticTypeValuesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StatisticTypeValuesObjectKeyData StatisticTypeValuesGetIn;
/**
 *
 * Constructor to create a  StatisticTypeValuesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatisticTypeValuesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeValuesObjectKeyData StatisticTypeValuesGetInIn) {
    super(id, context, "StatisticTypeValuesGet");
    StatisticTypeValuesGetIn = StatisticTypeValuesGetInIn;
  }

  public void translateToMap() {
    if (StatisticTypeValuesGetIn != null) {
      StatisticTypeValuesGetIn.resetFlags(true, true);
      addInput("StatisticTypeValues", StatisticTypeValuesObjectKeyHelper.toMap(StatisticTypeValuesGetIn, new HashMap(), "StatisticTypeValuesObjectKeyData").get("StatisticTypeValuesObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatisticTypeValues
 * @param StatisticTypeValuesGetInIn Value of the StatisticTypeValuesGetIn
 *
 */

  public void setStatisticTypeValues(StatisticTypeValuesObjectKeyData StatisticTypeValuesGetInIn) {
    StatisticTypeValuesGetIn = StatisticTypeValuesGetInIn;
  }

  public void translateFromMap() {
    StatisticTypeValuesGetIn = StatisticTypeValuesObjectKeyHelper.fromMap(inputMap, "StatisticTypeValues");
  }

/**
 *
 * Gets the StatisticTypeValues
 * @return Value of the StatisticTypeValues
 *
 */

  public StatisticTypeValuesObjectKeyData getStatisticTypeValues( ) {
    return StatisticTypeValuesGetIn;
  }

}
