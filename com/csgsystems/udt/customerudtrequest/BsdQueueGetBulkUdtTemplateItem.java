/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectKeyData BsdQueueGetIn;
/**
 *
 * Constructor to create a  BsdQueueGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectKeyData BsdQueueGetInIn) {
    super(id, context, "BsdQueueGet");
    BsdQueueGetIn = BsdQueueGetInIn;
  }

  public void translateToMap() {
    if (BsdQueueGetIn != null) {
      BsdQueueGetIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(BsdQueueGetIn, new HashMap(), "BsdQueueObjectKeyData").get("BsdQueueObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueGetInIn Value of the BsdQueueGetIn
 *
 */

  public void setBsdQueue(BsdQueueObjectKeyData BsdQueueGetInIn) {
    BsdQueueGetIn = BsdQueueGetInIn;
  }

  public void translateFromMap() {
    BsdQueueGetIn = BsdQueueObjectKeyHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectKeyData getBsdQueue( ) {
    return BsdQueueGetIn;
  }

}
