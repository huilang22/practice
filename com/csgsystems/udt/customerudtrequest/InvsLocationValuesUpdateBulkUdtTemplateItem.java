/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationValuesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationValuesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationValuesObjectData InvsLocationValuesUpdateIn;
/**
 *
 * Constructor to create a  InvsLocationValuesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationValuesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectData InvsLocationValuesUpdateInIn) {
    super(id, context, "InvsLocationValuesUpdate");
    InvsLocationValuesUpdateIn = InvsLocationValuesUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLocationValuesUpdateIn != null) {
      InvsLocationValuesUpdateIn.resetFlags(true, true);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesUpdateIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }


/**
 *
 * Sets the InvsLocationValues
 * @param InvsLocationValuesUpdateInIn Value of the InvsLocationValuesUpdateIn
 *
 */

  public void setInvsLocationValues(InvsLocationValuesObjectData InvsLocationValuesUpdateInIn) {
    InvsLocationValuesUpdateIn = InvsLocationValuesUpdateInIn;
  }

  public void translateFromMap() {
    InvsLocationValuesUpdateIn = InvsLocationValuesObjectHelper.fromMap(inputMap, "InvsLocationValues");
  }

/**
 *
 * Gets the InvsLocationValues
 * @return Value of the InvsLocationValues
 *
 */

  public InvsLocationValuesObjectData getInvsLocationValues( ) {
    return InvsLocationValuesUpdateIn;
  }

}
