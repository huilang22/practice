/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesCreateBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a InvsLocationValuesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationValuesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationValuesObjectData InvsLocationValuesCreateIn;
/**
 *
 * Constructor to create a  InvsLocationValuesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationValuesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectData InvsLocationValuesCreateInIn) {
    super(id, context, "InvsLocationValuesCreate");
    InvsLocationValuesCreateIn = InvsLocationValuesCreateInIn;
  }

  public void translateToMap() {
    if (InvsLocationValuesCreateIn != null) {
      InvsLocationValuesCreateIn.resetFlags(true, true);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesCreateIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }


/**
 *
 * Sets the InvsLocationValues
 * @param InvsLocationValuesCreateInIn Value of the InvsLocationValuesCreateIn
 *
 */

  public void setInvsLocationValues(InvsLocationValuesObjectData InvsLocationValuesCreateInIn) {
    InvsLocationValuesCreateIn = InvsLocationValuesCreateInIn;
  }

  public void translateFromMap() {
    InvsLocationValuesCreateIn = InvsLocationValuesObjectHelper.fromMap(inputMap, "InvsLocationValues");
  }

/**
 *
 * Gets the InvsLocationValues
 * @return Value of the InvsLocationValues
 *
 */

  public InvsLocationValuesObjectData getInvsLocationValues( ) {
    return InvsLocationValuesCreateIn;
  }

}
