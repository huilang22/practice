/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvdViewsUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdViewsUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdViewsObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdViewsUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdViewsUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectData noOpInIn) {
    super(id, context, "InvdViewsUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(noOpIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
/**
 *
 * Sets the  InvdViews
 * @param noOpInIn InvdViewsObjectData to set
 *
 */
  public void setInvdViews(InvdViewsObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdViews passed into the constructor
 * @return Simulated response
 *
 */
  public InvdViewsObjectData getInvdViews() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdViewsObjectHelper.fromMap(inputMap, "InvdViews");
  }
}
