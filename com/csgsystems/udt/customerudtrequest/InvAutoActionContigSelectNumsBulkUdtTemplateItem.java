/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoActionContigSelectNumsBulkUdtTemplateItem.java
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
 * Class used to create a InvAutoActionContigSelectNumsBulkUdtTemplateItem Bulk Template
 *
 */

public class InvAutoActionContigSelectNumsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvAutoActionSelectNumsObjData InvAutoActionContigSelectNumsIn;
/**
 *
 * Constructor to create a  InvAutoActionContigSelectNumsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvAutoActionContigSelectNumsBulkUdtTemplateItem(String id, BSDMSessionContext context, InvAutoActionSelectNumsObjData InvAutoActionContigSelectNumsInIn) {
    super(id, context, "InvAutoActionContigSelectNums");
    InvAutoActionContigSelectNumsIn = InvAutoActionContigSelectNumsInIn;
  }

  public void translateToMap() {
    if (InvAutoActionContigSelectNumsIn != null) {
      InvAutoActionContigSelectNumsIn.resetFlags(true, true);
      addInput("InvAutoAction", InvAutoActionSelectNumsObjHelper.toMap(InvAutoActionContigSelectNumsIn, new HashMap(), "InvAutoActionContigSelectNumsOutputData").get("InvAutoActionContigSelectNumsOutputData"));
    }
  }


/**
 *
 * Sets the InvAutoAction
 * @param InvAutoActionContigSelectNumsInIn Value of the InvAutoActionContigSelectNumsIn
 *
 */

  public void setInvAutoAction(InvAutoActionSelectNumsObjData InvAutoActionContigSelectNumsInIn) {
    InvAutoActionContigSelectNumsIn = InvAutoActionContigSelectNumsInIn;
  }

  public void translateFromMap() {
    InvAutoActionContigSelectNumsIn = InvAutoActionSelectNumsObjHelper.fromMap(inputMap, "InvAutoAction");
  }

/**
 *
 * Gets the InvAutoAction
 * @return Value of the InvAutoAction
 *
 */

  public InvAutoActionSelectNumsObjData getInvAutoAction( ) {
    return InvAutoActionContigSelectNumsIn;
  }

}
