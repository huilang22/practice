/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchStatusObjectFilter batchStatusFindIn;
/**
 *
 * Constructor to create a  BatchStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchStatusObjectFilter batchStatusFindInIn) {
    super(id, context, "BatchStatusFind");
    batchStatusFindIn = batchStatusFindInIn;
  }

  public void translateToMap() {
    if (batchStatusFindIn != null) {
      Integer index =  batchStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(batchStatusFindIn, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }


/**
 *
 * Sets the BatchStatus
 * @param batchStatusFindInIn Value of the batchStatusFindIn
 *
 */

  public void setBatchStatus(BatchStatusObjectFilter batchStatusFindInIn) {
    batchStatusFindIn = batchStatusFindInIn;
  }

  public void translateFromMap() {
    batchStatusFindIn = BatchStatusObjectHelper.fromMapFilter(inputMap, "BatchStatus");
  }

/**
 *
 * Gets the BatchStatus
 * @return Value of the BatchStatus
 *
 */

  public BatchStatusObjectFilter getBatchStatus( ) {
    return batchStatusFindIn;
  }

}
