/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchExecutableSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchExecutableSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchExecutableObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchExecutableSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchExecutableSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchExecutableObjectKeyData noOpInIn) {
    super(id, context, "BatchExecutableSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
/**
 *
 * Sets the  BatchExecutable
 * @param noOpInIn BatchExecutableObjectKeyData to set
 *
 */
  public void setBatchExecutable(BatchExecutableObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchExecutable passed into the constructor
 * @return Simulated response
 *
 */
  public BatchExecutableObjectKeyData getBatchExecutable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchExecutableObjectKeyHelper.fromMap(inputMap, "BatchExecutable");
  }
}
