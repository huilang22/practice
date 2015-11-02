/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardTypeCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a CreditCardTypeCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CreditCardTypeCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetIn;
/**
 *
 * Constructor to create a  CreditCardTypeCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CreditCardTypeCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetInIn) {
    super(id, context, "CreditCardTypeCodeGet");
    CreditCardTypeCodegetIn = CreditCardTypeCodegetInIn;
  }

  public void translateToMap() {
    if (CreditCardTypeCodegetIn != null) {
      CreditCardTypeCodegetIn.resetFlags(true, true);
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectKeyHelper.toMap(CreditCardTypeCodegetIn, new HashMap(), "CreditCardTypeCodeObjectKeyData").get("CreditCardTypeCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CreditCardTypeCode
 * @param CreditCardTypeCodegetInIn Value of the CreditCardTypeCodegetIn
 *
 */

  public void setCreditCardTypeCode(CreditCardTypeCodeObjectKeyData CreditCardTypeCodegetInIn) {
    CreditCardTypeCodegetIn = CreditCardTypeCodegetInIn;
  }

  public void translateFromMap() {
    CreditCardTypeCodegetIn = CreditCardTypeCodeObjectKeyHelper.fromMap(inputMap, "CreditCardTypeCode");
  }

/**
 *
 * Gets the CreditCardTypeCode
 * @return Value of the CreditCardTypeCode
 *
 */

  public CreditCardTypeCodeObjectKeyData getCreditCardTypeCode( ) {
    return CreditCardTypeCodegetIn;
  }

}
