/*
 * Generated code DO NOT EDIT
 * Generated file: BatchInvSourceDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchInvSourceDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchInvSourceDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BISObjectKeyData BISDeleteIn;
/**
 *
 * Constructor to create a  BatchInvSourceDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchInvSourceDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BISObjectKeyData BISDeleteInIn) {
    super(id, context, "BatchInvSourceDelete");
    BISDeleteIn = BISDeleteInIn;
  }

  public void translateToMap() {
    if (BISDeleteIn != null) {
      BISDeleteIn.resetFlags(true, true);
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(BISDeleteIn, new HashMap(), "BISObjectKeyData").get("BISObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchInvSource
 * @param BISDeleteInIn Value of the BISDeleteIn
 *
 */

  public void setBatchInvSource(BISObjectKeyData BISDeleteInIn) {
    BISDeleteIn = BISDeleteInIn;
  }

  public void translateFromMap() {
    BISDeleteIn = BISObjectKeyHelper.fromMap(inputMap, "BatchInvSource");
  }

/**
 *
 * Gets the BatchInvSource
 * @return Value of the BatchInvSource
 *
 */

  public BISObjectKeyData getBatchInvSource( ) {
    return BISDeleteIn;
  }

}
