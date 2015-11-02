/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueDeleteInternalBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueDeleteInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueDeleteInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectKeyData BsdQueueDeleteInternalIn;
/**
 *
 * Constructor to create a  BsdQueueDeleteInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueDeleteInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectKeyData BsdQueueDeleteInternalInIn) {
    super(id, context, "BsdQueueDeleteInternal");
    BsdQueueDeleteInternalIn = BsdQueueDeleteInternalInIn;
  }

  public void translateToMap() {
    if (BsdQueueDeleteInternalIn != null) {
      BsdQueueDeleteInternalIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(BsdQueueDeleteInternalIn, new HashMap(), "BsdQueueObjectKeyData").get("BsdQueueObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueDeleteInternalInIn Value of the BsdQueueDeleteInternalIn
 *
 */

  public void setBsdQueue(BsdQueueObjectKeyData BsdQueueDeleteInternalInIn) {
    BsdQueueDeleteInternalIn = BsdQueueDeleteInternalInIn;
  }

  public void translateFromMap() {
    BsdQueueDeleteInternalIn = BsdQueueObjectKeyHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectKeyData getBsdQueue( ) {
    return BsdQueueDeleteInternalIn;
  }

}
