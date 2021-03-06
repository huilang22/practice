/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ComponentPolicyMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentPolicyMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentPolicyMapObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentPolicyMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentPolicyMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectData noOpInIn) {
    super(id, context, "ComponentPolicyMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(noOpIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
/**
 *
 * Sets the  ComponentPolicyMap
 * @param noOpInIn ComponentPolicyMapObjectData to set
 *
 */
  public void setComponentPolicyMap(ComponentPolicyMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentPolicyMap passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentPolicyMapObjectData getComponentPolicyMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentPolicyMapObjectHelper.fromMap(inputMap, "ComponentPolicyMap");
  }
}
