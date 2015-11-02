/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSalesChannelUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSalesChannelUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSalesChannelObjectData InvsSalesChannelUpdateIn;
/**
 *
 * Constructor to create a  InvsSalesChannelUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSalesChannelUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectData InvsSalesChannelUpdateInIn) {
    super(id, context, "InvsSalesChannelUpdate");
    InvsSalesChannelUpdateIn = InvsSalesChannelUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSalesChannelUpdateIn != null) {
      InvsSalesChannelUpdateIn.resetFlags(true, true);
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelUpdateIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSalesChannel
 * @param InvsSalesChannelUpdateInIn Value of the InvsSalesChannelUpdateIn
 *
 */

  public void setInvsSalesChannel(InvsSalesChannelObjectData InvsSalesChannelUpdateInIn) {
    InvsSalesChannelUpdateIn = InvsSalesChannelUpdateInIn;
  }

  public void translateFromMap() {
    InvsSalesChannelUpdateIn = InvsSalesChannelObjectHelper.fromMap(inputMap, "InvsSalesChannel");
  }

/**
 *
 * Gets the InvsSalesChannel
 * @return Value of the InvsSalesChannel
 *
 */

  public InvsSalesChannelObjectData getInvsSalesChannel( ) {
    return InvsSalesChannelUpdateIn;
  }

}
