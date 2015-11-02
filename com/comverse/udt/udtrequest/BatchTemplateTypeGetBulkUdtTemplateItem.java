/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchTemplateTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTemplateTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTemplateTypeObjectKeyData batchTemplateTypeGetIn;
/**
 *
 * Constructor to create a  BatchTemplateTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTemplateTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTemplateTypeObjectKeyData batchTemplateTypeGetInIn) {
    super(id, context, "BatchTemplateTypeGet");
    batchTemplateTypeGetIn = batchTemplateTypeGetInIn;
  }

  public void translateToMap() {
    if (batchTemplateTypeGetIn != null) {
      batchTemplateTypeGetIn.resetFlags(true, true);
      addInput("BatchTemplateType", BatchTemplateTypeObjectKeyHelper.toMap(batchTemplateTypeGetIn, new HashMap(), "BatchTemplateTypeObjectKeyData").get("BatchTemplateTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchTemplateType
 * @param batchTemplateTypeGetInIn Value of the batchTemplateTypeGetIn
 *
 */

  public void setBatchTemplateType(BatchTemplateTypeObjectKeyData batchTemplateTypeGetInIn) {
    batchTemplateTypeGetIn = batchTemplateTypeGetInIn;
  }

  public void translateFromMap() {
    batchTemplateTypeGetIn = BatchTemplateTypeObjectKeyHelper.fromMap(inputMap, "BatchTemplateType");
  }

/**
 *
 * Gets the BatchTemplateType
 * @return Value of the BatchTemplateType
 *
 */

  public BatchTemplateTypeObjectKeyData getBatchTemplateType( ) {
    return batchTemplateTypeGetIn;
  }

}
