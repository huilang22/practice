/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsTypePriceLookupMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypePriceLookupMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypePriceLookupMapObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypePriceLookupMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypePriceLookupMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypePriceLookupMapObjectData noOpInIn) {
    super(id, context, "InvsTypePriceLookupMapCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(noOpIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
/**
 *
 * Sets the  InvsTypePriceLookupMap
 * @param noOpInIn InvsTypePriceLookupMapObjectData to set
 *
 */
  public void setInvsTypePriceLookupMap(InvsTypePriceLookupMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypePriceLookupMap passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypePriceLookupMapObjectHelper.fromMap(inputMap, "InvsTypePriceLookupMap");
  }
}
