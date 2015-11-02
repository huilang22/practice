/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffRecoveryCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a WriteoffRecoveryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WriteoffRecoveryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WriteoffObjectData noOpIn;

/**
 *
 * Constructor to create a   WriteoffRecoveryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WriteoffRecoveryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectData noOpInIn) {
    super(id, context, "WriteoffRecoveryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Writeoff", WriteoffObjectHelper.toMap(noOpIn, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }
/**
 *
 * Sets the  Writeoff
 * @param noOpInIn WriteoffObjectData to set
 *
 */
  public void setWriteoff(WriteoffObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Writeoff passed into the constructor
 * @return Simulated response
 *
 */
  public WriteoffObjectData getWriteoff() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WriteoffObjectHelper.fromMap(inputMap, "Writeoff");
  }
}
