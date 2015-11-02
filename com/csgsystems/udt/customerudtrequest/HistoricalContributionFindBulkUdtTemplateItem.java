/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionFindBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionObjectFilter HCfindIn;
/**
 *
 * Constructor to create a  HistoricalContributionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectFilter HCfindInIn) {
    super(id, context, "HistoricalContributionFind");
    HCfindIn = HCfindInIn;
  }

  public void translateToMap() {
    if (HCfindIn != null) {
      Integer index =  HCfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCfindIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }


/**
 *
 * Sets the HistoricalContribution
 * @param HCfindInIn Value of the HCfindIn
 *
 */

  public void setHistoricalContribution(HistoricalContributionObjectFilter HCfindInIn) {
    HCfindIn = HCfindInIn;
  }

  public void translateFromMap() {
    HCfindIn = HistoricalContributionObjectHelper.fromMapFilter(inputMap, "HistoricalContribution");
  }

/**
 *
 * Gets the HistoricalContribution
 * @return Value of the HistoricalContribution
 *
 */

  public HistoricalContributionObjectFilter getHistoricalContribution( ) {
    return HCfindIn;
  }

}
