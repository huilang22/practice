/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGeoAreaScheduleGetBulkUdtTemplateItem.java
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
 * Class used to create a CtcGeoAreaScheduleGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGeoAreaScheduleGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGeoAreaScheduleObjectKeyData GetIn;
/**
 *
 * Constructor to create a  CtcGeoAreaScheduleGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGeoAreaScheduleGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGeoAreaScheduleObjectKeyData GetInIn) {
    super(id, context, "CtcGeoAreaScheduleGet");
    GetIn = GetInIn;
  }

  public void translateToMap() {
    if (GetIn != null) {
      GetIn.resetFlags(true, true);
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcGeoAreaScheduleObjectKeyData").get("CtcGeoAreaScheduleObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtcGeoAreaSchedule
 * @param GetInIn Value of the GetIn
 *
 */

  public void setCtcGeoAreaSchedule(CtcGeoAreaScheduleObjectKeyData GetInIn) {
    GetIn = GetInIn;
  }

  public void translateFromMap() {
    GetIn = CtcGeoAreaScheduleObjectKeyHelper.fromMap(inputMap, "CtcGeoAreaSchedule");
  }

/**
 *
 * Gets the CtcGeoAreaSchedule
 * @return Value of the CtcGeoAreaSchedule
 *
 */

  public CtcGeoAreaScheduleObjectKeyData getCtcGeoAreaSchedule( ) {
    return GetIn;
  }

}
