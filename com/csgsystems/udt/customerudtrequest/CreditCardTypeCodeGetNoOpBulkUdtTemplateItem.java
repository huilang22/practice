/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardTypeCodeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CreditCardTypeCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CreditCardTypeCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CreditCardTypeCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   CreditCardTypeCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CreditCardTypeCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardTypeCodeObjectData noOpInIn) {
    super(id, context, "CreditCardTypeCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(noOpIn, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }
/**
 *
 * Sets the  CreditCardTypeCode
 * @param noOpInIn CreditCardTypeCodeObjectData to set
 *
 */
  public void setCreditCardTypeCode(CreditCardTypeCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CreditCardTypeCode passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardTypeCodeObjectData getCreditCardTypeCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CreditCardTypeCodeObjectHelper.fromMap(inputMap, "CreditCardTypeCode");
  }
}
