/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineValuesFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineValuesFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineValuesObjectFilter InvsLineValuesFindIn;
/**
 *
 * Constructor to create a  InvsLineValuesFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineValuesFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineValuesObjectFilter InvsLineValuesFindInIn) {
    super(id, context, "InvsLineValuesFind");
    InvsLineValuesFindIn = InvsLineValuesFindInIn;
  }

  public void translateToMap() {
    if (InvsLineValuesFindIn != null) {
      Integer index =  InvsLineValuesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesFindIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }


/**
 *
 * Sets the InvsLineValues
 * @param InvsLineValuesFindInIn Value of the InvsLineValuesFindIn
 *
 */

  public void setInvsLineValues(InvsLineValuesObjectFilter InvsLineValuesFindInIn) {
    InvsLineValuesFindIn = InvsLineValuesFindInIn;
  }

  public void translateFromMap() {
    InvsLineValuesFindIn = InvsLineValuesObjectHelper.fromMapFilter(inputMap, "InvsLineValues");
  }

/**
 *
 * Gets the InvsLineValues
 * @return Value of the InvsLineValues
 *
 */

  public InvsLineValuesObjectFilter getInvsLineValues( ) {
    return InvsLineValuesFindIn;
  }

}
