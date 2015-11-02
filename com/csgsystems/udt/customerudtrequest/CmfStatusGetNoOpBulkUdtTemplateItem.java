/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   CmfStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectData noOpInIn) {
    super(id, context, "CmfStatusGet");
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
