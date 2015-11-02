/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationObjectFilter InvsLocationFindIn;
/**
 *
 * Constructor to create a  InvsLocationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationObjectFilter InvsLocationFindInIn) {
    super(id, context, "InvsLocationFind");
    InvsLocationFindIn = InvsLocationFindInIn;
  }

  public void translateToMap() {
    if (InvsLocationFindIn != null) {
      Integer index =  InvsLocationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(InvsLocationFindIn, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }


/**
 *
 * Sets the InvsLocation
 * @param InvsLocationFindInIn Value of the InvsLocationFindIn
 *
 */

  public void setInvsLocation(InvsLocationObjectFilter InvsLocationFindInIn) {
    InvsLocationFindIn = InvsLocationFindInIn;
  }

  public void translateFromMap() {
    InvsLocationFindIn = InvsLocationObjectHelper.fromMapFilter(inputMap, "InvsLocation");
  }

/**
 *
 * Gets the InvsLocation
 * @return Value of the InvsLocation
 *
 */

  public InvsLocationObjectFilter getInvsLocation( ) {
    return InvsLocationFindIn;
  }

}
