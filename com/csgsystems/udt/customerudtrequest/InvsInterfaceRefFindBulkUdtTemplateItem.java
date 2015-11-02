/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceRefObjectFilter InvsInterfaceRefFindIn;
/**
 *
 * Constructor to create a  InvsInterfaceRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectFilter InvsInterfaceRefFindInIn) {
    super(id, context, "InvsInterfaceRefFind");
    InvsInterfaceRefFindIn = InvsInterfaceRefFindInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceRefFindIn != null) {
      Integer index =  InvsInterfaceRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefFindIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }


/**
 *
 * Sets the InvsInterfaceRef
 * @param InvsInterfaceRefFindInIn Value of the InvsInterfaceRefFindIn
 *
 */

  public void setInvsInterfaceRef(InvsInterfaceRefObjectFilter InvsInterfaceRefFindInIn) {
    InvsInterfaceRefFindIn = InvsInterfaceRefFindInIn;
  }

  public void translateFromMap() {
    InvsInterfaceRefFindIn = InvsInterfaceRefObjectHelper.fromMapFilter(inputMap, "InvsInterfaceRef");
  }

/**
 *
 * Gets the InvsInterfaceRef
 * @return Value of the InvsInterfaceRef
 *
 */

  public InvsInterfaceRefObjectFilter getInvsInterfaceRef( ) {
    return InvsInterfaceRefFindIn;
  }

}
