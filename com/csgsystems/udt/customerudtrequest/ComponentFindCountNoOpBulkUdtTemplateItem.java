/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentFindCountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentFindCountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentFindCountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   ComponentFindCountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentFindCountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "ComponentFindCount");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("ComponentCount", noOpIn);
    }
  }
/**
 *
 * Sets the  ComponentCount
 * @param noOpInIn Integer to set
 *
 */
  public void setComponentCount(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentCount passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getComponentCount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("ComponentCount");
  }
}
