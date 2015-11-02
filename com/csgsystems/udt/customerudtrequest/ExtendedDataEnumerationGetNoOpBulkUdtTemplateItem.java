/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataEnumerationGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataEnumerationGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EDObjectData noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataEnumerationGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataEnumerationGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectData noOpInIn) {
    super(id, context, "ExtendedDataEnumerationGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
/**
 *
 * Sets the  ExtendedDataEnumeration
 * @param noOpInIn EDObjectData to set
 *
 */
  public void setExtendedDataEnumeration(EDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public EDObjectData getExtendedDataEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EDObjectHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }
}
