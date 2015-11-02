/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceObjectKeyData InvsInterfaceGetIn;
/**
 *
 * Constructor to create a  InvsInterfaceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectKeyData InvsInterfaceGetInIn) {
    super(id, context, "InvsInterfaceGet");
    InvsInterfaceGetIn = InvsInterfaceGetInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceGetIn != null) {
      InvsInterfaceGetIn.resetFlags(true, true);
      addInput("InvsInterface", InvsInterfaceObjectKeyHelper.toMap(InvsInterfaceGetIn, new HashMap(), "InvsInterfaceObjectKeyData").get("InvsInterfaceObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsInterface
 * @param InvsInterfaceGetInIn Value of the InvsInterfaceGetIn
 *
 */

  public void setInvsInterface(InvsInterfaceObjectKeyData InvsInterfaceGetInIn) {
    InvsInterfaceGetIn = InvsInterfaceGetInIn;
  }

  public void translateFromMap() {
    InvsInterfaceGetIn = InvsInterfaceObjectKeyHelper.fromMap(inputMap, "InvsInterface");
  }

/**
 *
 * Gets the InvsInterface
 * @return Value of the InvsInterface
 *
 */

  public InvsInterfaceObjectKeyData getInvsInterface( ) {
    return InvsInterfaceGetIn;
  }

}
