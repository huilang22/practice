/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapFindBulkUdtTemplateItem.java
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
 * Class used to create a ComponentPolicyMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentPolicyMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentPolicyMapObjectFilter cmpFindIn;
/**
 *
 * Constructor to create a  ComponentPolicyMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentPolicyMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectFilter cmpFindInIn) {
    super(id, context, "ComponentPolicyMapFind");
    cmpFindIn = cmpFindInIn;
  }

  public void translateToMap() {
    if (cmpFindIn != null) {
      Integer index =  cmpFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpFindIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }


/**
 *
 * Sets the ComponentPolicyMap
 * @param cmpFindInIn Value of the cmpFindIn
 *
 */

  public void setComponentPolicyMap(ComponentPolicyMapObjectFilter cmpFindInIn) {
    cmpFindIn = cmpFindInIn;
  }

  public void translateFromMap() {
    cmpFindIn = ComponentPolicyMapObjectHelper.fromMapFilter(inputMap, "ComponentPolicyMap");
  }

/**
 *
 * Gets the ComponentPolicyMap
 * @return Value of the ComponentPolicyMap
 *
 */

  public ComponentPolicyMapObjectFilter getComponentPolicyMap( ) {
    return cmpFindIn;
  }

}
