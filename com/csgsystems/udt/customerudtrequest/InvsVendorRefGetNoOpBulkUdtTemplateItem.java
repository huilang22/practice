/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsVendorRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectData noOpInIn) {
    super(id, context, "InvsVendorRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
/**
 *
 * Sets the  InvsVendorRef
 * @param noOpInIn InvsVendorRefObjectData to set
 *
 */
  public void setInvsVendorRef(InvsVendorRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendorRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorRefObjectData getInvsVendorRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorRefObjectHelper.fromMap(inputMap, "InvsVendorRef");
  }
}
