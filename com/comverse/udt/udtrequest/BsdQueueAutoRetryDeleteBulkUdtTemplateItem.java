/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAutoRetryDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAutoRetryDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueAutoRetryObjectData BsdQueueAutoRetryDeleteIn;
/**
 *
 * Constructor to create a  BsdQueueAutoRetryDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAutoRetryDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectData BsdQueueAutoRetryDeleteInIn) {
    super(id, context, "BsdQueueAutoRetryDelete");
    BsdQueueAutoRetryDeleteIn = BsdQueueAutoRetryDeleteInIn;
  }

  public void translateToMap() {
    if (BsdQueueAutoRetryDeleteIn != null) {
      BsdQueueAutoRetryDeleteIn.resetFlags(true, true);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryDeleteIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }


/**
 *
 * Sets the BsdQueueAutoRetry
 * @param BsdQueueAutoRetryDeleteInIn Value of the BsdQueueAutoRetryDeleteIn
 *
 */

  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectData BsdQueueAutoRetryDeleteInIn) {
    BsdQueueAutoRetryDeleteIn = BsdQueueAutoRetryDeleteInIn;
  }

  public void translateFromMap() {
    BsdQueueAutoRetryDeleteIn = BsdQueueAutoRetryObjectHelper.fromMap(inputMap, "BsdQueueAutoRetry");
  }

/**
 *
 * Gets the BsdQueueAutoRetry
 * @return Value of the BsdQueueAutoRetry
 *
 */

  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetry( ) {
    return BsdQueueAutoRetryDeleteIn;
  }

}
