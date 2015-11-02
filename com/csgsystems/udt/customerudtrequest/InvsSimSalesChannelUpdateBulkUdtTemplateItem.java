/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelObjectData InvsSimSalesChannelUpdateIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectData InvsSimSalesChannelUpdateInIn) {
    super(id, context, "InvsSimSalesChannelUpdate");
    InvsSimSalesChannelUpdateIn = InvsSimSalesChannelUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelUpdateIn != null) {
      InvsSimSalesChannelUpdateIn.resetFlags(true, true);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelUpdateIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannel
 * @param InvsSimSalesChannelUpdateInIn Value of the InvsSimSalesChannelUpdateIn
 *
 */

  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectData InvsSimSalesChannelUpdateInIn) {
    InvsSimSalesChannelUpdateIn = InvsSimSalesChannelUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelUpdateIn = InvsSimSalesChannelObjectHelper.fromMap(inputMap, "InvsSimSalesChannel");
  }

/**
 *
 * Gets the InvsSimSalesChannel
 * @return Value of the InvsSimSalesChannel
 *
 */

  public InvsSimSalesChannelObjectData getInvsSimSalesChannel( ) {
    return InvsSimSalesChannelUpdateIn;
  }

}
