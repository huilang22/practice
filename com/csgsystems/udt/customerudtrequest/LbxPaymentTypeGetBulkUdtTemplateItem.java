/*
 * Generated code DO NOT EDIT
 * Generated file: LbxPaymentTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a LbxPaymentTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class LbxPaymentTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LbxPaymentTypeObjectKeyData LSGetIn;
/**
 *
 * Constructor to create a  LbxPaymentTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LbxPaymentTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, LbxPaymentTypeObjectKeyData LSGetInIn) {
    super(id, context, "LbxPaymentTypeGet");
    LSGetIn = LSGetInIn;
  }

  public void translateToMap() {
    if (LSGetIn != null) {
      LSGetIn.resetFlags(true, true);
      addInput("LbxPaymentType", LbxPaymentTypeObjectKeyHelper.toMap(LSGetIn, new HashMap(), "LbxPaymentTypeObjectKeyData").get("LbxPaymentTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the LbxPaymentType
 * @param LSGetInIn Value of the LSGetIn
 *
 */

  public void setLbxPaymentType(LbxPaymentTypeObjectKeyData LSGetInIn) {
    LSGetIn = LSGetInIn;
  }

  public void translateFromMap() {
    LSGetIn = LbxPaymentTypeObjectKeyHelper.fromMap(inputMap, "LbxPaymentType");
  }

/**
 *
 * Gets the LbxPaymentType
 * @return Value of the LbxPaymentType
 *
 */

  public LbxPaymentTypeObjectKeyData getLbxPaymentType( ) {
    return LSGetIn;
  }

}
