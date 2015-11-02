/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CtcScheduleDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcScheduleObjectKeyData DeleteIn;
/**
 *
 * Constructor to create a  CtcScheduleDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectKeyData DeleteInIn) {
    super(id, context, "CtcScheduleDelete");
    DeleteIn = DeleteInIn;
  }

  public void translateToMap() {
    if (DeleteIn != null) {
      DeleteIn.resetFlags(true, true);
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcScheduleObjectKeyData").get("CtcScheduleObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcSchedule
 * @param DeleteInIn Value of the DeleteIn
 *
 */

  public void setCtcSchedule(CtcScheduleObjectKeyData DeleteInIn) {
    DeleteIn = DeleteInIn;
  }

  public void translateFromMap() {
    DeleteIn = CtcScheduleObjectKeyHelper.fromMap(inputMap, "CtcSchedule");
  }

/**
 *
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectKeyData getCtcSchedule( ) {
    return DeleteIn;
  }

}
