/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataParamDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataParamDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected XPDObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataParamDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataParamDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectData noOpInIn) {
    super(id, context, "ExtendedDataParamDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
/**
 *
 * Sets the  ExtendedDataParam
 * @param noOpInIn XPDObjectData to set
 *
 */
  public void setExtendedDataParam(XPDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataParam passed into the constructor
 * @return Simulated response
 *
 */
  public XPDObjectData getExtendedDataParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = XPDObjectHelper.fromMap(inputMap, "ExtendedDataParam");
  }
}
