/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsStockPropertyGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsStockPropertyGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsStockPropertyObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsStockPropertyGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsStockPropertyGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStockPropertyObjectData noOpInIn) {
    super(id, context, "InvsStockPropertyGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(noOpIn, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
/**
 *
 * Sets the  InvsStockProperty
 * @param noOpInIn InvsStockPropertyObjectData to set
 *
 */
  public void setInvsStockProperty(InvsStockPropertyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsStockProperty passed into the constructor
 * @return Simulated response
 *
 */
  public InvsStockPropertyObjectData getInvsStockProperty() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsStockPropertyObjectHelper.fromMap(inputMap, "InvsStockProperty");
  }
}
