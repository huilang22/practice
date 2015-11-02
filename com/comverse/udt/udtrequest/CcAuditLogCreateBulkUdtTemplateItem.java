/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogCreateBulkUdtTemplateItem.java
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
 * Class used to create a CcAuditLogCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAuditLogCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAuditLogObjectData CALcreate_In;
/**
 *
 * Constructor to create a  CcAuditLogCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAuditLogCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAuditLogObjectData CALcreate_InIn) {
    super(id, context, "CcAuditLogCreate");
    CALcreate_In = CALcreate_InIn;
  }

  public void translateToMap() {
    if (CALcreate_In != null) {
      CALcreate_In.resetFlags(true, true);
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(CALcreate_In, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }


/**
 *
 * Sets the CcAuditLog
 * @param CALcreate_InIn Value of the CALcreate_In
 *
 */

  public void setCcAuditLog(CcAuditLogObjectData CALcreate_InIn) {
    CALcreate_In = CALcreate_InIn;
  }

  public void translateFromMap() {
    CALcreate_In = CcAuditLogObjectHelper.fromMap(inputMap, "CcAuditLog");
  }

/**
 *
 * Gets the CcAuditLog
 * @return Value of the CcAuditLog
 *
 */

  public CcAuditLogObjectData getCcAuditLog( ) {
    return CALcreate_In;
  }

}
