/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAuditLogGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcAuditLogGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcAuditLogGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcAuditLogObjectData noOpIn;

/**
 *
 * Constructor to create a   CcAuditLogGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcAuditLogGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAuditLogObjectData noOpInIn) {
    super(id, context, "CcAuditLogGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(noOpIn, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }
/**
 *
 * Sets the  CcAuditLog
 * @param noOpInIn CcAuditLogObjectData to set
 *
 */
  public void setCcAuditLog(CcAuditLogObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcAuditLog passed into the constructor
 * @return Simulated response
 *
 */
  public CcAuditLogObjectData getCcAuditLog() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcAuditLogObjectHelper.fromMap(inputMap, "CcAuditLog");
  }
}
