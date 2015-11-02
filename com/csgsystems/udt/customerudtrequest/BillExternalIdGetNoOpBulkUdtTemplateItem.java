/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.si.data.*;

/**
 *
 * NoOp class used to simulate a BillExternalIdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillExternalIdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillExternalIdObjectData noOpIn;

/**
 *
 * Constructor to create a   BillExternalIdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillExternalIdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillExternalIdObjectData noOpInIn) {
    super(id, context, "BillExternalIdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(noOpIn, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }
/**
 *
 * Sets the  BillExternalId
 * @param noOpInIn BillExternalIdObjectData to set
 *
 */
  public void setBillExternalId(BillExternalIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillExternalId passed into the constructor
 * @return Simulated response
 *
 */
  public BillExternalIdObjectData getBillExternalId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillExternalIdObjectHelper.fromMap(inputMap, "BillExternalId");
  }
}
