/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdMainGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdMainGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdMainObjectKeyData InvdMainGetIn;
/**
 *
 * Constructor to create a  InvdMainGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdMainGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainObjectKeyData InvdMainGetInIn) {
    super(id, context, "InvdMainGet");
    InvdMainGetIn = InvdMainGetInIn;
  }

  public void translateToMap() {
    if (InvdMainGetIn != null) {
      InvdMainGetIn.resetFlags(true, true);
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(InvdMainGetIn, new HashMap(), "InvdMainObjectKeyData").get("InvdMainObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdMain
 * @param InvdMainGetInIn Value of the InvdMainGetIn
 *
 */

  public void setInvdMain(InvdMainObjectKeyData InvdMainGetInIn) {
    InvdMainGetIn = InvdMainGetInIn;
  }

  public void translateFromMap() {
    InvdMainGetIn = InvdMainObjectKeyHelper.fromMap(inputMap, "InvdMain");
  }

/**
 *
 * Gets the InvdMain
 * @return Value of the InvdMain
 *
 */

  public InvdMainObjectKeyData getInvdMain( ) {
    return InvdMainGetIn;
  }

}
