/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsExtDataMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsExtDataMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsExtDataMapObjectFilter InvsExtDataMapFindIn;
/**
 *
 * Constructor to create a  InvsExtDataMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsExtDataMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectFilter InvsExtDataMapFindInIn) {
    super(id, context, "InvsExtDataMapFind");
    InvsExtDataMapFindIn = InvsExtDataMapFindInIn;
  }

  public void translateToMap() {
    if (InvsExtDataMapFindIn != null) {
      Integer index =  InvsExtDataMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapFindIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }


/**
 *
 * Sets the InvsExtDataMap
 * @param InvsExtDataMapFindInIn Value of the InvsExtDataMapFindIn
 *
 */

  public void setInvsExtDataMap(InvsExtDataMapObjectFilter InvsExtDataMapFindInIn) {
    InvsExtDataMapFindIn = InvsExtDataMapFindInIn;
  }

  public void translateFromMap() {
    InvsExtDataMapFindIn = InvsExtDataMapObjectHelper.fromMapFilter(inputMap, "InvsExtDataMap");
  }

/**
 *
 * Gets the InvsExtDataMap
 * @return Value of the InvsExtDataMap
 *
 */

  public InvsExtDataMapObjectFilter getInvsExtDataMap( ) {
    return InvsExtDataMapFindIn;
  }

}
