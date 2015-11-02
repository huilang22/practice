/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleGetBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcScheduleGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcScheduleObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcScheduleGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectKeyData GetInIn) {
    super(id, context, "CtcScheduleGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcScheduleObjectKeyData").get("CtcScheduleObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcSchedule
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcSchedule(CtcScheduleObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcScheduleObjectKeyHelper.fromMap(inputMap, "CtcSchedule");
  }

/**
 *
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectKeyData getCtcSchedule( ) {
    return GetIn;
  }

}
