/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeParameterUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeParameterUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeParameterObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeParameterUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeParameterUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectData noOpInIn) {
    super(id, context, "BatchTypeParameterUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(noOpIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
/**
 *
 * Sets the  BatchTypeParameter
 * @param noOpInIn BatchTypeParameterObjectData to set
 *
 */
  public void setBatchTypeParameter(BatchTypeParameterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTypeParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectData getBatchTypeParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeParameterObjectHelper.fromMap(inputMap, "BatchTypeParameter");
  }
}
