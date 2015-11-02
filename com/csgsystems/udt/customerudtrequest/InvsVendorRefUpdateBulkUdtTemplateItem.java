/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorRefObjectData InvsVendorRefUpdateIn;
/**
 *
 * Constructor to create a  InvsVendorRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectData InvsVendorRefUpdateInIn) {
    super(id, context, "InvsVendorRefUpdate");
    InvsVendorRefUpdateIn = InvsVendorRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsVendorRefUpdateIn != null) {
      InvsVendorRefUpdateIn.resetFlags(true, true);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefUpdateIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }


/**
 *
 * Sets the InvsVendorRef
 * @param InvsVendorRefUpdateInIn Value of the InvsVendorRefUpdateIn
 *
 */

  public void setInvsVendorRef(InvsVendorRefObjectData InvsVendorRefUpdateInIn) {
    InvsVendorRefUpdateIn = InvsVendorRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsVendorRefUpdateIn = InvsVendorRefObjectHelper.fromMap(inputMap, "InvsVendorRef");
  }

/**
 *
 * Gets the InvsVendorRef
 * @return Value of the InvsVendorRef
 *
 */

  public InvsVendorRefObjectData getInvsVendorRef( ) {
    return InvsVendorRefUpdateIn;
  }

}
