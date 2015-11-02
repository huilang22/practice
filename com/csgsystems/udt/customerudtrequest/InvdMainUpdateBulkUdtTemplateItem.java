/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectData InvdMainUpdateIn;
/**
 *
 * Constructor to create a  InvdMainUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectData InvdMainUpdateInIn) {
    super(id, context, "InvdMainUpdate");
    InvdMainUpdateIn = InvdMainUpdateInIn;
  }

  public void translateToMap() {
    if (InvdMainUpdateIn != null) {
      InvdMainUpdateIn.resetFlags(true, true);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainUpdateIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param InvdMainUpdateInIn Value of the InvdMainUpdateIn
 *
 */

  public void setInvdMain(InvdMainObjectData InvdMainUpdateInIn) {
    InvdMainUpdateIn = InvdMainUpdateInIn;
  }

  public void translateFromMap() {
    InvdMainUpdateIn = InvdMainObjectHelper.fromMap(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectData getInvdMain( ) {
    return InvdMainUpdateIn;
  }

}
