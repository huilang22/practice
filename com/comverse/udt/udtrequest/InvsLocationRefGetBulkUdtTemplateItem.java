/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsLocationRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsLocationRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsLocationRefObjectKeyData InvsLocationRefGetIn;
/**
 *
 * Constructor to create a  InvsLocationRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsLocationRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectKeyData InvsLocationRefGetInIn) {
    super(id, context, "InvsLocationRefGet");
    InvsLocationRefGetIn = InvsLocationRefGetInIn;
  }

  public void translateToMap() {
    if (InvsLocationRefGetIn != null) {
      InvsLocationRefGetIn.resetFlags(true, true);
      addInput("InvsLocationRef", InvsLocationRefObjectKeyHelper.toMap(InvsLocationRefGetIn, new HashMap(), "InvsLocationRefObjectKeyData").get("InvsLocationRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsLocationRef
 * @param InvsLocationRefGetInIn Value of the InvsLocationRefGetIn
 *
 */

  public void setInvsLocationRef(InvsLocationRefObjectKeyData InvsLocationRefGetInIn) {
    InvsLocationRefGetIn = InvsLocationRefGetInIn;
  }

  public void translateFromMap() {
    InvsLocationRefGetIn = InvsLocationRefObjectKeyHelper.fromMap(inputMap, "InvsLocationRef");
  }

/**
 *
 * Gets the InvsLocationRef
 * @return Value of the InvsLocationRef
 *
 */

  public InvsLocationRefObjectKeyData getInvsLocationRef( ) {
    return InvsLocationRefGetIn;
  }

}
