/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceRefObjectKeyData InvsInterfaceRefGetIn;
/**
 *
 * Constructor to create a  InvsInterfaceRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectKeyData InvsInterfaceRefGetInIn) {
    super(id, context, "InvsInterfaceRefGet");
    InvsInterfaceRefGetIn = InvsInterfaceRefGetInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceRefGetIn != null) {
      InvsInterfaceRefGetIn.resetFlags(true, true);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectKeyHelper.toMap(InvsInterfaceRefGetIn, new HashMap(), "InvsInterfaceRefObjectKeyData").get("InvsInterfaceRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsInterfaceRef
 * @param InvsInterfaceRefGetInIn Value of the InvsInterfaceRefGetIn
 *
 */

  public void setInvsInterfaceRef(InvsInterfaceRefObjectKeyData InvsInterfaceRefGetInIn) {
    InvsInterfaceRefGetIn = InvsInterfaceRefGetInIn;
  }

  public void translateFromMap() {
    InvsInterfaceRefGetIn = InvsInterfaceRefObjectKeyHelper.fromMap(inputMap, "InvsInterfaceRef");
  }

/**
 *
 * Gets the InvsInterfaceRef
 * @return Value of the InvsInterfaceRef
 *
 */

  public InvsInterfaceRefObjectKeyData getInvsInterfaceRef( ) {
    return InvsInterfaceRefGetIn;
  }

}
