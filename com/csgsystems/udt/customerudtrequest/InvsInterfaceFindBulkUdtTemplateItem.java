/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceObjectFilter InvsInterfaceFindIn;
/**
 *
 * Constructor to create a  InvsInterfaceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectFilter InvsInterfaceFindInIn) {
    super(id, context, "InvsInterfaceFind");
    InvsInterfaceFindIn = InvsInterfaceFindInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceFindIn != null) {
      Integer index =  InvsInterfaceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(InvsInterfaceFindIn, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }


/**
 *
 * Sets the InvsInterface
 * @param InvsInterfaceFindInIn Value of the InvsInterfaceFindIn
 *
 */

  public void setInvsInterface(InvsInterfaceObjectFilter InvsInterfaceFindInIn) {
    InvsInterfaceFindIn = InvsInterfaceFindInIn;
  }

  public void translateFromMap() {
    InvsInterfaceFindIn = InvsInterfaceObjectHelper.fromMapFilter(inputMap, "InvsInterface");
  }

/**
 *
 * Gets the InvsInterface
 * @return Value of the InvsInterface
 *
 */

  public InvsInterfaceObjectFilter getInvsInterface( ) {
    return InvsInterfaceFindIn;
  }

}
