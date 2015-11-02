/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemExtendedDataCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemExtendedDataCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemExtendedDataCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemExtendedDataObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemExtendedDataCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemExtendedDataCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectData noOpInIn) {
    super(id, context, "CtcItemExtendedDataCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
/**
 *
 * Sets the  CtcItemExtendedData
 * @param noOpInIn CtcItemExtendedDataObjectData to set
 *
 */
  public void setCtcItemExtendedData(CtcItemExtendedDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemExtendedDataObjectData getCtcItemExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemExtendedDataObjectHelper.fromMap(inputMap, "CtcItemExtendedData");
  }
}
