/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVanityGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsVanityGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVanityGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVanityObjectKeyData InvsVanityGetIn;
/**
 *
 * Constructor to create a  InvsVanityGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVanityGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVanityObjectKeyData InvsVanityGetInIn) {
    super(id, context, "InvsVanityGet");
    InvsVanityGetIn = InvsVanityGetInIn;
  }

  public void translateToMap() {
    if (InvsVanityGetIn != null) {
      InvsVanityGetIn.resetFlags(true, true);
      addInput("InvsVanity", InvsVanityObjectKeyHelper.toMap(InvsVanityGetIn, new HashMap(), "InvsVanityObjectKeyData").get("InvsVanityObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsVanity
 * @param InvsVanityGetInIn Value of the InvsVanityGetIn
 *
 */

  public void setInvsVanity(InvsVanityObjectKeyData InvsVanityGetInIn) {
    InvsVanityGetIn = InvsVanityGetInIn;
  }

  public void translateFromMap() {
    InvsVanityGetIn = InvsVanityObjectKeyHelper.fromMap(inputMap, "InvsVanity");
  }

/**
 *
 * Gets the InvsVanity
 * @return Value of the InvsVanity
 *
 */

  public InvsVanityObjectKeyData getInvsVanity( ) {
    return InvsVanityGetIn;
  }

}
