/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxFindBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionTaxFindBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionTaxFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionTaxObjectFilter HCTFindIn;
/**
 *
 * Constructor to create a  HistoricalContributionTaxFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionTaxFindBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectFilter HCTFindInIn) {
    super(id, context, "HistoricalContributionTaxFind");
    HCTFindIn = HCTFindInIn;
  }

  public void translateToMap() {
    if (HCTFindIn != null) {
      Integer index =  HCTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(HCTFindIn, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }


/**
 *
 * Sets the HistoricalContributionTax
 * @param HCTFindInIn Value of the HCTFindIn
 *
 */

  public void setHistoricalContributionTax(HistoricalContributionTaxObjectFilter HCTFindInIn) {
    HCTFindIn = HCTFindInIn;
  }

  public void translateFromMap() {
    HCTFindIn = HistoricalContributionTaxObjectHelper.fromMapFilter(inputMap, "HistoricalContributionTax");
  }

/**
 *
 * Gets the HistoricalContributionTax
 * @return Value of the HistoricalContributionTax
 *
 */

  public HistoricalContributionTaxObjectFilter getHistoricalContributionTax( ) {
    return HCTFindIn;
  }

}
