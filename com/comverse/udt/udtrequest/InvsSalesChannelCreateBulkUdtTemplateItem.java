/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSalesChannelCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSalesChannelCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSalesChannelCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSalesChannelObjectData InvsSalesChannelCreateIn;
/**
 *
 * Constructor to create a  InvsSalesChannelCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSalesChannelCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSalesChannelObjectData InvsSalesChannelCreateInIn) {
    super(id, context, "InvsSalesChannelCreate");
    InvsSalesChannelCreateIn = InvsSalesChannelCreateInIn;
  }

  public void translateToMap() {
    if (InvsSalesChannelCreateIn != null) {
      InvsSalesChannelCreateIn.resetFlags(true, true);
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(InvsSalesChannelCreateIn, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }


/**
 *
 * Sets the InvsSalesChannel
 * @param InvsSalesChannelCreateInIn Value of the InvsSalesChannelCreateIn
 *
 */

  public void setInvsSalesChannel(InvsSalesChannelObjectData InvsSalesChannelCreateInIn) {
    InvsSalesChannelCreateIn = InvsSalesChannelCreateInIn;
  }

  public void translateFromMap() {
    InvsSalesChannelCreateIn = InvsSalesChannelObjectHelper.fromMap(inputMap, "InvsSalesChannel");
  }

/**
 *
 * Gets the InvsSalesChannel
 * @return Value of the InvsSalesChannel
 *
 */

  public InvsSalesChannelObjectData getInvsSalesChannel( ) {
    return InvsSalesChannelCreateIn;
  }

}
