/*
 * Generated code DO NOT EDIT
 * Generated file: InvsReasonGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a InvsReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsReasonObjectKeyData InvsReasonGetIn;
/**
 *
 * Constructor to create a  InvsReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectKeyData InvsReasonGetInIn) {
    super(id, context, "InvsReasonGet");
    InvsReasonGetIn = InvsReasonGetInIn;
  }

  public void translateToMap() {
    if (InvsReasonGetIn != null) {
      InvsReasonGetIn.resetFlags(true, true);
      addInput("InvsReason", InvsReasonObjectKeyHelper.toMap(InvsReasonGetIn, new HashMap(), "InvsReasonObjectKeyData").get("InvsReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsReason
 * @param InvsReasonGetInIn Value of the InvsReasonGetIn
 *
 */

  public void setInvsReason(InvsReasonObjectKeyData InvsReasonGetInIn) {
    InvsReasonGetIn = InvsReasonGetInIn;
  }

  public void translateFromMap() {
    InvsReasonGetIn = InvsReasonObjectKeyHelper.fromMap(inputMap, "InvsReason");
  }

/**
 *
 * Gets the InvsReason
 * @return Value of the InvsReason
 *
 */

  public InvsReasonObjectKeyData getInvsReason( ) {
    return InvsReasonGetIn;
  }

}
