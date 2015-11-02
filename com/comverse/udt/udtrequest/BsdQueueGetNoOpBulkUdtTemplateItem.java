/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdQueueGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdQueueGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdQueueObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdQueueGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdQueueGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData noOpInIn) {
    super(id, context, "BsdQueueGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(noOpIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
/**
 *
 * Sets the  BsdQueue
 * @param noOpInIn BsdQueueObjectData to set
 *
 */
  public void setBsdQueue(BsdQueueObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdQueue passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueObjectData getBsdQueue() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }
}
