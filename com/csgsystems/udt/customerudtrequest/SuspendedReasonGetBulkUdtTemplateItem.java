/*
 * Generated code DO NOT EDIT
 * Generated file: SuspendedReasonGetBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a SuspendedReasonGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SuspendedReasonGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SuspendedReasonObjectKeyData SRGetIn;
/**
 *
 * Constructor to create a  SuspendedReasonGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SuspendedReasonGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SuspendedReasonObjectKeyData SRGetInIn) {
    super(id, context, "SuspendedReasonGet");
    SRGetIn = SRGetInIn;
  }

  public void translateToMap() {
    if (SRGetIn != null) {
      SRGetIn.resetFlags(true, true);
      addInput("SuspendedReason", SuspendedReasonObjectKeyHelper.toMap(SRGetIn, new HashMap(), "SuspendedReasonObjectKeyData").get("SuspendedReasonObjectKeyData"));
    }
  }


/**
 *
 * Sets the SuspendedReason
 * @param SRGetInIn Value of the SRGetIn
 *
 */

  public void setSuspendedReason(SuspendedReasonObjectKeyData SRGetInIn) {
    SRGetIn = SRGetInIn;
  }

  public void translateFromMap() {
    SRGetIn = SuspendedReasonObjectKeyHelper.fromMap(inputMap, "SuspendedReason");
  }

/**
 *
 * Gets the SuspendedReason
 * @return Value of the SuspendedReason
 *
 */

  public SuspendedReasonObjectKeyData getSuspendedReason( ) {
    return SRGetIn;
  }

}
