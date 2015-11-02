/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelObjectData InvsSimSalesChannelCreateIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectData InvsSimSalesChannelCreateInIn) {
    super(id, context, "InvsSimSalesChannelCreate");
    InvsSimSalesChannelCreateIn = InvsSimSalesChannelCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelCreateIn != null) {
      InvsSimSalesChannelCreateIn.resetFlags(true, true);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelCreateIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannel
 * @param InvsSimSalesChannelCreateInIn Value of the InvsSimSalesChannelCreateIn
 *
 */

  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectData InvsSimSalesChannelCreateInIn) {
    InvsSimSalesChannelCreateIn = InvsSimSalesChannelCreateInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelCreateIn = InvsSimSalesChannelObjectHelper.fromMap(inputMap, "InvsSimSalesChannel");
  }

/**
 *
 * Gets the InvsSimSalesChannel
 * @return Value of the InvsSimSalesChannel
 *
 */

  public InvsSimSalesChannelObjectData getInvsSimSalesChannel( ) {
    return InvsSimSalesChannelCreateIn;
  }

}
