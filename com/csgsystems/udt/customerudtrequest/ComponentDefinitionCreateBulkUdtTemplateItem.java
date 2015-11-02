/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectData CDCreateIn;
/**
 *
 * Constructor to create a  ComponentDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectData CDCreateInIn) {
    super(id, context, "ComponentDefinitionCreate");
    CDCreateIn = CDCreateInIn;
  }

  public void translateToMap() {
    if (CDCreateIn != null) {
      CDCreateIn.resetFlags(true, true);
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDCreateIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }


/**
 *
 * Sets the ComponentDefinition
 * @param CDCreateInIn Value of the CDCreateIn
 *
 */

  public void setComponentDefinition(CDObjectData CDCreateInIn) {
    CDCreateIn = CDCreateInIn;
  }

  public void translateFromMap() {
    CDCreateIn = CDObjectHelper.fromMap(inputMap, "ComponentDefinition");
  }

/**
 *
 * Gets the ComponentDefinition
 * @return Value of the ComponentDefinition
 *
 */

  public CDObjectData getComponentDefinition( ) {
    return CDCreateIn;
  }

}
