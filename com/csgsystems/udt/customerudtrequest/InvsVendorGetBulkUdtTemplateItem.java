/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorObjectKeyData InvsVendorGetIn;
/**
 *
 * Constructor to create a  InvsVendorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectKeyData InvsVendorGetInIn) {
    super(id, context, "InvsVendorGet");
    InvsVendorGetIn = InvsVendorGetInIn;
  }

  public void translateToMap() {
    if (InvsVendorGetIn != null) {
      InvsVendorGetIn.resetFlags(true, true);
      addInput("InvsVendor", InvsVendorObjectKeyHelper.toMap(InvsVendorGetIn, new HashMap(), "InvsVendorObjectKeyData").get("InvsVendorObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsVendor
 * @param InvsVendorGetInIn Value of the InvsVendorGetIn
 *
 */

  public void setInvsVendor(InvsVendorObjectKeyData InvsVendorGetInIn) {
    InvsVendorGetIn = InvsVendorGetInIn;
  }

  public void translateFromMap() {
    InvsVendorGetIn = InvsVendorObjectKeyHelper.fromMap(inputMap, "InvsVendor");
  }

/**
 *
 * Gets the InvsVendor
 * @return Value of the InvsVendor
 *
 */

  public InvsVendorObjectKeyData getInvsVendor( ) {
    return InvsVendorGetIn;
  }

}
