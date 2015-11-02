/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HistoricalContributionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HistoricalContributionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HistoricalContributionObjectData noOpIn;

/**
 *
 * Constructor to create a   HistoricalContributionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HistoricalContributionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectData noOpInIn) {
    super(id, context, "HistoricalContributionCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(noOpIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
/**
 *
 * Sets the  HistoricalContribution
 * @param noOpInIn HistoricalContributionObjectData to set
 *
 */
  public void setHistoricalContribution(HistoricalContributionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HistoricalContribution passed into the constructor
 * @return Simulated response
 *
 */
  public HistoricalContributionObjectData getHistoricalContribution() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HistoricalContributionObjectHelper.fromMap(inputMap, "HistoricalContribution");
  }
}
