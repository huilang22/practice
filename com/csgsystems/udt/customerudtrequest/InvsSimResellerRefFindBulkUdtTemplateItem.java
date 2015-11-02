/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRefFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimResellerRefFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimResellerRefFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimResellerRefObjectFilter InvsSimResellerRefFindIn;
/**
 *
 * Constructor to create a  InvsSimResellerRefFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimResellerRefFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimResellerRefObjectFilter InvsSimResellerRefFindInIn) {
    super(id, context, "InvsSimResellerRefFind");
    InvsSimResellerRefFindIn = InvsSimResellerRefFindInIn;
  }

  public void translateToMap() {
    if (InvsSimResellerRefFindIn != null) {
      Integer index =  InvsSimResellerRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(InvsSimResellerRefFindIn, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }


/**
 *
 * Sets the InvsSimResellerRef
 * @param InvsSimResellerRefFindInIn Value of the InvsSimResellerRefFindIn
 *
 */

  public void setInvsSimResellerRef(InvsSimResellerRefObjectFilter InvsSimResellerRefFindInIn) {
    InvsSimResellerRefFindIn = InvsSimResellerRefFindInIn;
  }

  public void translateFromMap() {
    InvsSimResellerRefFindIn = InvsSimResellerRefObjectHelper.fromMapFilter(inputMap, "InvsSimResellerRef");
  }

/**
 *
 * Gets the InvsSimResellerRef
 * @return Value of the InvsSimResellerRef
 *
 */

  public InvsSimResellerRefObjectFilter getInvsSimResellerRef( ) {
    return InvsSimResellerRefFindIn;
  }

}
