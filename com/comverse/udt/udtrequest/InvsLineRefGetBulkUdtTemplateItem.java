/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLineRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLineRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLineRefObjectKeyData InvsLineRefGetIn;
/**
 *
 * Constructor to create a  InvsLineRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLineRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectKeyData InvsLineRefGetInIn) {
    super(id, context, "InvsLineRefGet");
    InvsLineRefGetIn = InvsLineRefGetInIn;
  }

  public void translateToMap() {
    if (InvsLineRefGetIn != null) {
      InvsLineRefGetIn.resetFlags(true, true);
      addInput("InvsLineRef", InvsLineRefObjectKeyHelper.toMap(InvsLineRefGetIn, new HashMap(), "InvsLineRefObjectKeyData").get("InvsLineRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLineRef
 * @param InvsLineRefGetInIn Value of the InvsLineRefGetIn
 *
 */

  public void setInvsLineRef(InvsLineRefObjectKeyData InvsLineRefGetInIn) {
    InvsLineRefGetIn = InvsLineRefGetInIn;
  }

  public void translateFromMap() {
    InvsLineRefGetIn = InvsLineRefObjectKeyHelper.fromMap(inputMap, "InvsLineRef");
  }

/**
 *
 * Gets the InvsLineRef
 * @return Value of the InvsLineRef
 *
 */

  public InvsLineRefObjectKeyData getInvsLineRef( ) {
    return InvsLineRefGetIn;
  }

}
