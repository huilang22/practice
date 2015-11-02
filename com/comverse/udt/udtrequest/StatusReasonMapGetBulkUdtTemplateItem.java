/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a StatusReasonMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SRMObjectKeyData SRMGetIn;
/**
 *
 * Constructor to create a  StatusReasonMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SRMObjectKeyData SRMGetInIn) {
    super(id, context, "StatusReasonMapGet");
    SRMGetIn = SRMGetInIn;
  }

  public void translateToMap() {
    if (SRMGetIn != null) {
      SRMGetIn.resetFlags(true, true);
      addInput("StatusReasonMap", SRMObjectKeyHelper.toMap(SRMGetIn, new HashMap(), "SRMObjectKeyData").get("SRMObjectKeyData"));
    }
  }


/**
 *
 * Sets the StatusReasonMap
 * @param SRMGetInIn Value of the SRMGetIn
 *
 */

  public void setStatusReasonMap(SRMObjectKeyData SRMGetInIn) {
    SRMGetIn = SRMGetInIn;
  }

  public void translateFromMap() {
    SRMGetIn = SRMObjectKeyHelper.fromMap(inputMap, "StatusReasonMap");
  }

/**
 *
 * Gets the StatusReasonMap
 * @return Value of the StatusReasonMap
 *
 */

  public SRMObjectKeyData getStatusReasonMap( ) {
    return SRMGetIn;
  }

}
