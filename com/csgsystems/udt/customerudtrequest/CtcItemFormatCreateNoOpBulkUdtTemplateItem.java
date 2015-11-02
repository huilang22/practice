/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFormatCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemFormatCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemFormatCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemFormatCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemFormatCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectData noOpInIn) {
    super(id, context, "CtcItemFormatCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
/**
 *
 * Sets the  CtcItemFormat
 * @param noOpInIn CtcItemFormatObjectData to set
 *
 */
  public void setCtcItemFormat(CtcItemFormatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemFormatObjectData getCtcItemFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemFormatObjectHelper.fromMap(inputMap, "CtcItemFormat");
  }
}
