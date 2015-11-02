/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationValuesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationValuesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationValuesObjectKeyData InvsLocationValuesGetIn;
/**
 *
 * Constructor to create a  InvsLocationValuesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationValuesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectKeyData InvsLocationValuesGetInIn) {
    super(id, context, "InvsLocationValuesGet");
    InvsLocationValuesGetIn = InvsLocationValuesGetInIn;
  }

  public void translateToMap() {
    if (InvsLocationValuesGetIn != null) {
      InvsLocationValuesGetIn.resetFlags(true, true);
      addInput("InvsLocationValues", InvsLocationValuesObjectKeyHelper.toMap(InvsLocationValuesGetIn, new HashMap(), "InvsLocationValuesObjectKeyData").get("InvsLocationValuesObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationValues
 * @param InvsLocationValuesGetInIn Value of the InvsLocationValuesGetIn
 *
 */

  public void setInvsLocationValues(InvsLocationValuesObjectKeyData InvsLocationValuesGetInIn) {
    InvsLocationValuesGetIn = InvsLocationValuesGetInIn;
  }

  public void translateFromMap() {
    InvsLocationValuesGetIn = InvsLocationValuesObjectKeyHelper.fromMap(inputMap, "InvsLocationValues");
  }

/**
 *
 * Gets the InvsLocationValues
 * @return Value of the InvsLocationValues
 *
 */

  public InvsLocationValuesObjectKeyData getInvsLocationValues( ) {
    return InvsLocationValuesGetIn;
  }

}
