/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobGetBulkUdtTemplateItem.java
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
 * Class used to create a InvJobGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvJobGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvJobObjectKeyData InvJobGetIn;
/**
 *
 * Constructor to create a  InvJobGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvJobGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobObjectKeyData InvJobGetInIn) {
    super(id, context, "InvJobGet");
    InvJobGetIn = InvJobGetInIn;
  }

  public void translateToMap() {
    if (InvJobGetIn != null) {
      InvJobGetIn.resetFlags(true, true);
      addInput("InvJob", InvJobObjectKeyHelper.toMap(InvJobGetIn, new HashMap(), "InvJobObjectKeyData").get("InvJobObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvJob
 * @param InvJobGetInIn Value of the InvJobGetIn
 *
 */

  public void setInvJob(InvJobObjectKeyData InvJobGetInIn) {
    InvJobGetIn = InvJobGetInIn;
  }

  public void translateFromMap() {
    InvJobGetIn = InvJobObjectKeyHelper.fromMap(inputMap, "InvJob");
  }

/**
 *
 * Gets the InvJob
 * @return Value of the InvJob
 *
 */

  public InvJobObjectKeyData getInvJob( ) {
    return InvJobGetIn;
  }

}
