/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineValuesCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineValuesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineValuesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineValuesObjectData InvsLineValuesCreateIn;
/**
 *
 * Constructor to create a  InvsLineValuesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineValuesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineValuesObjectData InvsLineValuesCreateInIn) {
    super(id, context, "InvsLineValuesCreate");
    InvsLineValuesCreateIn = InvsLineValuesCreateInIn;
  }

  public void translateToMap() {
    if (InvsLineValuesCreateIn != null) {
      InvsLineValuesCreateIn.resetFlags(true, true);
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesCreateIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }


/**
 *
 * Sets the InvsLineValues
 * @param InvsLineValuesCreateInIn Value of the InvsLineValuesCreateIn
 *
 */

  public void setInvsLineValues(InvsLineValuesObjectData InvsLineValuesCreateInIn) {
    InvsLineValuesCreateIn = InvsLineValuesCreateInIn;
  }

  public void translateFromMap() {
    InvsLineValuesCreateIn = InvsLineValuesObjectHelper.fromMap(inputMap, "InvsLineValues");
  }

/**
 *
 * Gets the InvsLineValues
 * @return Value of the InvsLineValues
 *
 */

  public InvsLineValuesObjectData getInvsLineValues( ) {
    return InvsLineValuesCreateIn;
  }

}
