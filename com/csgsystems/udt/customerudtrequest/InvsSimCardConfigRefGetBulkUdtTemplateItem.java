/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetInIn) {
    super(id, context, "InvsSimCardConfigRefGet");
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefGetInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigRefGetIn != null) {
      InvsSimCardConfigRefGetIn.resetFlags(true, true);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectKeyHelper.toMap(InvsSimCardConfigRefGetIn, new HashMap(), "InvsSimCardConfigRefObjectKeyData").get("InvsSimCardConfigRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfigRef
 * @param InvsSimCardConfigRefGetInIn Value of the InvsSimCardConfigRefGetIn
 *
 */

  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetInIn) {
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefGetInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefObjectKeyHelper.fromMap(inputMap, "InvsSimCardConfigRef");
  }

/**
 *
 * Gets the InvsSimCardConfigRef
 * @return Value of the InvsSimCardConfigRef
 *
 */

  public InvsSimCardConfigRefObjectKeyData getInvsSimCardConfigRef( ) {
    return InvsSimCardConfigRefGetIn;
  }

}
