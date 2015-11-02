/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSalesChannelGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSalesChannelGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSalesChannelObjectKeyData InvsSalesChannelGetIn;
/**
 *
 * Constructor to create a  InvsSalesChannelGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSalesChannelGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectKeyData InvsSalesChannelGetInIn) {
    super(id, context, "InvsSalesChannelGet");
    InvsSalesChannelGetIn = InvsSalesChannelGetInIn;
  }

  public void translateToMap() {
    if (InvsSalesChannelGetIn != null) {
      InvsSalesChannelGetIn.resetFlags(true, true);
      addInput("InvsSalesChannel", InvsSalesChannelObjectKeyHelper.toMap(InvsSalesChannelGetIn, new HashMap(), "InvsSalesChannelObjectKeyData").get("InvsSalesChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSalesChannel
 * @param InvsSalesChannelGetInIn Value of the InvsSalesChannelGetIn
 *
 */

  public void setInvsSalesChannel(InvsSalesChannelObjectKeyData InvsSalesChannelGetInIn) {
    InvsSalesChannelGetIn = InvsSalesChannelGetInIn;
  }

  public void translateFromMap() {
    InvsSalesChannelGetIn = InvsSalesChannelObjectKeyHelper.fromMap(inputMap, "InvsSalesChannel");
  }

/**
 *
 * Gets the InvsSalesChannel
 * @return Value of the InvsSalesChannel
 *
 */

  public InvsSalesChannelObjectKeyData getInvsSalesChannel( ) {
    return InvsSalesChannelGetIn;
  }

}
