/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatisticTypeValuesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatisticTypeValuesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatisticTypeValuesObjectData noOpIn;

/**
 *
 * Constructor to create a   StatisticTypeValuesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatisticTypeValuesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatisticTypeValuesObjectData noOpInIn) {
    super(id, context, "StatisticTypeValuesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(noOpIn, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }
/**
 *
 * Sets the  StatisticTypeValues
 * @param noOpInIn StatisticTypeValuesObjectData to set
 *
 */
  public void setStatisticTypeValues(StatisticTypeValuesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatisticTypeValues passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeValuesObjectData getStatisticTypeValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatisticTypeValuesObjectHelper.fromMap(inputMap, "StatisticTypeValues");
  }
}
