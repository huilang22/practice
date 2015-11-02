/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionTaxCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalContributionTaxCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalContributionTaxCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalContributionTaxObjectData noOpIn;

/**
 *
 * Constructor to create a   HistoricalContributionTaxCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalContributionTaxCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectData noOpInIn) {
    super(id, context, "HistoricalContributionTaxCreate");
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
