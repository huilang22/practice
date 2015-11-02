/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimCardConfigRefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigRefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigRefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigRefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetInIn) {
    super(id, context, "InvsSimCardConfigRefGet");
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefGetInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigRefGetIn != null) {
      InvsSimCardConfigRefGetIn.resetFlags(true, true);
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectKeyHelper.toMap(InvsSimCardConfigRefGetIn, new HashMap(), "InvsSimCardConfigRefObjectKeyData").get("InvsSimCardConfigRefObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfigRef
 * @param InvsSimCardConfigRefGetInIn Value of the InvsSimCardConfigRefGetIn
 *
 */

  public void setInvsSimCardConfigRef(InvsSimCardConfigRefObjectKeyData InvsSimCardConfigRefGetInIn) {
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefGetInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigRefGetIn = InvsSimCardConfigRefObjectKeyHelper.fromMap(inputMap, "InvsSimCardConfigRef");
  }

/**
 *
 * Gets the InvsSimCardConfigRef
 * @return Value of the InvsSimCardConfigRef
 *
 */

  public InvsSimCardConfigRefObjectKeyData getInvsSimCardConfigRef( ) {
    return InvsSimCardConfigRefGetIn;
  }

}
