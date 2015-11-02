/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionCreateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionObjectData HCcreateIn;
/**
 *
 * Constructor to create a  HistoricalContributionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectData HCcreateInIn) {
    super(id, context, "HistoricalContributionCreate");
    HCcreateIn = HCcreateInIn;
  }

  public void translateToMap() {
    if (HCcreateIn != null) {
      HCcreateIn.resetFlags(true, true);
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCcreateIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }


/**
 *
 * Sets the HistoricalContribution
 * @param HCcreateInIn Value of the HCcreateIn
 *
 */

  public void setHistoricalContribution(HistoricalContributionObjectData HCcreateInIn) {
    HCcreateIn = HCcreateInIn;
  }

  public void translateFromMap() {
    HCcreateIn = HistoricalContributionObjectHelper.fromMap(inputMap, "HistoricalContribution");
  }

/**
 *
 * Gets the HistoricalContribution
 * @return Value of the HistoricalContribution
 *
 */

  public HistoricalContributionObjectData getHistoricalContribution( ) {
    return HCcreateIn;
  }

}
