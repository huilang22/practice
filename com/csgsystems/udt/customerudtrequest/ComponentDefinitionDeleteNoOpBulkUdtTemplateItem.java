/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentDefinitionDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentDefinitionDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CDObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentDefinitionDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentDefinitionDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectData noOpInIn) {
    super(id, context, "ComponentDefinitionDelete");
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
