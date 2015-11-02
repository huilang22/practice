/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineValuesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineValuesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineValuesObjectKeyData InvsLineValuesGetIn;
/**
 *
 * Constructor to create a  InvsLineValuesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineValuesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineValuesObjectKeyData InvsLineValuesGetInIn) {
    super(id, context, "InvsLineValuesGet");
    InvsLineValuesGetIn = InvsLineValuesGetInIn;
  }

  public void translateToMap() {
    if (InvsLineValuesGetIn != null) {
      InvsLineValuesGetIn.resetFlags(true, true);
      addInput("InvsLineValues", InvsLineValuesObjectKeyHelper.toMap(InvsLineValuesGetIn, new HashMap(), "InvsLineValuesObjectKeyData").get("InvsLineValuesObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLineValues
 * @param InvsLineValuesGetInIn Value of the InvsLineValuesGetIn
 *
 */

  public void setInvsLineValues(InvsLineValuesObjectKeyData InvsLineValuesGetInIn) {
    InvsLineValuesGetIn = InvsLineValuesGetInIn;
  }

  public void translateFromMap() {
    InvsLineValuesGetIn = InvsLineValuesObjectKeyHelper.fromMap(inputMap, "InvsLineValues");
  }

/**
 *
 * Gets the InvsLineValues
 * @return Value of the InvsLineValues
 *
 */

  public InvsLineValuesObjectKeyData getInvsLineValues( ) {
    return InvsLineValuesGetIn;
  }

}
