/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSalesChannelFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSalesChannelFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSalesChannelObjectFilter InvsSalesChannelFindIn;
/**
 *
 * Constructor to create a  InvsSalesChannelFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSalesChannelFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectFilter InvsSalesChannelFindInIn) {
    super(id, context, "InvsSalesChannelFind");
    InvsSalesChannelFindIn = InvsSalesChannelFindInIn;
  }

  public void translateToMap() {
    if (InvsSalesChannelFindIn != null) {
      Integer index =  InvsSalesChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelFindIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSalesChannel
 * @param InvsSalesChannelFindInIn Value of the InvsSalesChannelFindIn
 *
 */

  public void setInvsSalesChannel(InvsSalesChannelObjectFilter InvsSalesChannelFindInIn) {
    InvsSalesChannelFindIn = InvsSalesChannelFindInIn;
  }

  public void translateFromMap() {
    InvsSalesChannelFindIn = InvsSalesChannelObjectHelper.fromMapFilter(inputMap, "InvsSalesChannel");
  }

/**
 *
 * Gets the InvsSalesChannel
 * @return Value of the InvsSalesChannel
 *
 */

  public InvsSalesChannelObjectFilter getInvsSalesChannel( ) {
    return InvsSalesChannelFindIn;
  }

}
