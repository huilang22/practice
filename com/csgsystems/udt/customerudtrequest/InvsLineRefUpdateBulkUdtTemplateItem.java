/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineRefObjectData InvsLineRefUpdateIn;
/**
 *
 * Constructor to create a  InvsLineRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectData InvsLineRefUpdateInIn) {
    super(id, context, "InvsLineRefUpdate");
    InvsLineRefUpdateIn = InvsLineRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLineRefUpdateIn != null) {
      InvsLineRefUpdateIn.resetFlags(true, true);
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(InvsLineRefUpdateIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }


/**
 *
 * Sets the InvsLineRef
 * @param InvsLineRefUpdateInIn Value of the InvsLineRefUpdateIn
 *
 */

  public void setInvsLineRef(InvsLineRefObjectData InvsLineRefUpdateInIn) {
    InvsLineRefUpdateIn = InvsLineRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsLineRefUpdateIn = InvsLineRefObjectHelper.fromMap(inputMap, "InvsLineRef");
  }

/**
 *
 * Gets the InvsLineRef
 * @return Value of the InvsLineRef
 *
 */

  public InvsLineRefObjectData getInvsLineRef( ) {
    return InvsLineRefUpdateIn;
  }

}
