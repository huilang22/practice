/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcFormatTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFormatTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFormatTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcFormatTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFormatTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatTypeObjectData noOpInIn) {
    super(id, context, "CtcFormatTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
/**
 *
 * Sets the  CtcFormatType
 * @param noOpInIn CtcFormatTypeObjectData to set
 *
 */
  public void setCtcFormatType(CtcFormatTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFormatType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatTypeObjectData getCtcFormatType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFormatTypeObjectHelper.fromMap(inputMap, "CtcFormatType");
  }
}
