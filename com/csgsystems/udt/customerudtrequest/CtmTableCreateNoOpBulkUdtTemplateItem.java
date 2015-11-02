/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CtmTableCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmTableCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmTableObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmTableCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmTableCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectData noOpInIn) {
    super(id, context, "CtmTableCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmTable", CtmTableObjectHelper.toMap(noOpIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
/**
 *
 * Sets the  CtmTable
 * @param noOpInIn CtmTableObjectData to set
 *
 */
  public void setCtmTable(CtmTableObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmTable passed into the constructor
 * @return Simulated response
 *
 */
  public CtmTableObjectData getCtmTable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmTableObjectHelper.fromMap(inputMap, "CtmTable");
  }
}
