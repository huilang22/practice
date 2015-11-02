/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryCreateBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAutoRetryCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAutoRetryCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueAutoRetryObjectData BsdQueueAutoRetryCreateIn;
/**
 *
 * Constructor to create a  BsdQueueAutoRetryCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAutoRetryCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectData BsdQueueAutoRetryCreateInIn) {
    super(id, context, "BsdQueueAutoRetryCreate");
    BsdQueueAutoRetryCreateIn = BsdQueueAutoRetryCreateInIn;
  }

  public void translateToMap() {
    if (BsdQueueAutoRetryCreateIn != null) {
      BsdQueueAutoRetryCreateIn.resetFlags(true, true);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryCreateIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }


/**
 *
 * Sets the BsdQueueAutoRetry
 * @param BsdQueueAutoRetryCreateInIn Value of the BsdQueueAutoRetryCreateIn
 *
 */

  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectData BsdQueueAutoRetryCreateInIn) {
    BsdQueueAutoRetryCreateIn = BsdQueueAutoRetryCreateInIn;
  }

  public void translateFromMap() {
    BsdQueueAutoRetryCreateIn = BsdQueueAutoRetryObjectHelper.fromMap(inputMap, "BsdQueueAutoRetry");
  }

/**
 *
 * Gets the BsdQueueAutoRetry
 * @return Value of the BsdQueueAutoRetry
 *
 */

  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetry( ) {
    return BsdQueueAutoRetryCreateIn;
  }

}
