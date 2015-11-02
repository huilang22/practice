/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSalesChannelUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSalesChannelUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSalesChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSalesChannelUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSalesChannelUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectData noOpInIn) {
    super(id, context, "InvsSalesChannelUpdate");
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
