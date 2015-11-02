/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineObjectData InvsLineUpdateIn;
/**
 *
 * Constructor to create a  InvsLineUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectData InvsLineUpdateInIn) {
    super(id, context, "InvsLineUpdate");
    InvsLineUpdateIn = InvsLineUpdateInIn;
  }

  public void translateToMap() {
    if (InvsLineUpdateIn != null) {
      InvsLineUpdateIn.resetFlags(true, true);
      addInput("InvsLine", InvsLineObjectHelper.toMap(InvsLineUpdateIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }


/**
 *
 * Sets the InvsLine
 * @param InvsLineUpdateInIn Value of the InvsLineUpdateIn
 *
 */

  public void setInvsLine(InvsLineObjectData InvsLineUpdateInIn) {
    InvsLineUpdateIn = InvsLineUpdateInIn;
  }

  public void translateFromMap() {
    InvsLineUpdateIn = InvsLineObjectHelper.fromMap(inputMap, "InvsLine");
  }

/**
 *
 * Gets the InvsLine
 * @return Value of the InvsLine
 *
 */

  public InvsLineObjectData getInvsLine( ) {
    return InvsLineUpdateIn;
  }

}
