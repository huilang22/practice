/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalContributionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalContributionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalContributionObjectData HCupdateIn;
/**
 *
 * Constructor to create a  HistoricalContributionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalContributionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalContributionObjectData HCupdateInIn) {
    super(id, context, "HistoricalContributionUpdate");
    HCupdateIn = HCupdateInIn;
  }

  public void translateToMap() {
    if (HCupdateIn != null) {
      HCupdateIn.resetFlags(true, true);
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(HCupdateIn, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }


/**
 *
 * Sets the HistoricalContribution
 * @param HCupdateInIn Value of the HCupdateIn
 *
 */

  public void setHistoricalContribution(HistoricalContributionObjectData HCupdateInIn) {
    HCupdateIn = HCupdateInIn;
  }

  public void translateFromMap() {
    HCupdateIn = HistoricalContributionObjectHelper.fromMap(inputMap, "HistoricalContribution");
  }

/**
 *
 * Gets the HistoricalContribution
 * @return Value of the HistoricalContribution
 *
 */

  public HistoricalContributionObjectData getHistoricalContribution( ) {
    return HCupdateIn;
  }

}
