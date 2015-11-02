/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationValuesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationValuesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationValuesObjectFilter InvsLocationValuesFindIn;
/**
 *
 * Constructor to create a  InvsLocationValuesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationValuesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectFilter InvsLocationValuesFindInIn) {
    super(id, context, "InvsLocationValuesFind");
    InvsLocationValuesFindIn = InvsLocationValuesFindInIn;
  }

  public void translateToMap() {
    if (InvsLocationValuesFindIn != null) {
      Integer index =  InvsLocationValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(InvsLocationValuesFindIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }


/**
 *
 * Sets the InvsLocationValues
 * @param InvsLocationValuesFindInIn Value of the InvsLocationValuesFindIn
 *
 */

  public void setInvsLocationValues(InvsLocationValuesObjectFilter InvsLocationValuesFindInIn) {
    InvsLocationValuesFindIn = InvsLocationValuesFindInIn;
  }

  public void translateFromMap() {
    InvsLocationValuesFindIn = InvsLocationValuesObjectHelper.fromMapFilter(inputMap, "InvsLocationValues");
  }

/**
 *
 * Gets the InvsLocationValues
 * @return Value of the InvsLocationValues
 *
 */

  public InvsLocationValuesObjectFilter getInvsLocationValues( ) {
    return InvsLocationValuesFindIn;
  }

}
