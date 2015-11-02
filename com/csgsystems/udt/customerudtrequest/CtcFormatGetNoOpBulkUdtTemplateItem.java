/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcFormatGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFormatGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcFormatGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFormatGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectData noOpInIn) {
    super(id, context, "CtcFormatGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
/**
 *
 * Sets the  CtcFormat
 * @param noOpInIn CtcFormatObjectData to set
 *
 */
  public void setCtcFormat(CtcFormatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatObjectData getCtcFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFormatObjectHelper.fromMap(inputMap, "CtcFormat");
  }
}
