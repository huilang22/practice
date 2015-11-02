/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsOperatorGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsOperatorGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsOperatorObjectKeyData InvsOperatorGetIn;
/**
 *
 * Constructor to create a  InvsOperatorGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsOperatorGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectKeyData InvsOperatorGetInIn) {
    super(id, context, "InvsOperatorGet");
    InvsOperatorGetIn = InvsOperatorGetInIn;
  }

  public void translateToMap() {
    if (InvsOperatorGetIn != null) {
      InvsOperatorGetIn.resetFlags(true, true);
      addInput("InvsOperator", InvsOperatorObjectKeyHelper.toMap(InvsOperatorGetIn, new HashMap(), "InvsOperatorObjectKeyData").get("InvsOperatorObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsOperator
 * @param InvsOperatorGetInIn Value of the InvsOperatorGetIn
 *
 */

  public void setInvsOperator(InvsOperatorObjectKeyData InvsOperatorGetInIn) {
    InvsOperatorGetIn = InvsOperatorGetInIn;
  }

  public void translateFromMap() {
    InvsOperatorGetIn = InvsOperatorObjectKeyHelper.fromMap(inputMap, "InvsOperator");
  }

/**
 *
 * Gets the InvsOperator
 * @return Value of the InvsOperator
 *
 */

  public InvsOperatorObjectKeyData getInvsOperator( ) {
    return InvsOperatorGetIn;
  }

}
