/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentDefinitionCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentDefinitionCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CDObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentDefinitionCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentDefinitionCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectData noOpInIn) {
    super(id, context, "ComponentDefinitionCreate");
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
