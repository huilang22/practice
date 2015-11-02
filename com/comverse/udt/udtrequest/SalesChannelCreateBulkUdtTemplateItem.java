/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelCreateBulkUdtTemplateItem.java
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
 * Class used to create a SalesChannelCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SalesChannelCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SalesChannelObjectData SCCreateIn;
/**
 *
 * Constructor to create a  SalesChannelCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SalesChannelCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectData SCCreateInIn) {
    super(id, context, "SalesChannelCreate");
    SCCreateIn = SCCreateInIn;
  }

  public void translateToMap() {
    if (SCCreateIn != null) {
      SCCreateIn.resetFlags(true, true);
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCCreateIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }


/**
 *
 * Sets the SalesChannel
 * @param SCCreateInIn Value of the SCCreateIn
 *
 */

  public void setSalesChannel(SalesChannelObjectData SCCreateInIn) {
    SCCreateIn = SCCreateInIn;
  }

  public void translateFromMap() {
    SCCreateIn = SalesChannelObjectHelper.fromMap(inputMap, "SalesChannel");
  }

/**
 *
 * Gets the SalesChannel
 * @return Value of the SalesChannel
 *
 */

  public SalesChannelObjectData getSalesChannel( ) {
    return SCCreateIn;
  }

}
