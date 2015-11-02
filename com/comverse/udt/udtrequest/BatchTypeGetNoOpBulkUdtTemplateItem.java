/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectData noOpInIn) {
    super(id, context, "BatchTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }
/**
 *
 * Sets the  BatchType
 * @param noOpInIn BatchTypeObjectData to set
 *
 */
  public void setBatchType(BatchTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectData getBatchType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeObjectHelper.fromMap(inputMap, "BatchType");
  }
}
