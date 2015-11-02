/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsOperatorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsOperatorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsOperatorObjectFilter InvsOperatorFindIn;
/**
 *
 * Constructor to create a  InvsOperatorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsOperatorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsOperatorObjectFilter InvsOperatorFindInIn) {
    super(id, context, "InvsOperatorFind");
    InvsOperatorFindIn = InvsOperatorFindInIn;
  }

  public void translateToMap() {
    if (InvsOperatorFindIn != null) {
      Integer index =  InvsOperatorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(InvsOperatorFindIn, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }


/**
 *
 * Sets the InvsOperator
 * @param InvsOperatorFindInIn Value of the InvsOperatorFindIn
 *
 */

  public void setInvsOperator(InvsOperatorObjectFilter InvsOperatorFindInIn) {
    InvsOperatorFindIn = InvsOperatorFindInIn;
  }

  public void translateFromMap() {
    InvsOperatorFindIn = InvsOperatorObjectHelper.fromMapFilter(inputMap, "InvsOperator");
  }

/**
 *
 * Gets the InvsOperator
 * @return Value of the InvsOperator
 *
 */

  public InvsOperatorObjectFilter getInvsOperator( ) {
    return InvsOperatorFindIn;
  }

}
