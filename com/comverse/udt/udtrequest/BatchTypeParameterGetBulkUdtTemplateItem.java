/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterGetBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeParameterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeParameterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeParameterObjectKeyData batchTypeParameterGetIn;
/**
 *
 * Constructor to create a  BatchTypeParameterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeParameterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectKeyData batchTypeParameterGetInIn) {
    super(id, context, "BatchTypeParameterGet");
    batchTypeParameterGetIn = batchTypeParameterGetInIn;
  }

  public void translateToMap() {
    if (batchTypeParameterGetIn != null) {
      batchTypeParameterGetIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(batchTypeParameterGetIn, new HashMap(), "BatchTypeParameterObjectKeyData").get("BatchTypeParameterObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchTypeParameter
 * @param batchTypeParameterGetInIn Value of the batchTypeParameterGetIn
 *
 */

  public void setBatchTypeParameter(BatchTypeParameterObjectKeyData batchTypeParameterGetInIn) {
    batchTypeParameterGetIn = batchTypeParameterGetInIn;
  }

  public void translateFromMap() {
    batchTypeParameterGetIn = BatchTypeParameterObjectKeyHelper.fromMap(inputMap, "BatchTypeParameter");
  }

/**
 *
 * Gets the BatchTypeParameter
 * @return Value of the BatchTypeParameter
 *
 */

  public BatchTypeParameterObjectKeyData getBatchTypeParameter( ) {
    return batchTypeParameterGetIn;
  }

}
