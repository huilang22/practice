/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcScheduleUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcScheduleObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcScheduleUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectData UpdateInIn) {
    super(id, context, "CtcScheduleUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(UpdateIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }


/**
 *
 * Sets the CtcSchedule
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcSchedule(CtcScheduleObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcScheduleObjectHelper.fromMap(inputMap, "CtcSchedule");
  }

/**
 *
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectData getCtcSchedule( ) {
    return UpdateIn;
  }

}
