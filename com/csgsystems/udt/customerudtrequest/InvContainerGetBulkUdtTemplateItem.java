/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerGetBulkUdtTemplateItem.java
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
 * Class used to create a InvContainerGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvContainerGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvContainerObjectKeyData InvContainerGetIn;
/**
 *
 * Constructor to create a  InvContainerGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvContainerGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerObjectKeyData InvContainerGetInIn) {
    super(id, context, "InvContainerGet");
    InvContainerGetIn = InvContainerGetInIn;
  }

  public void translateToMap() {
    if (InvContainerGetIn != null) {
      InvContainerGetIn.resetFlags(true, true);
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(InvContainerGetIn, new HashMap(), "InvContainerObjectKeyData").get("InvContainerObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvContainer
 * @param InvContainerGetInIn Value of the InvContainerGetIn
 *
 */

  public void setInvContainer(InvContainerObjectKeyData InvContainerGetInIn) {
    InvContainerGetIn = InvContainerGetInIn;
  }

  public void translateFromMap() {
    InvContainerGetIn = InvContainerObjectKeyHelper.fromMap(inputMap, "InvContainer");
  }

/**
 *
 * Gets the InvContainer
 * @return Value of the InvContainer
 *
 */

  public InvContainerObjectKeyData getInvContainer( ) {
    return InvContainerGetIn;
  }

}
