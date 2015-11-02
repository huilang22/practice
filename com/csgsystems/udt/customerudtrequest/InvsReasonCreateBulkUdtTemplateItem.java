/*
 * Generated code DO NOT EDIT
 * Generated file: InvsReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsReasonObjectData InvsReasonCreateIn;
/**
 *
 * Constructor to create a  InvsReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectData InvsReasonCreateInIn) {
    super(id, context, "InvsReasonCreate");
    InvsReasonCreateIn = InvsReasonCreateInIn;
  }

  public void translateToMap() {
    if (InvsReasonCreateIn != null) {
      InvsReasonCreateIn.resetFlags(true, true);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(InvsReasonCreateIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }


/**
 *
 * Sets the InvsReason
 * @param InvsReasonCreateInIn Value of the InvsReasonCreateIn
 *
 */

  public void setInvsReason(InvsReasonObjectData InvsReasonCreateInIn) {
    InvsReasonCreateIn = InvsReasonCreateInIn;
  }

  public void translateFromMap() {
    InvsReasonCreateIn = InvsReasonObjectHelper.fromMap(inputMap, "InvsReason");
  }

/**
 *
 * Gets the InvsReason
 * @return Value of the InvsReason
 *
 */

  public InvsReasonObjectData getInvsReason( ) {
    return InvsReasonCreateIn;
  }

}
