/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelGetBulkUdtTemplateItem.java
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
 * Class used to create a SalesChannelGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SalesChannelGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SalesChannelObjectKeyData SCGetIn;
/**
 *
 * Constructor to create a  SalesChannelGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SalesChannelGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectKeyData SCGetInIn) {
    super(id, context, "SalesChannelGet");
    SCGetIn = SCGetInIn;
  }

  public void translateToMap() {
    if (SCGetIn != null) {
      SCGetIn.resetFlags(true, true);
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(SCGetIn, new HashMap(), "SalesChannelObjectKeyData").get("SalesChannelObjectKeyData"));
    }
  }


/**
 *
 * Sets the SalesChannel
 * @param SCGetInIn Value of the SCGetIn
 *
 */

  public void setSalesChannel(SalesChannelObjectKeyData SCGetInIn) {
    SCGetIn = SCGetInIn;
  }

  public void translateFromMap() {
    SCGetIn = SalesChannelObjectKeyHelper.fromMap(inputMap, "SalesChannel");
  }

/**
 *
 * Gets the SalesChannel
 * @return Value of the SalesChannel
 *
 */

  public SalesChannelObjectKeyData getSalesChannel( ) {
    return SCGetIn;
  }

}
