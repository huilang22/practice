/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalThresholdsDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectFilter HTDeleteLIn;
  protected Date InactiveDate;
/**
 *
 * Constructor to create a  HistoricalThresholdsDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectFilter HTDeleteLInIn, Date InactiveDateIn) {
    super(id, context, "HistoricalThresholdsDeleteList");
    HTDeleteLIn = HTDeleteLInIn;
    InactiveDate = InactiveDateIn;
  }

  public void translateToMap() {
    if (HTDeleteLIn != null) {
      Integer index =  HTDeleteLIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(HTDeleteLIn, new HashMap(), "Void").get("Void"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTDeleteLInIn Value of the HTDeleteLIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectFilter HTDeleteLInIn) {
    HTDeleteLIn = HTDeleteLInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param InactiveDateIn Value of the InactiveDate
 *
 */

  public void setInactiveDate(Date InactiveDateIn) {
    InactiveDate = InactiveDateIn;
  }

  public void translateFromMap() {
    HTDeleteLIn = HistoricalThresholdsObjectHelper.fromMapFilter(inputMap, "HistoricalThresholds");
    InactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectFilter getHistoricalThresholds( ) {
    return HTDeleteLIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return InactiveDate;
  }

}
