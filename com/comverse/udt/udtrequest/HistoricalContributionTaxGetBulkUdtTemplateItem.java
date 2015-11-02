/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxGetBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionTaxGetBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionTaxGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionTaxObjectKeyData HCTGetIn;
/**
 *
 * Constructor to create a  HistoricalContributionTaxGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionTaxGetBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionTaxObjectKeyData HCTGetInIn) {
    super(id, context, "HistoricalContributionTaxGet");
    HCTGetIn = HCTGetInIn;
  }

  public void translateToMap() {
    if (HCTGetIn != null) {
      HCTGetIn.resetFlags(true, true);
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectKeyHelper.toMap(HCTGetIn, new HashMap(), "HistoricalContributionTaxObjectKeyData").get("HistoricalContributionTaxObjectKeyData"));
    }
  }


/**
 *
 * Sets the HistoricalContributionTax
 * @param HCTGetInIn Value of the HCTGetIn
 *
 */

  public void setHistoricalContributionTax(HistoricalContributionTaxObjectKeyData HCTGetInIn) {
    HCTGetIn = HCTGetInIn;
  }

  public void translateFromMap() {
    HCTGetIn = HistoricalContributionTaxObjectKeyHelper.fromMap(inputMap, "HistoricalContributionTax");
  }

/**
 *
 * Gets the HistoricalContributionTax
 * @return Value of the HistoricalContributionTax
 *
 */

  public HistoricalContributionTaxObjectKeyData getHistoricalContributionTax( ) {
    return HCTGetIn;
  }

}
