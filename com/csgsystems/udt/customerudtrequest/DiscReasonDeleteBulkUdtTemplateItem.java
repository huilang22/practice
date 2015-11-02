/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a DiscReasonDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscReasonDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscReasonObjectKeyData DRDeleteIn;
/**
 *
 * Constructor to create a  DiscReasonDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscReasonDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectKeyData DRDeleteInIn) {
    super(id, context, "DiscReasonDelete");
    DRDeleteIn = DRDeleteInIn;
  }

  public void translateToMap() {
    if (DRDeleteIn != null) {
      DRDeleteIn.resetFlags(true, true);
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(DRDeleteIn, new HashMap(), "DiscReasonObjectKeyData").get("DiscReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscReason
 * @param DRDeleteInIn Value of the DRDeleteIn
 *
 */

  public void setDiscReason(DiscReasonObjectKeyData DRDeleteInIn) {
    DRDeleteIn = DRDeleteInIn;
  }

  public void translateFromMap() {
    DRDeleteIn = DiscReasonObjectKeyHelper.fromMap(inputMap, "DiscReason");
  }

/**
 *
 * Gets the DiscReason
 * @return Value of the DiscReason
 *
 */

  public DiscReasonObjectKeyData getDiscReason( ) {
    return DRDeleteIn;
  }

}
