/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobCountBulkUdtTemplateItem.java
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
 * Class used to create a InvModJobCountBulkUdtTemplateItem Bulk Template
 *
 */

public class InvModJobCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvModJobObjectData InvModJobCountIn;
/**
 *
 * Constructor to create a  InvModJobCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvModJobCountBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectData InvModJobCountInIn) {
    super(id, context, "InvModJobCount");
    InvModJobCountIn = InvModJobCountInIn;
  }

  public void translateToMap() {
    if (InvModJobCountIn != null) {
      InvModJobCountIn.resetFlags(true, true);
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobCountIn, new HashMap(), "InvModJobCountOutputData").get("InvModJobCountOutputData"));
    }
  }


/**
 *
 * Sets the InvModJob
 * @param InvModJobCountInIn Value of the InvModJobCountIn
 *
 */

  public void setInvModJob(InvModJobObjectData InvModJobCountInIn) {
    InvModJobCountIn = InvModJobCountInIn;
  }

  public void translateFromMap() {
    InvModJobCountIn = InvModJobObjectHelper.fromMap(inputMap, "InvModJob");
  }

/**
 *
 * Gets the InvModJob
 * @return Value of the InvModJob
 *
 */

  public InvModJobObjectData getInvModJob( ) {
    return InvModJobCountIn;
  }

}
