/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfStatusCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfStatusCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfStatusCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfStatusCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectData noOpInIn) {
    super(id, context, "CmfStatusCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(noOpIn, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
/**
 *
 * Sets the  CmfStatus
 * @param noOpInIn CmfStatusObjectData to set
 *
 */
  public void setCmfStatus(CmfStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfStatus passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusObjectData getCmfStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfStatusObjectHelper.fromMap(inputMap, "CmfStatus");
  }
}
