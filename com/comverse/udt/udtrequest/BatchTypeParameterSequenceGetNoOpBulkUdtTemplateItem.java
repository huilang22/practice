/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeParameterSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeParameterSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeParameterObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeParameterSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeParameterSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeParameterObjectKeyData noOpInIn) {
    super(id, context, "BatchTypeParameterSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
/**
 *
 * Sets the  BatchTypeParameter
 * @param noOpInIn BatchTypeParameterObjectKeyData to set
 *
 */
  public void setBatchTypeParameter(BatchTypeParameterObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchTypeParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeParameterObjectKeyData getBatchTypeParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeParameterObjectKeyHelper.fromMap(inputMap, "BatchTypeParameter");
  }
}
