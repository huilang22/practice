/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueSuspendBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BsdQueueSuspendBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueSuspendBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueSuspendIn;
/**
 *
 * Constructor to create a  BsdQueueSuspendBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueSuspendBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueSuspendInIn) {
    super(id, context, "BsdQueueSuspend");
    BsdQueueSuspendIn = BsdQueueSuspendInIn;
  }

  public void translateToMap() {
    if (BsdQueueSuspendIn != null) {
      BsdQueueSuspendIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueSuspendIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueSuspendInIn Value of the BsdQueueSuspendIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueSuspendInIn) {
    BsdQueueSuspendIn = BsdQueueSuspendInIn;
  }

  public void translateFromMap() {
    BsdQueueSuspendIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueSuspendIn;
  }

}
