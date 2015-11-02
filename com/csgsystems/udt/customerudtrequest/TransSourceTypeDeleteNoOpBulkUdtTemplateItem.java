/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TransSourceTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TransSourceTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TransSourceTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   TransSourceTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TransSourceTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectData noOpInIn) {
    super(id, context, "TransSourceTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(noOpIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
/**
 *
 * Sets the  TransSourceType
 * @param noOpInIn TransSourceTypeObjectData to set
 *
 */
  public void setTransSourceType(TransSourceTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TransSourceType passed into the constructor
 * @return Simulated response
 *
 */
  public TransSourceTypeObjectData getTransSourceType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TransSourceTypeObjectHelper.fromMap(inputMap, "TransSourceType");
  }
}
