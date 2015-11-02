/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsVendorUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectData noOpInIn) {
    super(id, context, "InvsVendorUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
/**
 *
 * Sets the  InvsVendor
 * @param noOpInIn InvsVendorObjectData to set
 *
 */
  public void setInvsVendor(InvsVendorObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendor passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorObjectData getInvsVendor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorObjectHelper.fromMap(inputMap, "InvsVendor");
  }
}
