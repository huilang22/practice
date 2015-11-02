/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdQueueAutoRetryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdQueueAutoRetryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdQueueAutoRetryObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdQueueAutoRetryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdQueueAutoRetryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectData noOpInIn) {
    super(id, context, "BsdQueueAutoRetryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(noOpIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
/**
 *
 * Sets the  BsdQueueAutoRetry
 * @param noOpInIn BsdQueueAutoRetryObjectData to set
 *
 */
  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdQueueAutoRetry passed into the constructor
 * @return Simulated response
 *
 */
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetry() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdQueueAutoRetryObjectHelper.fromMap(inputMap, "BsdQueueAutoRetry");
  }
}
