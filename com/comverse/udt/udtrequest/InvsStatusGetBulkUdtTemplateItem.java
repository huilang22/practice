/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsStatusObjectKeyData InvsStatusGetIn;
/**
 *
 * Constructor to create a  InvsStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsStatusObjectKeyData InvsStatusGetInIn) {
    super(id, context, "InvsStatusGet");
    InvsStatusGetIn = InvsStatusGetInIn;
  }

  public void translateToMap() {
    if (InvsStatusGetIn != null) {
      InvsStatusGetIn.resetFlags(true, true);
      addInput("InvsStatus", InvsStatusObjectKeyHelper.toMap(InvsStatusGetIn, new HashMap(), "InvsStatusObjectKeyData").get("InvsStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsStatus
 * @param InvsStatusGetInIn Value of the InvsStatusGetIn
 *
 */

  public void setInvsStatus(InvsStatusObjectKeyData InvsStatusGetInIn) {
    InvsStatusGetIn = InvsStatusGetInIn;
  }

  public void translateFromMap() {
    InvsStatusGetIn = InvsStatusObjectKeyHelper.fromMap(inputMap, "InvsStatus");
  }

/**
 *
 * Gets the InvsStatus
 * @return Value of the InvsStatus
 *
 */

  public InvsStatusObjectKeyData getInvsStatus( ) {
    return InvsStatusGetIn;
  }

}
