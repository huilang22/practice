/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchTypeSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchTypeSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchTypeObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BatchTypeSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchTypeSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchTypeObjectKeyData noOpInIn) {
    super(id, context, "BatchTypeSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchType").get("BatchType"));
    }
  }
/**
 *
 * Sets the  BatchType
 * @param noOpInIn BatchTypeObjectKeyData to set
 *
 */
  public void setBatchType(BatchTypeObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchTypeObjectKeyData getBatchType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchTypeObjectKeyHelper.fromMap(inputMap, "BatchType");
  }
}
