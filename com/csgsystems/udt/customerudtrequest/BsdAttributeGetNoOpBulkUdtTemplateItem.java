/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdAttributeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectData noOpInIn) {
    super(id, context, "BsdAttributeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
/**
 *
 * Sets the  BsdAttribute
 * @param noOpInIn BsdAttributeObjectData to set
 *
 */
  public void setBsdAttribute(BsdAttributeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectData getBsdAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeObjectHelper.fromMap(inputMap, "BsdAttribute");
  }
}
