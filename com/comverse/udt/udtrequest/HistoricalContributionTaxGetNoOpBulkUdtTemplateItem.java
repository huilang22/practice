/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalContributionTaxGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalContributionTaxGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalContributionTaxObjectData noOpIn;

/**
 *
 * Constructor to create a   HistoricalContributionTaxGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalContributionTaxGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectData noOpInIn) {
    super(id, context, "HistoricalContributionTaxGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
/**
 *
 * Sets the  HistoricalContributionTax
 * @param noOpInIn HistoricalContributionTaxObjectData to set
 *
 */
  public void setHistoricalContributionTax(HistoricalContributionTaxObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalContributionTax passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionTaxObjectData getHistoricalContributionTax() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalContributionTaxObjectHelper.fromMap(inputMap, "HistoricalContributionTax");
  }
}
