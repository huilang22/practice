/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentDefinitionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentDefinitionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CDObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentDefinitionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentDefinitionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectData noOpInIn) {
    super(id, context, "ComponentDefinitionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ComponentDefinition", CDObjectHelper.toMap(noOpIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
/**
 *
 * Sets the  ComponentDefinition
 * @param noOpInIn CDObjectData to set
 *
 */
  public void setComponentDefinition(CDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public CDObjectData getComponentDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CDObjectHelper.fromMap(inputMap, "ComponentDefinition");
  }
}
