/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a ComponentPolicyMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentPolicyMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentPolicyMapObjectData cmpCreateIn;
/**
 *
 * Constructor to create a  ComponentPolicyMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentPolicyMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectData cmpCreateInIn) {
    super(id, context, "ComponentPolicyMapCreate");
    cmpCreateIn = cmpCreateInIn;
  }

  public void translateToMap() {
    if (cmpCreateIn != null) {
      cmpCreateIn.resetFlags(true, true);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpCreateIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }


/**
 *
 * Sets the ComponentPolicyMap
 * @param cmpCreateInIn Value of the cmpCreateIn
 *
 */

  public void setComponentPolicyMap(ComponentPolicyMapObjectData cmpCreateInIn) {
    cmpCreateIn = cmpCreateInIn;
  }

  public void translateFromMap() {
    cmpCreateIn = ComponentPolicyMapObjectHelper.fromMap(inputMap, "ComponentPolicyMap");
  }

/**
 *
 * Gets the ComponentPolicyMap
 * @return Value of the ComponentPolicyMap
 *
 */

  public ComponentPolicyMapObjectData getComponentPolicyMap( ) {
    return cmpCreateIn;
  }

}
