/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a DepositTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositTypeObjectKeyData DTGetIn;
/**
 *
 * Constructor to create a  DepositTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectKeyData DTGetInIn) {
    super(id, context, "DepositTypeGet");
    DTGetIn = DTGetInIn;
  }

  public void translateToMap() {
    if (DTGetIn != null) {
      DTGetIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(DTGetIn, new HashMap(), "DepositTypeObjectKeyData").get("DepositTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the DepositType
 * @param DTGetInIn Value of the DTGetIn
 *
 */

  public void setDepositType(DepositTypeObjectKeyData DTGetInIn) {
    DTGetIn = DTGetInIn;
  }

  public void translateFromMap() {
    DTGetIn = DepositTypeObjectKeyHelper.fromMap(inputMap, "DepositType");
  }

/**
 *
 * Gets the DepositType
 * @return Value of the DepositType
 *
 */

  public DepositTypeObjectKeyData getDepositType( ) {
    return DTGetIn;
  }

}
