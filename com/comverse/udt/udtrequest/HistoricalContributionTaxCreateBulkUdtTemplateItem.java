/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxCreateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionTaxCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionTaxCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionTaxObjectData HCTCreateIn;
/**
 *
 * Constructor to create a  HistoricalContributionTaxCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionTaxCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectData HCTCreateInIn) {
    super(id, context, "HistoricalContributionTaxCreate");
    HCTCreateIn = HCTCreateInIn;
  }

  public void translateToMap() {
    if (HCTCreateIn != null) {
      HCTCreateIn.resetFlags(true, true);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTCreateIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }


/**
 *
 * Sets the HistoricalContributionTax
 * @param HCTCreateInIn Value of the HCTCreateIn
 *
 */

  public void setHistoricalContributionTax(HistoricalContributionTaxObjectData HCTCreateInIn) {
    HCTCreateIn = HCTCreateInIn;
  }

  public void translateFromMap() {
    HCTCreateIn = HistoricalContributionTaxObjectHelper.fromMap(inputMap, "HistoricalContributionTax");
  }

/**
 *
 * Gets the HistoricalContributionTax
 * @return Value of the HistoricalContributionTax
 *
 */

  public HistoricalContributionTaxObjectData getHistoricalContributionTax( ) {
    return HCTCreateIn;
  }

}
