/*
 * Generated code DO NOT EDIT
 * Generated file: OwningCostCenterFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a OwningCostCenterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class OwningCostCenterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OwningCostCenterObjectFilter OCCFindIn;
/**
 *
 * Constructor to create a  OwningCostCenterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OwningCostCenterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, OwningCostCenterObjectFilter OCCFindInIn) {
    super(id, context, "OwningCostCenterFind");
    OCCFindIn = OCCFindInIn;
  }

  public void translateToMap() {
    if (OCCFindIn != null) {
      Integer index =  OCCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(OCCFindIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }


/**
 *
 * Sets the OwningCostCenter
 * @param OCCFindInIn Value of the OCCFindIn
 *
 */

  public void setOwningCostCenter(OwningCostCenterObjectFilter OCCFindInIn) {
    OCCFindIn = OCCFindInIn;
  }

  public void translateFromMap() {
    OCCFindIn = OwningCostCenterObjectHelper.fromMapFilter(inputMap, "OwningCostCenter");
  }

/**
 *
 * Gets the OwningCostCenter
 * @return Value of the OwningCostCenter
 *
 */

  public OwningCostCenterObjectFilter getOwningCostCenter( ) {
    return OCCFindIn;
  }

}
