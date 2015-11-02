/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelObjectFilter InvsSimSalesChannelFindIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectFilter InvsSimSalesChannelFindInIn) {
    super(id, context, "InvsSimSalesChannelFind");
    InvsSimSalesChannelFindIn = InvsSimSalesChannelFindInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelFindIn != null) {
      Integer index =  InvsSimSalesChannelFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(InvsSimSalesChannelFindIn, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannel
 * @param InvsSimSalesChannelFindInIn Value of the InvsSimSalesChannelFindIn
 *
 */

  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectFilter InvsSimSalesChannelFindInIn) {
    InvsSimSalesChannelFindIn = InvsSimSalesChannelFindInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelFindIn = InvsSimSalesChannelObjectHelper.fromMapFilter(inputMap, "InvsSimSalesChannel");
  }

/**
 *
 * Gets the InvsSimSalesChannel
 * @return Value of the InvsSimSalesChannel
 *
 */

  public InvsSimSalesChannelObjectFilter getInvsSimSalesChannel( ) {
    return InvsSimSalesChannelFindIn;
  }

}
