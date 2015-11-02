/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDisconnectChargeAmountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentDisconnectChargeAmountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentDisconnectChargeAmountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentDisconnectChargeAmountGetOutputData noOpIn;

/**
 *
 * Constructor to create a   ComponentDisconnectChargeAmountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentDisconnectChargeAmountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentDisconnectChargeAmountGetOutputData noOpInIn) {
    super(id, context, "ComponentDisconnectChargeAmountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ComponentDisconnectChargeAmountGetOutputData", ComponentDisconnectChargeAmountGetOutputHelper.toMap(noOpIn).get("ComponentDisconnectChargeAmountGetOutputData"));
    }
  }
/**
 *
 * Sets the  ComponentDisconnectChargeAmountGetOutputData
 * @param noOpInIn ComponentDisconnectChargeAmountGetOutputData to set
 *
 */
  public void setComponentDisconnectChargeAmountGetOutputData(ComponentDisconnectChargeAmountGetOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentDisconnectChargeAmountGetOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentDisconnectChargeAmountGetOutputData getComponentDisconnectChargeAmountGetOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentDisconnectChargeAmountGetOutputHelper.fromMap(inputMap);
  }
}
