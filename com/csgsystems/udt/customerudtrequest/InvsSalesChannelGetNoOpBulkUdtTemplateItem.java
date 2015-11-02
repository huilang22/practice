/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSalesChannelGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSalesChannelGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSalesChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSalesChannelGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSalesChannelGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectData noOpInIn) {
    super(id, context, "InvsSalesChannelGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
/**
 *
 * Sets the  InvsSalesChannel
 * @param noOpInIn InvsSalesChannelObjectData to set
 *
 */
  public void setInvsSalesChannel(InvsSalesChannelObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSalesChannelObjectData getInvsSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSalesChannelObjectHelper.fromMap(inputMap, "InvsSalesChannel");
  }
}
