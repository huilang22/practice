/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillImageGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillImageGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillImageObjectData noOpIn;

/**
 *
 * Constructor to create a   BillImageGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillImageGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImageObjectData noOpInIn) {
    super(id, context, "BillImageGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillImage", BillImageObjectHelper.toMap(noOpIn, new HashMap(), "BillImage").get("BillImage"));
    }
  }
/**
 *
 * Sets the  BillImage
 * @param noOpInIn BillImageObjectData to set
 *
 */
  public void setBillImage(BillImageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillImage passed into the constructor
 * @return Simulated response
 *
 */
  public BillImageObjectData getBillImage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillImageObjectHelper.fromMap(inputMap, "BillImage");
  }
}
