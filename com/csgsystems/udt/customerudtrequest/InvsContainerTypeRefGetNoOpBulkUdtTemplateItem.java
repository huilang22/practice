/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsContainerTypeRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsContainerTypeRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsContainerTypeRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsContainerTypeRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsContainerTypeRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeRefObjectData noOpInIn) {
    super(id, context, "InvsContainerTypeRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
/**
 *
 * Sets the  InvsContainerTypeRef
 * @param noOpInIn InvsContainerTypeRefObjectData to set
 *
 */
  public void setInvsContainerTypeRef(InvsContainerTypeRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsContainerTypeRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeRefObjectData getInvsContainerTypeRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsContainerTypeRefObjectHelper.fromMap(inputMap, "InvsContainerTypeRef");
  }
}
