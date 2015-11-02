/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobGetBulkUdtTemplateItem.java
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
 * Class used to create a InvSimJobGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimJobGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimJobObjectKeyData InvSimJobGetIn;
/**
 *
 * Constructor to create a  InvSimJobGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimJobGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimJobObjectKeyData InvSimJobGetInIn) {
    super(id, context, "InvSimJobGet");
    InvSimJobGetIn = InvSimJobGetInIn;
  }

  public void translateToMap() {
    if (InvSimJobGetIn != null) {
      InvSimJobGetIn.resetFlags(true, true);
      addInput("InvSimJob", InvSimJobObjectKeyHelper.toMap(InvSimJobGetIn, new HashMap(), "InvSimJobObjectKeyData").get("InvSimJobObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvSimJob
 * @param InvSimJobGetInIn Value of the InvSimJobGetIn
 *
 */

  public void setInvSimJob(InvSimJobObjectKeyData InvSimJobGetInIn) {
    InvSimJobGetIn = InvSimJobGetInIn;
  }

  public void translateFromMap() {
    InvSimJobGetIn = InvSimJobObjectKeyHelper.fromMap(inputMap, "InvSimJob");
  }

/**
 *
 * Gets the InvSimJob
 * @return Value of the InvSimJob
 *
 */

  public InvSimJobObjectKeyData getInvSimJob( ) {
    return InvSimJobGetIn;
  }

}
