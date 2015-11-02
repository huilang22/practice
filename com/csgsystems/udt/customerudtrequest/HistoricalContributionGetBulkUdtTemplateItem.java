/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionGetBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionObjectKeyData HCgetIn;
/**
 *
 * Constructor to create a  HistoricalContributionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectKeyData HCgetInIn) {
    super(id, context, "HistoricalContributionGet");
    HCgetIn = HCgetInIn;
  }

  public void translateToMap() {
    if (HCgetIn != null) {
      HCgetIn.resetFlags(true, true);
      addInput("HistoricalContribution", HistoricalContributionObjectKeyHelper.toMap(HCgetIn, new HashMap(), "HistoricalContributionObjectKeyData").get("HistoricalContributionObjectKeyData"));
    }
  }


/**
 *
 * Sets the HistoricalContribution
 * @param HCgetInIn Value of the HCgetIn
 *
 */

  public void setHistoricalContribution(HistoricalContributionObjectKeyData HCgetInIn) {
    HCgetIn = HCgetInIn;
  }

  public void translateFromMap() {
    HCgetIn = HistoricalContributionObjectKeyHelper.fromMap(inputMap, "HistoricalContribution");
  }

/**
 *
 * Gets the HistoricalContribution
 * @return Value of the HistoricalContribution
 *
 */

  public HistoricalContributionObjectKeyData getHistoricalContribution( ) {
    return HCgetIn;
  }

}
