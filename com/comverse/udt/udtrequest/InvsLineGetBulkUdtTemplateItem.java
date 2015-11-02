/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineObjectKeyData InvsLineGetIn;
/**
 *
 * Constructor to create a  InvsLineGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectKeyData InvsLineGetInIn) {
    super(id, context, "InvsLineGet");
    InvsLineGetIn = InvsLineGetInIn;
  }

  public void translateToMap() {
    if (InvsLineGetIn != null) {
      InvsLineGetIn.resetFlags(true, true);
      addInput("InvsLine", InvsLineObjectKeyHelper.toMap(InvsLineGetIn, new HashMap(), "InvsLineObjectKeyData").get("InvsLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLine
 * @param InvsLineGetInIn Value of the InvsLineGetIn
 *
 */

  public void setInvsLine(InvsLineObjectKeyData InvsLineGetInIn) {
    InvsLineGetIn = InvsLineGetInIn;
  }

  public void translateFromMap() {
    InvsLineGetIn = InvsLineObjectKeyHelper.fromMap(inputMap, "InvsLine");
  }

/**
 *
 * Gets the InvsLine
 * @return Value of the InvsLine
 *
 */

  public InvsLineObjectKeyData getInvsLine( ) {
    return InvsLineGetIn;
  }

}
