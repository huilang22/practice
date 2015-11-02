/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceObjectData InvsInterfaceUpdateIn;
/**
 *
 * Constructor to create a  InvsInterfaceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectData InvsInterfaceUpdateInIn) {
    super(id, context, "InvsInterfaceUpdate");
    InvsInterfaceUpdateIn = InvsInterfaceUpdateInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceUpdateIn != null) {
      InvsInterfaceUpdateIn.resetFlags(true, true);
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceUpdateIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }


/**
 *
 * Sets the InvsInterface
 * @param InvsInterfaceUpdateInIn Value of the InvsInterfaceUpdateIn
 *
 */

  public void setInvsInterface(InvsInterfaceObjectData InvsInterfaceUpdateInIn) {
    InvsInterfaceUpdateIn = InvsInterfaceUpdateInIn;
  }

  public void translateFromMap() {
    InvsInterfaceUpdateIn = InvsInterfaceObjectHelper.fromMap(inputMap, "InvsInterface");
  }

/**
 *
 * Gets the InvsInterface
 * @return Value of the InvsInterface
 *
 */

  public InvsInterfaceObjectData getInvsInterface( ) {
    return InvsInterfaceUpdateIn;
  }

}
