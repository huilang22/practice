/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestWorkSubmitBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchRequestWorkSubmitBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestWorkSubmitBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Date scheduled_date;
/**
 *
 * Constructor to create a  BatchRequestWorkSubmitBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestWorkSubmitBulkUdtTemplateItem(String id, BSDMSessionContext context, Date scheduled_dateIn) {
    super(id, context, "BatchRequestWorkSubmit");
    scheduled_date = scheduled_dateIn;
  }

  public void translateToMap() {
    if (scheduled_date != null) {
      addInput("ScheduledDate", scheduled_date);
    }
  }


/**
 *
 * Sets the ScheduledDate
 * @param scheduled_dateIn Value of the scheduled_date
 *
 */

  public void setScheduledDate(Date scheduled_dateIn) {
    scheduled_date = scheduled_dateIn;
  }

  public void translateFromMap() {
    scheduled_date = (Date)inputMap.get("ScheduledDate");
  }

/**
 *
 * Gets the ScheduledDate
 * @return Value of the ScheduledDate
 *
 */

  public Date getScheduledDate( ) {
    return scheduled_date;
  }

}
