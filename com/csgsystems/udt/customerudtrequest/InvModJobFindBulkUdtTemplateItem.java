/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobFindBulkUdtTemplateItem.java
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
 * Class used to create a InvModJobFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvModJobFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvModJobObjectFilter InvModJobFindIn;
/**
 *
 * Constructor to create a  InvModJobFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvModJobFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvModJobObjectFilter InvModJobFindInIn) {
    super(id, context, "InvModJobFind");
    InvModJobFindIn = InvModJobFindInIn;
  }

  public void translateToMap() {
    if (InvModJobFindIn != null) {
      Integer index =  InvModJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvModJob", InvModJobObjectHelper.toMap(InvModJobFindIn, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }


/**
 *
 * Sets the InvModJob
 * @param InvModJobFindInIn Value of the InvModJobFindIn
 *
 */

  public void setInvModJob(InvModJobObjectFilter InvModJobFindInIn) {
    InvModJobFindIn = InvModJobFindInIn;
  }

  public void translateFromMap() {
    InvModJobFindIn = InvModJobObjectHelper.fromMapFilter(inputMap, "InvModJob");
  }

/**
 *
 * Gets the InvModJob
 * @return Value of the InvModJob
 *
 */

  public InvModJobObjectFilter getInvModJob( ) {
    return InvModJobFindIn;
  }

}
