/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcGeoAreaScheduleDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGeoAreaScheduleDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGeoAreaScheduleObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGeoAreaScheduleDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectKeyData DeleteInIn) {
    super(id, context, "CtcGeoAreaScheduleDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcGeoAreaScheduleObjectKeyData").get("CtcGeoAreaScheduleObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcGeoAreaSchedule
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcGeoAreaScheduleObjectKeyHelper.fromMap(inputMap, "CtcGeoAreaSchedule");
  }

/**
 *
 * Gets the CtcGeoAreaSchedule
 * @return Value of the CtcGeoAreaSchedule
 *
 */

  public CtcGeoAreaScheduleObjectKeyData getCtcGeoAreaSchedule( ) {
    return DeleteIn;
  }

}
