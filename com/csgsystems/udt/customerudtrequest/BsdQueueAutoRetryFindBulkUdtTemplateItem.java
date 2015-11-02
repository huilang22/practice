/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryFindBulkUdtTemplateItem.java
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
 * Class used to create a BsdQueueAutoRetryFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BsdQueueAutoRetryFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BsdQueueAutoRetryObjectFilter BsdQueueAutoRetryFindIn;
/**
 *
 * Constructor to create a  BsdQueueAutoRetryFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BsdQueueAutoRetryFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdQueueAutoRetryObjectFilter BsdQueueAutoRetryFindInIn) {
    super(id, context, "BsdQueueAutoRetryFind");
    BsdQueueAutoRetryFindIn = BsdQueueAutoRetryFindInIn;
  }

  public void translateToMap() {
    if (BsdQueueAutoRetryFindIn != null) {
      Integer index =  BsdQueueAutoRetryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(BsdQueueAutoRetryFindIn, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }


/**
 *
 * Sets the BsdQueueAutoRetry
 * @param BsdQueueAutoRetryFindInIn Value of the BsdQueueAutoRetryFindIn
 *
 */

  public void setBsdQueueAutoRetry(BsdQueueAutoRetryObjectFilter BsdQueueAutoRetryFindInIn) {
    BsdQueueAutoRetryFindIn = BsdQueueAutoRetryFindInIn;
  }

  public void translateFromMap() {
    BsdQueueAutoRetryFindIn = BsdQueueAutoRetryObjectHelper.fromMapFilter(inputMap, "BsdQueueAutoRetry");
  }

/**
 *
 * Gets the BsdQueueAutoRetry
 * @return Value of the BsdQueueAutoRetry
 *
 */

  public BsdQueueAutoRetryObjectFilter getBsdQueueAutoRetry( ) {
    return BsdQueueAutoRetryFindIn;
  }

}
