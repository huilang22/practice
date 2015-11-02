/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSimSalesChannelRefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSimSalesChannelRefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSimSalesChannelRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSimSalesChannelRefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSimSalesChannelRefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectData noOpInIn) {
    super(id, context, "InvsSimSalesChannelRefCreate");
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
