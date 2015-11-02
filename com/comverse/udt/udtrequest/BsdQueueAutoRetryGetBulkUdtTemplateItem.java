/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueAutoRetryGetBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAutoRetryGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAutoRetryGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueAutoRetryObjectKeyData BsdQueueAutoRetryGetIn;
/**
 *
 * Constructor to create a  BsdQueueAutoRetryGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAutoRetryGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectKeyData BsdQueueAutoRetryGetInIn) {
    super(id, context, "BsdQueueAutoRetryGet");
    BsdQueueAutoRetryGetIn = BsdQueueAutoRetryGetInIn;
  }

  public void translateToMap() {
    if (BsdQueueAutoRetryGetIn != null) {
      BsdQueueAutoRetryGetIn.resetFlags(true, true);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectKeyHelper.toMap(BsdQueueAutoRetryGetIn, new HashMap(), "BsdQueueAutoRetryObjectKeyData").get("BsdQueueAutoRetryObjectKeyData"));
    }
  }


/**
 *
 * Sets the BsdQueueAutoRetry
 * @param BsdQueueAutoRetryGetInIn Value of the BsdQueueAutoRetryGetIn
 *
 */

  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectKeyData BsdQueueAutoRetryGetInIn) {
    BsdQueueAutoRetryGetIn = BsdQueueAutoRetryGetInIn;
  }

  public void translateFromMap() {
    BsdQueueAutoRetryGetIn = BsdQueueAutoRetryObjectKeyHelper.fromMap(inputMap, "BsdQueueAutoRetry");
  }

/**
 *
 * Gets the BsdQueueAutoRetry
 * @return Value of the BsdQueueAutoRetry
 *
 */

  public BsdQueueAutoRetryObjectKeyData getBsdQueueAutoRetry( ) {
    return BsdQueueAutoRetryGetIn;
  }

}
