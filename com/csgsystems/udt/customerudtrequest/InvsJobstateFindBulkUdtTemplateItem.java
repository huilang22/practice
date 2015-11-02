/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstateFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobstateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobstateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobstateObjectFilter InvsJobstateFindIn;
/**
 *
 * Constructor to create a  InvsJobstateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobstateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobstateObjectFilter InvsJobstateFindInIn) {
    super(id, context, "InvsJobstateFind");
    InvsJobstateFindIn = InvsJobstateFindInIn;
  }

  public void translateToMap() {
    if (InvsJobstateFindIn != null) {
      Integer index =  InvsJobstateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(InvsJobstateFindIn, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }


/**
 *
 * Sets the InvsJobstate
 * @param InvsJobstateFindInIn Value of the InvsJobstateFindIn
 *
 */

  public void setInvsJobstate(InvsJobstateObjectFilter InvsJobstateFindInIn) {
    InvsJobstateFindIn = InvsJobstateFindInIn;
  }

  public void translateFromMap() {
    InvsJobstateFindIn = InvsJobstateObjectHelper.fromMapFilter(inputMap, "InvsJobstate");
  }

/**
 *
 * Gets the InvsJobstate
 * @return Value of the InvsJobstate
 *
 */

  public InvsJobstateObjectFilter getInvsJobstate( ) {
    return InvsJobstateFindIn;
  }

}
