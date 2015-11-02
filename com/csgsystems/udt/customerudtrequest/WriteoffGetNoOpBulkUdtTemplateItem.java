/*
 * Generated code DO NOT EDIT
 * Generated file: WriteoffGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a WriteoffGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WriteoffGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WriteoffObjectData noOpIn;

/**
 *
 * Constructor to create a   WriteoffGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WriteoffGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectData noOpInIn) {
    super(id, context, "WriteoffGet");
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
