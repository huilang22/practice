/*
 * Generated code DO NOT EDIT
 * Generated file: CcAuditLogFindBulkUdtTemplateItem.java
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
 * Class used to create a CcAuditLogFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CcAuditLogFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcAuditLogObjectFilter CALfind_In;
/**
 *
 * Constructor to create a  CcAuditLogFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcAuditLogFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CcAuditLogObjectFilter CALfind_InIn) {
    super(id, context, "CcAuditLogFind");
    CALfind_In = CALfind_InIn;
  }

  public void translateToMap() {
    if (CALfind_In != null) {
      Integer index =  CALfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(CALfind_In, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }


/**
 *
 * Sets the CcAuditLog
 * @param CALfind_InIn Value of the CALfind_In
 *
 */

  public void setCcAuditLog(CcAuditLogObjectFilter CALfind_InIn) {
    CALfind_In = CALfind_InIn;
  }

  public void translateFromMap() {
    CALfind_In = CcAuditLogObjectHelper.fromMapFilter(inputMap, "CcAuditLog");
  }

/**
 *
 * Gets the CcAuditLog
 * @return Value of the CcAuditLog
 *
 */

  public CcAuditLogObjectFilter getCcAuditLog( ) {
    return CALfind_In;
  }

}
