/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorRefObjectKeyData InvsVendorRefGetIn;
/**
 *
 * Constructor to create a  InvsVendorRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectKeyData InvsVendorRefGetInIn) {
    super(id, context, "InvsVendorRefGet");
    InvsVendorRefGetIn = InvsVendorRefGetInIn;
  }

  public void translateToMap() {
    if (InvsVendorRefGetIn != null) {
      InvsVendorRefGetIn.resetFlags(true, true);
      addInput("InvsVendorRef", InvsVendorRefObjectKeyHelper.toMap(InvsVendorRefGetIn, new HashMap(), "InvsVendorRefObjectKeyData").get("InvsVendorRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsVendorRef
 * @param InvsVendorRefGetInIn Value of the InvsVendorRefGetIn
 *
 */

  public void setInvsVendorRef(InvsVendorRefObjectKeyData InvsVendorRefGetInIn) {
    InvsVendorRefGetIn = InvsVendorRefGetInIn;
  }

  public void translateFromMap() {
    InvsVendorRefGetIn = InvsVendorRefObjectKeyHelper.fromMap(inputMap, "InvsVendorRef");
  }

/**
 *
 * Gets the InvsVendorRef
 * @return Value of the InvsVendorRef
 *
 */

  public InvsVendorRefObjectKeyData getInvsVendorRef( ) {
    return InvsVendorRefGetIn;
  }

}
