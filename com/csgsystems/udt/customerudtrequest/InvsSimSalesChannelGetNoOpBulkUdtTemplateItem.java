/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimSalesChannelGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimSalesChannelGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimSalesChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimSalesChannelGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimSalesChannelGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectData noOpInIn) {
    super(id, context, "InvsSimSalesChannelGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
/**
 *
 * Sets the  InvsSimSalesChannel
 * @param noOpInIn InvsSimSalesChannelObjectData to set
 *
 */
  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSimSalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSimSalesChannelObjectData getInvsSimSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSimSalesChannelObjectHelper.fromMap(inputMap, "InvsSimSalesChannel");
  }
}
