/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsSecurityTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSecurityTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSecurityTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSecurityTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSecurityTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectData noOpInIn) {
    super(id, context, "InvsSecurityTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
/**
 *
 * Sets the  InvsSecurityType
 * @param noOpInIn InvsSecurityTypeObjectData to set
 *
 */
  public void setInvsSecurityType(InvsSecurityTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSecurityType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSecurityTypeObjectData getInvsSecurityType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSecurityTypeObjectHelper.fromMap(inputMap, "InvsSecurityType");
  }
}
