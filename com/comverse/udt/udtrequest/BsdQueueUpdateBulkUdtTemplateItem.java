/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueUpdateIn;
/**
 *
 * Constructor to create a  BsdQueueUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueUpdateInIn) {
    super(id, context, "BsdQueueUpdate");
    BsdQueueUpdateIn = BsdQueueUpdateInIn;
  }

  public void translateToMap() {
    if (BsdQueueUpdateIn != null) {
      BsdQueueUpdateIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueUpdateIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueUpdateInIn Value of the BsdQueueUpdateIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueUpdateInIn) {
    BsdQueueUpdateIn = BsdQueueUpdateInIn;
  }

  public void translateFromMap() {
    BsdQueueUpdateIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueUpdateIn;
  }

}
