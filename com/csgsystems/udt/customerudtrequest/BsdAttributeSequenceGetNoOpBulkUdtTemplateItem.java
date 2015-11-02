/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectKeyData noOpInIn) {
    super(id, context, "BsdAttributeSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
/**
 *
 * Sets the  BsdAttribute
 * @param noOpInIn BsdAttributeObjectKeyData to set
 *
 */
  public void setBsdAttribute(BsdAttributeObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectKeyData getBsdAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeObjectKeyHelper.fromMap(inputMap, "BsdAttribute");
  }
}
