/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigRefObjectData InvsSimCardConfigRefUpdateIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectData InvsSimCardConfigRefUpdateInIn) {
    super(id, context, "InvsSimCardConfigRefUpdate");
    InvsSimCardConfigRefUpdateIn = InvsSimCardConfigRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigRefUpdateIn != null) {
      InvsSimCardConfigRefUpdateIn.resetFlags(true, true);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(InvsSimCardConfigRefUpdateIn, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfigRef
 * @param InvsSimCardConfigRefUpdateInIn Value of the InvsSimCardConfigRefUpdateIn
 *
 */

  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectData InvsSimCardConfigRefUpdateInIn) {
    InvsSimCardConfigRefUpdateIn = InvsSimCardConfigRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigRefUpdateIn = InvsSimCardConfigRefObjectHelper.fromMap(inputMap, "InvsSimCardConfigRef");
  }

/**
 *
 * Gets the InvsSimCardConfigRef
 * @return Value of the InvsSimCardConfigRef
 *
 */

  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRef( ) {
    return InvsSimCardConfigRefUpdateIn;
  }

}
