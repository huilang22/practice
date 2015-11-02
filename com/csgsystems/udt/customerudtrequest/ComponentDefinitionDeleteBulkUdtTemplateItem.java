/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDefinitionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectKeyData CDDeleteIn;
/**
 *
 * Constructor to create a  ComponentDefinitionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectKeyData CDDeleteInIn) {
    super(id, context, "ComponentDefinitionDelete");
    CDDeleteIn = CDDeleteInIn;
  }

  public void translateToMap() {
    if (CDDeleteIn != null) {
      CDDeleteIn.resetFlags(true, true);
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(CDDeleteIn, new HashMap(), "CDObjectKeyData").get("CDObjectKeyData"));
    }
  }


/**
 *
 * Sets the ComponentDefinition
 * @param CDDeleteInIn Value of the CDDeleteIn
 *
 */

  public void setComponentDefinition(CDObjectKeyData CDDeleteInIn) {
    CDDeleteIn = CDDeleteInIn;
  }

  public void translateFromMap() {
    CDDeleteIn = CDObjectKeyHelper.fromMap(inputMap, "ComponentDefinition");
  }

/**
 *
 * Gets the ComponentDefinition
 * @return Value of the ComponentDefinition
 *
 */

  public CDObjectKeyData getComponentDefinition( ) {
    return CDDeleteIn;
  }

}
