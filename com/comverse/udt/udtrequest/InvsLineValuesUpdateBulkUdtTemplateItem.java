/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineValuesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineValuesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineValuesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineValuesObjectData InvsLineValuesUpdateIn;
/**
 *
 * Constructor to create a  InvsLineValuesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineValuesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineValuesObjectData InvsLineValuesUpdateInIn) {
    super(id, context, "InvsLineValuesUpdate");
    InvsLineValuesUpdateIn = InvsLineValuesUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLineValuesUpdateIn != null) {
      InvsLineValuesUpdateIn.resetFlags(true, true);
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(InvsLineValuesUpdateIn, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }


/**
 *
 * Sets the InvsLineValues
 * @param InvsLineValuesUpdateInIn Value of the InvsLineValuesUpdateIn
 *
 */

  public void setInvsLineValues(InvsLineValuesObjectData InvsLineValuesUpdateInIn) {
    InvsLineValuesUpdateIn = InvsLineValuesUpdateInIn;
  }

  public void translateFromMap() {
    InvsLineValuesUpdateIn = InvsLineValuesObjectHelper.fromMap(inputMap, "InvsLineValues");
  }

/**
 *
 * Gets the InvsLineValues
 * @return Value of the InvsLineValues
 *
 */

  public InvsLineValuesObjectData getInvsLineValues( ) {
    return InvsLineValuesUpdateIn;
  }

}
