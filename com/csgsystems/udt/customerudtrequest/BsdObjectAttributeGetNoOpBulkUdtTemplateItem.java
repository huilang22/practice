/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectAttributeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdObjectAttributeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectAttributeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectAttributeObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdObjectAttributeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectAttributeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectData noOpInIn) {
    super(id, context, "BsdObjectAttributeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(noOpIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
/**
 *
 * Sets the  BsdObjectAttribute
 * @param noOpInIn BsdObjectAttributeObjectData to set
 *
 */
  public void setBsdObjectAttribute(BsdObjectAttributeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObjectAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectData getBsdObjectAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectAttributeObjectHelper.fromMap(inputMap, "BsdObjectAttribute");
  }
}
