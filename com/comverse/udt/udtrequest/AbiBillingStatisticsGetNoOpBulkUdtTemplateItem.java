/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a AbiBillingStatisticsGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiBillingStatisticsGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiBillingStatisticsObjectData noOpIn;

/**
 *
 * Constructor to create a   AbiBillingStatisticsGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiBillingStatisticsGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiBillingStatisticsObjectData noOpInIn) {
    super(id, context, "AbiBillingStatisticsGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(noOpIn, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }
/**
 *
 * Sets the  AbiBillingStatistics
 * @param noOpInIn AbiBillingStatisticsObjectData to set
 *
 */
  public void setAbiBillingStatistics(AbiBillingStatisticsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiBillingStatistics passed into the constructor
 * @return Simulated response
 *
 */
  public AbiBillingStatisticsObjectData getAbiBillingStatistics() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiBillingStatisticsObjectHelper.fromMap(inputMap, "AbiBillingStatistics");
  }
}
