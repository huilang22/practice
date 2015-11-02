/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueFindInternalBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueFindInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueFindInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectFilter BsdQueueFindInternalIn;
/**
 *
 * Constructor to create a  BsdQueueFindInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueFindInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectFilter BsdQueueFindInternalInIn) {
    super(id, context, "BsdQueueFindInternal");
    BsdQueueFindInternalIn = BsdQueueFindInternalInIn;
  }

  public void translateToMap() {
    if (BsdQueueFindInternalIn != null) {
      Integer index =  BsdQueueFindInternalIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueFindInternalIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueFindInternalInIn Value of the BsdQueueFindInternalIn
 *
 */

  public void setBsdQueue(BsdQueueObjectFilter BsdQueueFindInternalInIn) {
    BsdQueueFindInternalIn = BsdQueueFindInternalInIn;
  }

  public void translateFromMap() {
    BsdQueueFindInternalIn = BsdQueueObjectHelper.fromMapFilter(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectFilter getBsdQueue( ) {
    return BsdQueueFindInternalIn;
  }

}
