/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtcScheduleCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcScheduleCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcScheduleObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcScheduleCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcScheduleCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcScheduleObjectData CreateInIn) {
    super(id, context, "CtcScheduleCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(CreateIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }


/**
 *
 * Sets the CtcSchedule
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcSchedule(CtcScheduleObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcScheduleObjectHelper.fromMap(inputMap, "CtcSchedule");
  }

/**
 *
 * Gets the CtcSchedule
 * @return Value of the CtcSchedule
 *
 */

  public CtcScheduleObjectData getCtcSchedule( ) {
    return CreateIn;
  }

}
