/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsOperatorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsOperatorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsOperatorObjectData InvsOperatorUpdateIn;
/**
 *
 * Constructor to create a  InvsOperatorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsOperatorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectData InvsOperatorUpdateInIn) {
    super(id, context, "InvsOperatorUpdate");
    InvsOperatorUpdateIn = InvsOperatorUpdateInIn;
  }

  public void translateToMap() {
    if (InvsOperatorUpdateIn != null) {
      InvsOperatorUpdateIn.resetFlags(true, true);
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorUpdateIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }


/**
 *
 * Sets the InvsOperator
 * @param InvsOperatorUpdateInIn Value of the InvsOperatorUpdateIn
 *
 */

  public void setInvsOperator(InvsOperatorObjectData InvsOperatorUpdateInIn) {
    InvsOperatorUpdateIn = InvsOperatorUpdateInIn;
  }

  public void translateFromMap() {
    InvsOperatorUpdateIn = InvsOperatorObjectHelper.fromMap(inputMap, "InvsOperator");
  }

/**
 *
 * Gets the InvsOperator
 * @return Value of the InvsOperator
 *
 */

  public InvsOperatorObjectData getInvsOperator( ) {
    return InvsOperatorUpdateIn;
  }

}
