/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SalesChannelFindBulkUdtTemplateItem.java
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
 * Class used to create a SalesChannelFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SalesChannelFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SalesChannelObjectFilter SCFindIn;
/**
 *
 * Constructor to create a  SalesChannelFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SalesChannelFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SalesChannelObjectFilter SCFindInIn) {
    super(id, context, "SalesChannelFind");
    SCFindIn = SCFindInIn;
  }

  public void translateToMap() {
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(SCFindIn, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }


/**
 *
 * Sets the SalesChannel
 * @param SCFindInIn Value of the SCFindIn
 *
 */

  public void setSalesChannel(SalesChannelObjectFilter SCFindInIn) {
    SCFindIn = SCFindInIn;
  }

  public void translateFromMap() {
    SCFindIn = SalesChannelObjectHelper.fromMapFilter(inputMap, "SalesChannel");
  }

/**
 *
 * Gets the SalesChannel
 * @return Value of the SalesChannel
 *
 */

  public SalesChannelObjectFilter getSalesChannel( ) {
    return SCFindIn;
  }

}
