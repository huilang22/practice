/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineRefObjectData InvsLineRefCreateIn;
/**
 *
 * Constructor to create a  InvsLineRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectData InvsLineRefCreateInIn) {
    super(id, context, "InvsLineRefCreate");
    InvsLineRefCreateIn = InvsLineRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsLineRefCreateIn != null) {
      InvsLineRefCreateIn.resetFlags(true, true);
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefCreateIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }


/**
 *
 * Sets the InvsLineRef
 * @param InvsLineRefCreateInIn Value of the InvsLineRefCreateIn
 *
 */

  public void setInvsLineRef(InvsLineRefObjectData InvsLineRefCreateInIn) {
    InvsLineRefCreateIn = InvsLineRefCreateInIn;
  }

  public void translateFromMap() {
    InvsLineRefCreateIn = InvsLineRefObjectHelper.fromMap(inputMap, "InvsLineRef");
  }

/**
 *
 * Gets the InvsLineRef
 * @return Value of the InvsLineRef
 *
 */

  public InvsLineRefObjectData getInvsLineRef( ) {
    return InvsLineRefCreateIn;
  }

}
