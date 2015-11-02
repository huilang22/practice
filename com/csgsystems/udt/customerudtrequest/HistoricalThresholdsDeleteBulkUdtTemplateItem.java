/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a HistoricalThresholdsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class HistoricalThresholdsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HistoricalThresholdsObjectKeyData HTDeleteIn;
  protected Date inactive_date;
/**
 *
 * Constructor to create a  HistoricalThresholdsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HistoricalThresholdsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, HistoricalThresholdsObjectKeyData HTDeleteInIn, Date inactive_dateIn) {
    super(id, context, "HistoricalThresholdsDelete");
    HTDeleteIn = HTDeleteInIn;
    inactive_date = inactive_dateIn;
  }

  public void translateToMap() {
    if (HTDeleteIn != null) {
      HTDeleteIn.resetFlags(true, true);
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(HTDeleteIn, new HashMap(), "HistoricalThresholdsObjectKeyData").get("HistoricalThresholdsObjectKeyData"));
    }
    if (inactive_date != null) {
      addInput("InactiveDate", inactive_date);
    }
  }


/**
 *
 * Sets the HistoricalThresholds
 * @param HTDeleteInIn Value of the HTDeleteIn
 *
 */

  public void setHistoricalThresholds(HistoricalThresholdsObjectKeyData HTDeleteInIn) {
    HTDeleteIn = HTDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param inactive_dateIn Value of the inactive_date
 *
 */

  public void setInactiveDate(Date inactive_dateIn) {
    inactive_date = inactive_dateIn;
  }

  public void translateFromMap() {
    HTDeleteIn = HistoricalThresholdsObjectKeyHelper.fromMap(inputMap, "HistoricalThresholds");
    inactive_date = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the HistoricalThresholds
 * @return Value of the HistoricalThresholds
 *
 */

  public HistoricalThresholdsObjectKeyData getHistoricalThresholds( ) {
    return HTDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return inactive_date;
  }

}
