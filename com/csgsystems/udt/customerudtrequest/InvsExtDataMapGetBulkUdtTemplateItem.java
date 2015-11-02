/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsExtDataMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsExtDataMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsExtDataMapObjectKeyData InvsExtDataMapGetIn;
/**
 *
 * Constructor to create a  InvsExtDataMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsExtDataMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectKeyData InvsExtDataMapGetInIn) {
    super(id, context, "InvsExtDataMapGet");
    InvsExtDataMapGetIn = InvsExtDataMapGetInIn;
  }

  public void translateToMap() {
    if (InvsExtDataMapGetIn != null) {
      InvsExtDataMapGetIn.resetFlags(true, true);
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(InvsExtDataMapGetIn, new HashMap(), "InvsExtDataMapObjectKeyData").get("InvsExtDataMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsExtDataMap
 * @param InvsExtDataMapGetInIn Value of the InvsExtDataMapGetIn
 *
 */

  public void setInvsExtDataMap(InvsExtDataMapObjectKeyData InvsExtDataMapGetInIn) {
    InvsExtDataMapGetIn = InvsExtDataMapGetInIn;
  }

  public void translateFromMap() {
    InvsExtDataMapGetIn = InvsExtDataMapObjectKeyHelper.fromMap(inputMap, "InvsExtDataMap");
  }

/**
 *
 * Gets the InvsExtDataMap
 * @return Value of the InvsExtDataMap
 *
 */

  public InvsExtDataMapObjectKeyData getInvsExtDataMap( ) {
    return InvsExtDataMapGetIn;
  }

}
