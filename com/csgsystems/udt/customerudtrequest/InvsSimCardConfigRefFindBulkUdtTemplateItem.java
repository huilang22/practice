/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigRefObjectFilter InvsSimCardConfigRefFindIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectFilter InvsSimCardConfigRefFindInIn) {
    super(id, context, "InvsSimCardConfigRefFind");
    InvsSimCardConfigRefFindIn = InvsSimCardConfigRefFindInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigRefFindIn != null) {
      Integer index =  InvsSimCardConfigRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefFindIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfigRef
 * @param InvsSimCardConfigRefFindInIn Value of the InvsSimCardConfigRefFindIn
 *
 */

  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectFilter InvsSimCardConfigRefFindInIn) {
    InvsSimCardConfigRefFindIn = InvsSimCardConfigRefFindInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigRefFindIn = InvsSimCardConfigRefObjectHelper.fromMapFilter(inputMap, "InvsSimCardConfigRef");
  }

/**
 *
 * Gets the InvsSimCardConfigRef
 * @return Value of the InvsSimCardConfigRef
 *
 */

  public InvsSimCardConfigRefObjectFilter getInvsSimCardConfigRef( ) {
    return InvsSimCardConfigRefFindIn;
  }

}
