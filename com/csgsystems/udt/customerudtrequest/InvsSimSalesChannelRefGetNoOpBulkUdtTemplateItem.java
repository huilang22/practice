/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimSalesChannelRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimSalesChannelRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimSalesChannelRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectData noOpInIn) {
    super(id, context, "InvsSimSalesChannelRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
/**
 *
 * Sets the  InvsSimSalesChannelRef
 * @param noOpInIn InvsSimSalesChannelRefObjectData to set
 *
 */
  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimSalesChannelRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimSalesChannelRefObjectHelper.fromMap(inputMap, "InvsSimSalesChannelRef");
  }
}
