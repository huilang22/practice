/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueRetryBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueRetryBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueRetryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueRetryIn;
/**
 *
 * Constructor to create a  BsdQueueRetryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueRetryBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueRetryInIn) {
    super(id, context, "BsdQueueRetry");
    BsdQueueRetryIn = BsdQueueRetryInIn;
  }

  public void translateToMap() {
    if (BsdQueueRetryIn != null) {
      BsdQueueRetryIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueRetryIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueRetryInIn Value of the BsdQueueRetryIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueRetryInIn) {
    BsdQueueRetryIn = BsdQueueRetryInIn;
  }

  public void translateFromMap() {
    BsdQueueRetryIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueRetryIn;
  }

}
