/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationObjectKeyData InvsLocationGetIn;
/**
 *
 * Constructor to create a  InvsLocationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectKeyData InvsLocationGetInIn) {
    super(id, context, "InvsLocationGet");
    InvsLocationGetIn = InvsLocationGetInIn;
  }

  public void translateToMap() {
    if (InvsLocationGetIn != null) {
      InvsLocationGetIn.resetFlags(true, true);
      addInput("InvsLocation", InvsLocationObjectKeyHelper.toMap(InvsLocationGetIn, new HashMap(), "InvsLocationObjectKeyData").get("InvsLocationObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocation
 * @param InvsLocationGetInIn Value of the InvsLocationGetIn
 *
 */

  public void setInvsLocation(InvsLocationObjectKeyData InvsLocationGetInIn) {
    InvsLocationGetIn = InvsLocationGetInIn;
  }

  public void translateFromMap() {
    InvsLocationGetIn = InvsLocationObjectKeyHelper.fromMap(inputMap, "InvsLocation");
  }

/**
 *
 * Gets the InvsLocation
 * @return Value of the InvsLocation
 *
 */

  public InvsLocationObjectKeyData getInvsLocation( ) {
    return InvsLocationGetIn;
  }

}
