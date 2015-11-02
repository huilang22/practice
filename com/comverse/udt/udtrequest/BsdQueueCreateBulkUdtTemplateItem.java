/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueCreateIn;
/**
 *
 * Constructor to create a  BsdQueueCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueCreateInIn) {
    super(id, context, "BsdQueueCreate");
    BsdQueueCreateIn = BsdQueueCreateInIn;
  }

  public void translateToMap() {
    if (BsdQueueCreateIn != null) {
      BsdQueueCreateIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueCreateIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueCreateInIn Value of the BsdQueueCreateIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueCreateInIn) {
    BsdQueueCreateIn = BsdQueueCreateInIn;
  }

  public void translateFromMap() {
    BsdQueueCreateIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueCreateIn;
  }

}
