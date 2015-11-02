/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcItemDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemObjectData noOpInIn) {
    super(id, context, "CtcItemDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcItem", CtcItemObjectHelper.toMap(noOpIn, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
/**
 *
 * Sets the  CtcItem
 * @param noOpInIn CtcItemObjectData to set
 *
 */
  public void setCtcItem(CtcItemObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItem passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemObjectData getCtcItem() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemObjectHelper.fromMap(inputMap, "CtcItem");
  }
}
