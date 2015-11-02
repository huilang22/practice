/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionTaxUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionTaxUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionTaxUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionTaxObjectData HCTUpdateIn;
/**
 *
 * Constructor to create a  HistoricalContributionTaxUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionTaxUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectData HCTUpdateInIn) {
    super(id, context, "HistoricalContributionTaxUpdate");
    HCTUpdateIn = HCTUpdateInIn;
  }

  public void translateToMap() {
    if (HCTUpdateIn != null) {
      HCTUpdateIn.resetFlags(true, true);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTUpdateIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }


/**
 *
 * Sets the HistoricalContributionTax
 * @param HCTUpdateInIn Value of the HCTUpdateIn
 *
 */

  public void setHistoricalContributionTax(HistoricalContributionTaxObjectData HCTUpdateInIn) {
    HCTUpdateIn = HCTUpdateInIn;
  }

  public void translateFromMap() {
    HCTUpdateIn = HistoricalContributionTaxObjectHelper.fromMap(inputMap, "HistoricalContributionTax");
  }

/**
 *
 * Gets the HistoricalContributionTax
 * @return Value of the HistoricalContributionTax
 *
 */

  public HistoricalContributionTaxObjectData getHistoricalContributionTax( ) {
    return HCTUpdateIn;
  }

}
