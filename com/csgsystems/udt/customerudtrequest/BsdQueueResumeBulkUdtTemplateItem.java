/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueResumeBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueResumeBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueResumeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueObjectData BsdQueueResumeIn;
/**
 *
 * Constructor to create a  BsdQueueResumeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueResumeBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueObjectData BsdQueueResumeInIn) {
    super(id, context, "BsdQueueResume");
    BsdQueueResumeIn = BsdQueueResumeInIn;
  }

  public void translateToMap() {
    if (BsdQueueResumeIn != null) {
      BsdQueueResumeIn.resetFlags(true, true);
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(BsdQueueResumeIn, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }


/**
 *
 * Sets the BsdQueue
 * @param BsdQueueResumeInIn Value of the BsdQueueResumeIn
 *
 */

  public void setBsdQueue(BsdQueueObjectData BsdQueueResumeInIn) {
    BsdQueueResumeIn = BsdQueueResumeInIn;
  }

  public void translateFromMap() {
    BsdQueueResumeIn = BsdQueueObjectHelper.fromMap(inputMap, "BsdQueue");
  }

/**
 *
 * Gets the BsdQueue
 * @return Value of the BsdQueue
 *
 */

  public BsdQueueObjectData getBsdQueue( ) {
    return BsdQueueResumeIn;
  }

}
