/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapGetBulkUdtTemplateItem.java
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
 * Class used to create a ComponentPolicyMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentPolicyMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentPolicyMapObjectKeyData cmpGetIn;
/**
 *
 * Constructor to create a  ComponentPolicyMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentPolicyMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectKeyData cmpGetInIn) {
    super(id, context, "ComponentPolicyMapGet");
    cmpGetIn = cmpGetInIn;
  }

  public void translateToMap() {
    if (cmpGetIn != null) {
      cmpGetIn.resetFlags(true, true);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectKeyHelper.toMap(cmpGetIn, new HashMap(), "ComponentPolicyMapObjectKeyData").get("ComponentPolicyMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the ComponentPolicyMap
 * @param cmpGetInIn Value of the cmpGetIn
 *
 */

  public void setComponentPolicyMap(ComponentPolicyMapObjectKeyData cmpGetInIn) {
    cmpGetIn = cmpGetInIn;
  }

  public void translateFromMap() {
    cmpGetIn = ComponentPolicyMapObjectKeyHelper.fromMap(inputMap, "ComponentPolicyMap");
  }

/**
 *
 * Gets the ComponentPolicyMap
 * @return Value of the ComponentPolicyMap
 *
 */

  public ComponentPolicyMapObjectKeyData getComponentPolicyMap( ) {
    return cmpGetIn;
  }

}
