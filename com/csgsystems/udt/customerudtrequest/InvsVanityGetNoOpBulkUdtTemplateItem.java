/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVanityGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsVanityGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVanityGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVanityObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsVanityGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVanityGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectData noOpInIn) {
    super(id, context, "InvsVanityGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(noOpIn, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
/**
 *
 * Sets the  InvsVanity
 * @param noOpInIn InvsVanityObjectData to set
 *
 */
  public void setInvsVanity(InvsVanityObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVanity passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVanityObjectData getInvsVanity() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVanityObjectHelper.fromMap(inputMap, "InvsVanity");
  }
}
