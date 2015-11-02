/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a PolicyTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PolicyTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentPolicyMapObjectFilter cmpPofindIn;
/**
 *
 * Constructor to create a  PolicyTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PolicyTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectFilter cmpPofindInIn) {
    super(id, context, "PolicyTypeFind");
    cmpPofindIn = cmpPofindInIn;
  }

  public void translateToMap() {
    if (cmpPofindIn != null) {
      Integer index =  cmpPofindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(cmpPofindIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }


/**
 *
 * Sets the ComponentPolicyMap
 * @param cmpPofindInIn Value of the cmpPofindIn
 *
 */

  public void setComponentPolicyMap(ComponentPolicyMapObjectFilter cmpPofindInIn) {
    cmpPofindIn = cmpPofindInIn;
  }

  public void translateFromMap() {
    cmpPofindIn = ComponentPolicyMapObjectHelper.fromMapFilter(inputMap, "ComponentPolicyMap");
  }

/**
 *
 * Gets the ComponentPolicyMap
 * @return Value of the ComponentPolicyMap
 *
 */

  public ComponentPolicyMapObjectFilter getComponentPolicyMap( ) {
    return cmpPofindIn;
  }

}
