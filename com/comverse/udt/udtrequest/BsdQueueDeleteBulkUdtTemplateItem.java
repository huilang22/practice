/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueDeleteIn;
/**
 *
 * Constructor to create a  BsdQueueDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueDeleteInIn) {
    super(id, context, "BsdQueueDelete");
    BsdQueueDeleteIn = BsdQueueDeleteInIn;
  }

  public void translateToMap() {
    if (BsdQueueDeleteIn != null) {
      BsdQueueDeleteIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueDeleteIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueDeleteInIn Value of the BsdQueueDeleteIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueDeleteInIn) {
    BsdQueueDeleteIn = BsdQueueDeleteInIn;
  }

  public void translateFromMap() {
    BsdQueueDeleteIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueDeleteIn;
  }

}
