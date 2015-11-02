/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonGetBulkUdtTemplateItem.java
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
 * Class used to create a DiscReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscReasonObjectKeyData DRGetIn;
/**
 *
 * Constructor to create a  DiscReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectKeyData DRGetInIn) {
    super(id, context, "DiscReasonGet");
    DRGetIn = DRGetInIn;
  }

  public void translateToMap() {
    if (DRGetIn != null) {
      DRGetIn.resetFlags(true, true);
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(DRGetIn, new HashMap(), "DiscReasonObjectKeyData").get("DiscReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscReason
 * @param DRGetInIn Value of the DRGetIn
 *
 */

  public void setDiscReason(DiscReasonObjectKeyData DRGetInIn) {
    DRGetIn = DRGetInIn;
  }

  public void translateFromMap() {
    DRGetIn = DiscReasonObjectKeyHelper.fromMap(inputMap, "DiscReason");
  }

/**
 *
 * Gets the DiscReason
 * @return Value of the DiscReason
 *
 */

  public DiscReasonObjectKeyData getDiscReason( ) {
    return DRGetIn;
  }

}
