/*
 * Generated code DO NOT EDIT
 * Generated file: EftResponseCodeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EftResponseCodeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftResponseCodeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftResponseCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   EftResponseCodeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftResponseCodeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectData noOpInIn) {
    super(id, context, "EftResponseCodeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(noOpIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
/**
 *
 * Sets the  EftResponseCode
 * @param noOpInIn EftResponseCodeObjectData to set
 *
 */
  public void setEftResponseCode(EftResponseCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftResponseCode passed into the constructor
 * @return Simulated response
 *
 */
  public EftResponseCodeObjectData getEftResponseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftResponseCodeObjectHelper.fromMap(inputMap, "EftResponseCode");
  }
}
