/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchTypeParameterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchTypeParameterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchTypeParameterObjectFilter batchTypeParameterFindIn;
/**
 *
 * Constructor to create a  BatchTypeParameterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchTypeParameterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectFilter batchTypeParameterFindInIn) {
    super(id, context, "BatchTypeParameterFind");
    batchTypeParameterFindIn = batchTypeParameterFindInIn;
  }

  public void translateToMap() {
    if (batchTypeParameterFindIn != null) {
      Integer index =  batchTypeParameterFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(batchTypeParameterFindIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }


/**
 *
 * Sets the BatchTypeParameter
 * @param batchTypeParameterFindInIn Value of the batchTypeParameterFindIn
 *
 */

  public void setBatchTypeParameter(BatchTypeParameterObjectFilter batchTypeParameterFindInIn) {
    batchTypeParameterFindIn = batchTypeParameterFindInIn;
  }

  public void translateFromMap() {
    batchTypeParameterFindIn = BatchTypeParameterObjectHelper.fromMapFilter(inputMap, "BatchTypeParameter");
  }

/**
 *
 * Gets the BatchTypeParameter
 * @return Value of the BatchTypeParameter
 *
 */

  public BatchTypeParameterObjectFilter getBatchTypeParameter( ) {
    return batchTypeParameterFindIn;
  }

}
