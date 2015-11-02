/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationRefObjectData InvsLocationRefUpdateIn;
/**
 *
 * Constructor to create a  InvsLocationRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectData InvsLocationRefUpdateInIn) {
    super(id, context, "InvsLocationRefUpdate");
    InvsLocationRefUpdateIn = InvsLocationRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLocationRefUpdateIn != null) {
      InvsLocationRefUpdateIn.resetFlags(true, true);
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefUpdateIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }


/**
 *
 * Sets the InvsLocationRef
 * @param InvsLocationRefUpdateInIn Value of the InvsLocationRefUpdateIn
 *
 */

  public void setInvsLocationRef(InvsLocationRefObjectData InvsLocationRefUpdateInIn) {
    InvsLocationRefUpdateIn = InvsLocationRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsLocationRefUpdateIn = InvsLocationRefObjectHelper.fromMap(inputMap, "InvsLocationRef");
  }

/**
 *
 * Gets the InvsLocationRef
 * @return Value of the InvsLocationRef
 *
 */

  public InvsLocationRefObjectData getInvsLocationRef( ) {
    return InvsLocationRefUpdateIn;
  }

}
