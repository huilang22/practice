/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelUpdateBulkUdtTemplateItem.java
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
 * Class used to create a SalesChannelUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class SalesChannelUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SalesChannelObjectData SCUpdateIn;
/**
 *
 * Constructor to create a  SalesChannelUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SalesChannelUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectData SCUpdateInIn) {
    super(id, context, "SalesChannelUpdate");
    SCUpdateIn = SCUpdateInIn;
  }

  public void translateToMap() {
    if (SCUpdateIn != null) {
      SCUpdateIn.resetFlags(true, true);
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCUpdateIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }


/**
 *
 * Sets the SalesChannel
 * @param SCUpdateInIn Value of the SCUpdateIn
 *
 */

  public void setSalesChannel(SalesChannelObjectData SCUpdateInIn) {
    SCUpdateIn = SCUpdateInIn;
  }

  public void translateFromMap() {
    SCUpdateIn = SalesChannelObjectHelper.fromMap(inputMap, "SalesChannel");
  }

/**
 *
 * Gets the SalesChannel
 * @return Value of the SalesChannel
 *
 */

  public SalesChannelObjectData getSalesChannel( ) {
    return SCUpdateIn;
  }

}
