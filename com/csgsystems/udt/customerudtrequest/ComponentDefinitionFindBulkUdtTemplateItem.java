/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a ComponentDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CDObjectFilter CDFindIn;
/**
 *
 * Constructor to create a  ComponentDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CDObjectFilter CDFindInIn) {
    super(id, context, "ComponentDefinitionFind");
    CDFindIn = CDFindInIn;
  }

  public void translateToMap() {
    if (CDFindIn != null) {
      Integer index =  CDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDFindIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }


/**
 *
 * Sets the ComponentDefinition
 * @param CDFindInIn Value of the CDFindIn
 *
 */

  public void setComponentDefinition(CDObjectFilter CDFindInIn) {
    CDFindIn = CDFindInIn;
  }

  public void translateFromMap() {
    CDFindIn = CDObjectHelper.fromMapFilter(inputMap, "ComponentDefinition");
  }

/**
 *
 * Gets the ComponentDefinition
 * @return Value of the ComponentDefinition
 *
 */

  public CDObjectFilter getComponentDefinition( ) {
    return CDFindIn;
  }

}
