/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceObjectData InvsInterfaceCreateIn;
/**
 *
 * Constructor to create a  InvsInterfaceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectData InvsInterfaceCreateInIn) {
    super(id, context, "InvsInterfaceCreate");
    InvsInterfaceCreateIn = InvsInterfaceCreateInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceCreateIn != null) {
      InvsInterfaceCreateIn.resetFlags(true, true);
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceCreateIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }


/**
 *
 * Sets the InvsInterface
 * @param InvsInterfaceCreateInIn Value of the InvsInterfaceCreateIn
 *
 */

  public void setInvsInterface(InvsInterfaceObjectData InvsInterfaceCreateInIn) {
    InvsInterfaceCreateIn = InvsInterfaceCreateInIn;
  }

  public void translateFromMap() {
    InvsInterfaceCreateIn = InvsInterfaceObjectHelper.fromMap(inputMap, "InvsInterface");
  }

/**
 *
 * Gets the InvsInterface
 * @return Value of the InvsInterface
 *
 */

  public InvsInterfaceObjectData getInvsInterface( ) {
    return InvsInterfaceCreateIn;
  }

}
