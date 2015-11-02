/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectData batchExecutableCreateIn;
/**
 *
 * Constructor to create a  BatchExecutableCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectData batchExecutableCreateInIn) {
    super(id, context, "BatchExecutableCreate");
    batchExecutableCreateIn = batchExecutableCreateInIn;
  }

  public void translateToMap() {
    if (batchExecutableCreateIn != null) {
      batchExecutableCreateIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableCreateIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableCreateInIn Value of the batchExecutableCreateIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectData batchExecutableCreateInIn) {
    batchExecutableCreateIn = batchExecutableCreateInIn;
  }

  public void translateFromMap() {
    batchExecutableCreateIn = BatchExecutableObjectHelper.fromMap(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectData getBatchExecutable( ) {
    return batchExecutableCreateIn;
  }

}
