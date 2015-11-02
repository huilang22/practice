/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementFindBulkUdtTemplateItem.java
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
 * Class used to create a ComponentElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentElementObjectFilter findIn;
/**
 *
 * Constructor to create a  ComponentElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectFilter findInIn) {
    super(id, context, "ComponentElementFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(findIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }


/**
 *
 * Sets the ComponentElement
 * @param findInIn Value of the findIn
 *
 */

  public void setComponentElement(ComponentElementObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ComponentElementObjectHelper.fromMapFilter(inputMap, "ComponentElement");
  }

/**
 *
 * Gets the ComponentElement
 * @return Value of the ComponentElement
 *
 */

  public ComponentElementObjectFilter getComponentElement( ) {
    return findIn;
  }

}
