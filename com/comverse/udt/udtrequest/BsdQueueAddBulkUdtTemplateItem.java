/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAddBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAddBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAddBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueAddIn;
/**
 *
 * Constructor to create a  BsdQueueAddBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAddBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueAddInIn) {
    super(id, context, "BsdQueueAdd");
    BsdQueueAddIn = BsdQueueAddInIn;
  }

  public void translateToMap() {
    if (BsdQueueAddIn != null) {
      BsdQueueAddIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueAddIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueAddInIn Value of the BsdQueueAddIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueAddInIn) {
    BsdQueueAddIn = BsdQueueAddInIn;
  }

  public void translateFromMap() {
    BsdQueueAddIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueAddIn;
  }

}
