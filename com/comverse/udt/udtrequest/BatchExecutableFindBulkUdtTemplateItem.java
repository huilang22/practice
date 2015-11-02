/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchExecutableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchExecutableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchExecutableObjectFilter batchExecutableFindIn;
/**
 *
 * Constructor to create a  BatchExecutableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchExecutableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectFilter batchExecutableFindInIn) {
    super(id, context, "BatchExecutableFind");
    batchExecutableFindIn = batchExecutableFindInIn;
  }

  public void translateToMap() {
    if (batchExecutableFindIn != null) {
      Integer index =  batchExecutableFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(batchExecutableFindIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }


/**
 *
 * Sets the BatchExecutable
 * @param batchExecutableFindInIn Value of the batchExecutableFindIn
 *
 */

  public void setBatchExecutable(BatchExecutableObjectFilter batchExecutableFindInIn) {
    batchExecutableFindIn = batchExecutableFindInIn;
  }

  public void translateFromMap() {
    batchExecutableFindIn = BatchExecutableObjectHelper.fromMapFilter(inputMap, "BatchExecutable");
  }

/**
 *
 * Gets the BatchExecutable
 * @return Value of the BatchExecutable
 *
 */

  public BatchExecutableObjectFilter getBatchExecutable( ) {
    return batchExecutableFindIn;
  }

}
