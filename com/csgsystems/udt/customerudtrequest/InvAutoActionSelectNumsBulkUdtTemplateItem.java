/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoActionSelectNumsBulkUdtTemplateItem.java
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
 * Class used to create a InvAutoActionSelectNumsBulkUdtTemplateItem Bulk Template
 *
 */

public class InvAutoActionSelectNumsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvAutoActionSelectNumsObjData InvAutoActionSelectNumsIn;
/**
 *
 * Constructor to create a  InvAutoActionSelectNumsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvAutoActionSelectNumsBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionSelectNumsObjData InvAutoActionSelectNumsInIn) {
    super(id, context, "InvAutoActionSelectNums");
    InvAutoActionSelectNumsIn = InvAutoActionSelectNumsInIn;
  }

  public void translateToMap() {
    if (InvAutoActionSelectNumsIn != null) {
      InvAutoActionSelectNumsIn.resetFlags(true, true);
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(InvAutoActionSelectNumsIn, new HashMap(), "InvAutoActionSelectNumsOutputData").get("InvAutoActionSelectNumsOutputData"));
    }
  }


/**
 *
 * Sets the InvAutoAction
 * @param InvAutoActionSelectNumsInIn Value of the InvAutoActionSelectNumsIn
 *
 */

  public void setInvAutoAction(InvAutoActionSelectNumsObjData InvAutoActionSelectNumsInIn) {
    InvAutoActionSelectNumsIn = InvAutoActionSelectNumsInIn;
  }

  public void translateFromMap() {
    InvAutoActionSelectNumsIn = InvAutoActionSelectNumsObjHelper.fromMap(inputMap, "InvAutoAction");
  }

/**
 *
 * Gets the InvAutoAction
 * @return Value of the InvAutoAction
 *
 */

  public InvAutoActionSelectNumsObjData getInvAutoAction( ) {
    return InvAutoActionSelectNumsIn;
  }

}
