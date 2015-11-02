/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobFindBulkUdtTemplateItem.java
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
 * Class used to create a InvSimJobFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimJobFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimJobObjectFilter InvSimJobFindIn;
/**
 *
 * Constructor to create a  InvSimJobFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimJobFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobObjectFilter InvSimJobFindInIn) {
    super(id, context, "InvSimJobFind");
    InvSimJobFindIn = InvSimJobFindInIn;
  }

  public void translateToMap() {
    if (InvSimJobFindIn != null) {
      Integer index =  InvSimJobFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(InvSimJobFindIn, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }


/**
 *
 * Sets the InvSimJob
 * @param InvSimJobFindInIn Value of the InvSimJobFindIn
 *
 */

  public void setInvSimJob(InvSimJobObjectFilter InvSimJobFindInIn) {
    InvSimJobFindIn = InvSimJobFindInIn;
  }

  public void translateFromMap() {
    InvSimJobFindIn = InvSimJobObjectHelper.fromMapFilter(inputMap, "InvSimJob");
  }

/**
 *
 * Gets the InvSimJob
 * @return Value of the InvSimJob
 *
 */

  public InvSimJobObjectFilter getInvSimJob( ) {
    return InvSimJobFindIn;
  }

}
