/*
 * Generated code DO NOT EDIT
 * Generated file: SalesChannelDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a SalesChannelDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class SalesChannelDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SalesChannelObjectKeyData SCDeleteIn;
/**
 *
 * Constructor to create a  SalesChannelDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SalesChannelDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectKeyData SCDeleteInIn) {
    super(id, context, "SalesChannelDelete");
    SCDeleteIn = SCDeleteInIn;
  }

  public void translateToMap() {
    if (SCDeleteIn != null) {
      SCDeleteIn.resetFlags(true, true);
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(SCDeleteIn, new HashMap(), "SalesChannelObjectKeyData").get("SalesChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the SalesChannel
 * @param SCDeleteInIn Value of the SCDeleteIn
 *
 */

  public void setSalesChannel(SalesChannelObjectKeyData SCDeleteInIn) {
    SCDeleteIn = SCDeleteInIn;
  }

  public void translateFromMap() {
    SCDeleteIn = SalesChannelObjectKeyHelper.fromMap(inputMap, "SalesChannel");
  }

/**
 *
 * Gets the SalesChannel
 * @return Value of the SalesChannel
 *
 */

  public SalesChannelObjectKeyData getSalesChannel( ) {
    return SCDeleteIn;
  }

}
