/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DepositTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositTypeObjectData DTUpdateIn;
/**
 *
 * Constructor to create a  DepositTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectData DTUpdateInIn) {
    super(id, context, "DepositTypeUpdate");
    DTUpdateIn = DTUpdateInIn;
  }

  public void translateToMap() {
    if (DTUpdateIn != null) {
      DTUpdateIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTUpdateIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }


/**
 *
 * Sets the DepositType
 * @param DTUpdateInIn Value of the DTUpdateIn
 *
 */

  public void setDepositType(DepositTypeObjectData DTUpdateInIn) {
    DTUpdateIn = DTUpdateInIn;
  }

  public void translateFromMap() {
    DTUpdateIn = DepositTypeObjectHelper.fromMap(inputMap, "DepositType");
  }

/**
 *
 * Gets the DepositType
 * @return Value of the DepositType
 *
 */

  public DepositTypeObjectData getDepositType( ) {
    return DTUpdateIn;
  }

}
