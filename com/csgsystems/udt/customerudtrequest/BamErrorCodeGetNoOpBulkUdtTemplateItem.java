/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BamErrorCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BamErrorCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BECObjectData noOpIn;

/**
 *
 * Constructor to create a   BamErrorCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BamErrorCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectData noOpInIn) {
    super(id, context, "BamErrorCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BamErrorCode", BECObjectHelper.toMap(noOpIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
/**
 *
 * Sets the  BamErrorCode
 * @param noOpInIn BECObjectData to set
 *
 */
  public void setBamErrorCode(BECObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BamErrorCode passed into the constructor
 * @return Simulated response
 *
 */
  public BECObjectData getBamErrorCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BECObjectHelper.fromMap(inputMap, "BamErrorCode");
  }
}
