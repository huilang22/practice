/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsExtDataMapUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsExtDataMapUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsExtDataMapObjectData InvsExtDataMapUpdateIn;
/**
 *
 * Constructor to create a  InvsExtDataMapUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsExtDataMapUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectData InvsExtDataMapUpdateInIn) {
    super(id, context, "InvsExtDataMapUpdate");
    InvsExtDataMapUpdateIn = InvsExtDataMapUpdateInIn;
  }

  public void translateToMap() {
    if (InvsExtDataMapUpdateIn != null) {
      InvsExtDataMapUpdateIn.resetFlags(true, true);
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapUpdateIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }


/**
 *
 * Sets the InvsExtDataMap
 * @param InvsExtDataMapUpdateInIn Value of the InvsExtDataMapUpdateIn
 *
 */

  public void setInvsExtDataMap(InvsExtDataMapObjectData InvsExtDataMapUpdateInIn) {
    InvsExtDataMapUpdateIn = InvsExtDataMapUpdateInIn;
  }

  public void translateFromMap() {
    InvsExtDataMapUpdateIn = InvsExtDataMapObjectHelper.fromMap(inputMap, "InvsExtDataMap");
  }

/**
 *
 * Gets the InvsExtDataMap
 * @return Value of the InvsExtDataMap
 *
 */

  public InvsExtDataMapObjectData getInvsExtDataMap( ) {
    return InvsExtDataMapUpdateIn;
  }

}
