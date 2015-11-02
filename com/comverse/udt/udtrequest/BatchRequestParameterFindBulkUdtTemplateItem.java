/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParameterFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParameterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParameterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchRequestParameterObjectFilter batchRequestParameterFindIn;
/**
 *
 * Constructor to create a  BatchRequestParameterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParameterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParameterObjectFilter batchRequestParameterFindInIn) {
    super(id, context, "BatchRequestParameterFind");
    batchRequestParameterFindIn = batchRequestParameterFindInIn;
  }

  public void translateToMap() {
    if (batchRequestParameterFindIn != null) {
      Integer index =  batchRequestParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(batchRequestParameterFindIn, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }


/**
 *
 * Sets the BatchRequestParameter
 * @param batchRequestParameterFindInIn Value of the batchRequestParameterFindIn
 *
 */

  public void setBatchRequestParameter(BatchRequestParameterObjectFilter batchRequestParameterFindInIn) {
    batchRequestParameterFindIn = batchRequestParameterFindInIn;
  }

  public void translateFromMap() {
    batchRequestParameterFindIn = BatchRequestParameterObjectHelper.fromMapFilter(inputMap, "BatchRequestParameter");
  }

/**
 *
 * Gets the BatchRequestParameter
 * @return Value of the BatchRequestParameter
 *
 */

  public BatchRequestParameterObjectFilter getBatchRequestParameter( ) {
    return batchRequestParameterFindIn;
  }

}
