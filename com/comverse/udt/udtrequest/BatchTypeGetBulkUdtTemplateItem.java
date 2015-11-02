/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeObjectKeyData batchTypeGetIn;
/**
 *
 * Constructor to create a  BatchTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectKeyData batchTypeGetInIn) {
    super(id, context, "BatchTypeGet");
    batchTypeGetIn = batchTypeGetInIn;
  }

  public void translateToMap() {
    if (batchTypeGetIn != null) {
      batchTypeGetIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(batchTypeGetIn, new HashMap(), "BatchTypeObjectKeyData").get("BatchTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchType
 * @param batchTypeGetInIn Value of the batchTypeGetIn
 *
 */

  public void setBatchType(BatchTypeObjectKeyData batchTypeGetInIn) {
    batchTypeGetIn = batchTypeGetInIn;
  }

  public void translateFromMap() {
    batchTypeGetIn = BatchTypeObjectKeyHelper.fromMap(inputMap, "BatchType");
  }

/**
 *
 * Gets the BatchType
 * @return Value of the BatchType
 *
 */

  public BatchTypeObjectKeyData getBatchType( ) {
    return batchTypeGetIn;
  }

}
