/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a InvsSalesChannelCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSalesChannelCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSalesChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSalesChannelCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSalesChannelCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectData noOpInIn) {
    super(id, context, "InvsSalesChannelCreate");
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
