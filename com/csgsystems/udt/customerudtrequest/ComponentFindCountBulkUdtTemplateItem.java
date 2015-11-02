/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentFindCountBulkUdtTemplateItem.java
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
 * Class used to create a ComponentFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseFilter ComponentFindCountIn;
/**
 *
 * Constructor to create a  ComponentFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseFilter ComponentFindCountInIn) {
    super(id, context, "ComponentFindCount");
    ComponentFindCountIn = ComponentFindCountInIn;
  }

  public void translateToMap() {
    if (ComponentFindCountIn != null) {
      Integer index =  ComponentFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(ComponentFindCountIn, new HashMap(), "ComponentCount").get("ComponentCount"));
    }
  }


/**
 *
 * Sets the Component
 * @param ComponentFindCountInIn Value of the ComponentFindCountIn
 *
 */

  public void setComponent(ComponentObjectBaseFilter ComponentFindCountInIn) {
    ComponentFindCountIn = ComponentFindCountInIn;
  }

  public void translateFromMap() {
    ComponentFindCountIn = ComponentObjectBaseHelper.fromMapFilter(inputMap, "Component");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseFilter getComponent( ) {
    return ComponentFindCountIn;
  }

}
