/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationRefObjectFilter InvsLocationRefFindIn;
/**
 *
 * Constructor to create a  InvsLocationRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectFilter InvsLocationRefFindInIn) {
    super(id, context, "InvsLocationRefFind");
    InvsLocationRefFindIn = InvsLocationRefFindInIn;
  }

  public void translateToMap() {
    if (InvsLocationRefFindIn != null) {
      Integer index =  InvsLocationRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefFindIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }


/**
 *
 * Sets the InvsLocationRef
 * @param InvsLocationRefFindInIn Value of the InvsLocationRefFindIn
 *
 */

  public void setInvsLocationRef(InvsLocationRefObjectFilter InvsLocationRefFindInIn) {
    InvsLocationRefFindIn = InvsLocationRefFindInIn;
  }

  public void translateFromMap() {
    InvsLocationRefFindIn = InvsLocationRefObjectHelper.fromMapFilter(inputMap, "InvsLocationRef");
  }

/**
 *
 * Gets the InvsLocationRef
 * @return Value of the InvsLocationRef
 *
 */

  public InvsLocationRefObjectFilter getInvsLocationRef( ) {
    return InvsLocationRefFindIn;
  }

}
