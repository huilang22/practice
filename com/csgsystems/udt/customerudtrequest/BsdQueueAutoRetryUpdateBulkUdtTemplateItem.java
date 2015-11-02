/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAutoRetryUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAutoRetryUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueAutoRetryObjectData BsdQueueAutoRetryUpdateIn;
/**
 *
 * Constructor to create a  BsdQueueAutoRetryUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAutoRetryUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectData BsdQueueAutoRetryUpdateInIn) {
    super(id, context, "BsdQueueAutoRetryUpdate");
    BsdQueueAutoRetryUpdateIn = BsdQueueAutoRetryUpdateInIn;
  }

  public void translateToMap() {
    if (BsdQueueAutoRetryUpdateIn != null) {
      BsdQueueAutoRetryUpdateIn.resetFlags(true, true);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryUpdateIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }


/**
 *
 * Sets the BsdQueueAutoRetry
 * @param BsdQueueAutoRetryUpdateInIn Value of the BsdQueueAutoRetryUpdateIn
 *
 */

  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectData BsdQueueAutoRetryUpdateInIn) {
    BsdQueueAutoRetryUpdateIn = BsdQueueAutoRetryUpdateInIn;
  }

  public void translateFromMap() {
    BsdQueueAutoRetryUpdateIn = BsdQueueAutoRetryObjectHelper.fromMap(inputMap, "BsdQueueAutoRetry");
  }

/**
 *
 * Gets the BsdQueueAutoRetry
 * @return Value of the BsdQueueAutoRetry
 *
 */

  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetry( ) {
    return BsdQueueAutoRetryUpdateIn;
  }

}
