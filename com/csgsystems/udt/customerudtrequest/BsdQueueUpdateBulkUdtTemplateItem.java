/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueUpdateBulkUdtTemplateItem.java
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
