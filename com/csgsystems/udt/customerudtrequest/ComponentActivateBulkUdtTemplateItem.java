/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentActivateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ComponentActivateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentActivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseKeyData ComponentActivateIn;
/**
 *
 * Constructor to create a  ComponentActivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentActivateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseKeyData ComponentActivateInIn) {
    super(id, context, "ComponentActivate");
    ComponentActivateIn = ComponentActivateInIn;
  }

  public void translateToMap() {
    if (ComponentActivateIn != null) {
      ComponentActivateIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentActivateIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Component
 * @param ComponentActivateInIn Value of the ComponentActivateIn
 *
 */

  public void setComponent(ComponentObjectBaseKeyData ComponentActivateInIn) {
    ComponentActivateIn = ComponentActivateInIn;
  }

  public void translateFromMap() {
    ComponentActivateIn = ComponentObjectBaseKeyHelper.fromMap(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseKeyData getComponent( ) {
    return ComponentActivateIn;
  }

}
