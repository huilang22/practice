/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * Class used to create a BatchTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeObjectData batchTypeUpdateIn;
/**
 *
 * Constructor to create a  BatchTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectData batchTypeUpdateInIn) {
    super(id, context, "BatchTypeUpdate");
    batchTypeUpdateIn = batchTypeUpdateInIn;
  }

  public void translateToMap() {
    if (batchTypeUpdateIn != null) {
      batchTypeUpdateIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectHelper.toMap(batchTypeUpdateIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }


/**
 *
 * Sets the BatchType
 * @param batchTypeUpdateInIn Value of the batchTypeUpdateIn
 *
 */

  public void setBatchType(BatchTypeObjectData batchTypeUpdateInIn) {
    batchTypeUpdateIn = batchTypeUpdateInIn;
  }

  public void translateFromMap() {
    batchTypeUpdateIn = BatchTypeObjectHelper.fromMap(inputMap, "BatchType");
  }

/**
 *
 * Gets the BatchType
 * @return Value of the BatchType
 *
 */

  public BatchTypeObjectData getBatchType( ) {
    return batchTypeUpdateIn;
  }

}
