/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelObjectKeyData InvsSimSalesChannelGetIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelObjectKeyData InvsSimSalesChannelGetInIn) {
    super(id, context, "InvsSimSalesChannelGet");
    InvsSimSalesChannelGetIn = InvsSimSalesChannelGetInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelGetIn != null) {
      InvsSimSalesChannelGetIn.resetFlags(true, true);
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectKeyHelper.toMap(InvsSimSalesChannelGetIn, new HashMap(), "InvsSimSalesChannelObjectKeyData").get("InvsSimSalesChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannel
 * @param InvsSimSalesChannelGetInIn Value of the InvsSimSalesChannelGetIn
 *
 */

  public void setInvsSimSalesChannel(InvsSimSalesChannelObjectKeyData InvsSimSalesChannelGetInIn) {
    InvsSimSalesChannelGetIn = InvsSimSalesChannelGetInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelGetIn = InvsSimSalesChannelObjectKeyHelper.fromMap(inputMap, "InvsSimSalesChannel");
  }

/**
 *
 * Gets the InvsSimSalesChannel
 * @return Value of the InvsSimSalesChannel
 *
 */

  public InvsSimSalesChannelObjectKeyData getInvsSimSalesChannel( ) {
    return InvsSimSalesChannelGetIn;
  }

}
