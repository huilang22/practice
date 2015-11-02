/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationRefObjectData InvsLocationRefCreateIn;
/**
 *
 * Constructor to create a  InvsLocationRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectData InvsLocationRefCreateInIn) {
    super(id, context, "InvsLocationRefCreate");
    InvsLocationRefCreateIn = InvsLocationRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsLocationRefCreateIn != null) {
      InvsLocationRefCreateIn.resetFlags(true, true);
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefCreateIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }


/**
 *
 * Sets the InvsLocationRef
 * @param InvsLocationRefCreateInIn Value of the InvsLocationRefCreateIn
 *
 */

  public void setInvsLocationRef(InvsLocationRefObjectData InvsLocationRefCreateInIn) {
    InvsLocationRefCreateIn = InvsLocationRefCreateInIn;
  }

  public void translateFromMap() {
    InvsLocationRefCreateIn = InvsLocationRefObjectHelper.fromMap(inputMap, "InvsLocationRef");
  }

/**
 *
 * Gets the InvsLocationRef
 * @return Value of the InvsLocationRef
 *
 */

  public InvsLocationRefObjectData getInvsLocationRef( ) {
    return InvsLocationRefCreateIn;
  }

}
