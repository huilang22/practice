/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogGetBulkUdtTemplateItem.java
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
 * Class used to create a CcAuditLogGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAuditLogGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAuditLogObjectKeyData CALget_In;
/**
 *
 * Constructor to create a  CcAuditLogGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAuditLogGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAuditLogObjectKeyData CALget_InIn) {
    super(id, context, "CcAuditLogGet");
    CALget_In = CALget_InIn;
  }

  public void translateToMap() {
    if (CALget_In != null) {
      CALget_In.resetFlags(true, true);
      addInput("CcAuditLog", CcAuditLogObjectKeyHelper.toMap(CALget_In, new HashMap(), "CcAuditLogObjectKeyData").get("CcAuditLogObjectKeyData"));
    }
  }


/**
 *
 * Sets the CcAuditLog
 * @param CALget_InIn Value of the CALget_In
 *
 */

  public void setCcAuditLog(CcAuditLogObjectKeyData CALget_InIn) {
    CALget_In = CALget_InIn;
  }

  public void translateFromMap() {
    CALget_In = CcAuditLogObjectKeyHelper.fromMap(inputMap, "CcAuditLog");
  }

/**
 *
 * Gets the CcAuditLog
 * @return Value of the CcAuditLog
 *
 */

  public CcAuditLogObjectKeyData getCcAuditLog( ) {
    return CALget_In;
  }

}
