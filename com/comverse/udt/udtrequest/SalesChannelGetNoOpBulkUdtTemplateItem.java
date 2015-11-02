/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SalesChannelGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SalesChannelGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SalesChannelObjectData noOpIn;

/**
 *
 * Constructor to create a   SalesChannelGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SalesChannelGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectData noOpInIn) {
    super(id, context, "SalesChannelGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(noOpIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
/**
 *
 * Sets the  SalesChannel
 * @param noOpInIn SalesChannelObjectData to set
 *
 */
  public void setSalesChannel(SalesChannelObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SalesChannel passed into the constructor
 * @return Simulated response
 *
 */
  public SalesChannelObjectData getSalesChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SalesChannelObjectHelper.fromMap(inputMap, "SalesChannel");
  }
}
