/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobErrorFindBulkUdtTemplateItem.java
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
 * Class used to create a InvJobErrorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobErrorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobErrorObjectFilter InvJobErrorFindIn;
/**
 *
 * Constructor to create a  InvJobErrorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobErrorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobErrorObjectFilter InvJobErrorFindInIn) {
    super(id, context, "InvJobErrorFind");
    InvJobErrorFindIn = InvJobErrorFindInIn;
  }

  public void translateToMap() {
    if (InvJobErrorFindIn != null) {
      Integer index =  InvJobErrorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(InvJobErrorFindIn, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }


/**
 *
 * Sets the InvJobError
 * @param InvJobErrorFindInIn Value of the InvJobErrorFindIn
 *
 */

  public void setInvJobError(InvJobErrorObjectFilter InvJobErrorFindInIn) {
    InvJobErrorFindIn = InvJobErrorFindInIn;
  }

  public void translateFromMap() {
    InvJobErrorFindIn = InvJobErrorObjectHelper.fromMapFilter(inputMap, "InvJobError");
  }

/**
 *
 * Gets the InvJobError
 * @return Value of the InvJobError
 *
 */

  public InvJobErrorObjectFilter getInvJobError( ) {
    return InvJobErrorFindIn;
  }

}
