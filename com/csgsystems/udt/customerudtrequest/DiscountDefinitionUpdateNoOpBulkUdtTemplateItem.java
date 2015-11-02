/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountDefinitionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountDefinitionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DiscountDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountDefinitionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountDefinitionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscountDefinitionObjectData noOpInIn) {
    super(id, context, "DiscountDefinitionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
/**
 *
 * Sets the  DiscountDefinition
 * @param noOpInIn DiscountDefinitionObjectData to set
 *
 */
  public void setDiscountDefinition(DiscountDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public DiscountDefinitionObjectData getDiscountDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DiscountDefinitionObjectHelper.fromMap(inputMap, "DiscountDefinition");
  }
}
