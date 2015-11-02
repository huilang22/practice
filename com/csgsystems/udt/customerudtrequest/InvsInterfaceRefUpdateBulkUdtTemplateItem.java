/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceRefObjectData InvsInterfaceRefUpdateIn;
/**
 *
 * Constructor to create a  InvsInterfaceRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectData InvsInterfaceRefUpdateInIn) {
    super(id, context, "InvsInterfaceRefUpdate");
    InvsInterfaceRefUpdateIn = InvsInterfaceRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceRefUpdateIn != null) {
      InvsInterfaceRefUpdateIn.resetFlags(true, true);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefUpdateIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }


/**
 *
 * Sets the InvsInterfaceRef
 * @param InvsInterfaceRefUpdateInIn Value of the InvsInterfaceRefUpdateIn
 *
 */

  public void setInvsInterfaceRef(InvsInterfaceRefObjectData InvsInterfaceRefUpdateInIn) {
    InvsInterfaceRefUpdateIn = InvsInterfaceRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsInterfaceRefUpdateIn = InvsInterfaceRefObjectHelper.fromMap(inputMap, "InvsInterfaceRef");
  }

/**
 *
 * Gets the InvsInterfaceRef
 * @return Value of the InvsInterfaceRef
 *
 */

  public InvsInterfaceRefObjectData getInvsInterfaceRef( ) {
    return InvsInterfaceRefUpdateIn;
  }

}
