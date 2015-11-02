/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueFindBulkUdtTemplateItem.java
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
import com.csgsystems.sfq.data.*;

/**
 *
 * Class used to create a BsdQueueFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectFilter BsdQueueFindIn;
/**
 *
 * Constructor to create a  BsdQueueFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectFilter BsdQueueFindInIn) {
    super(id, context, "BsdQueueFind");
    BsdQueueFindIn = BsdQueueFindInIn;
  }

  public void translateToMap() {
    if (BsdQueueFindIn != null) {
      Integer index =  BsdQueueFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueFindIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueFindInIn Value of the BsdQueueFindIn
 *
 */

  public void setBsdQueue(BsdQueueObjectFilter BsdQueueFindInIn) {
    BsdQueueFindIn = BsdQueueFindInIn;
  }

  public void translateFromMap() {
    BsdQueueFindIn = BsdQueueObjectHelper.fromMapFilter(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectFilter getBsdQueue( ) {
    return BsdQueueFindIn;
  }

}
