/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a DepositTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositTypeObjectData DTCreateIn;
/**
 *
 * Constructor to create a  DepositTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectData DTCreateInIn) {
    super(id, context, "DepositTypeCreate");
    DTCreateIn = DTCreateInIn;
  }

  public void translateToMap() {
    if (DTCreateIn != null) {
      DTCreateIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTCreateIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }


/**
 *
 * Sets the DepositType
 * @param DTCreateInIn Value of the DTCreateIn
 *
 */

  public void setDepositType(DepositTypeObjectData DTCreateInIn) {
    DTCreateIn = DTCreateInIn;
  }

  public void translateFromMap() {
    DTCreateIn = DepositTypeObjectHelper.fromMap(inputMap, "DepositType");
  }

/**
 *
 * Gets the DepositType
 * @return Value of the DepositType
 *
 */

  public DepositTypeObjectData getDepositType( ) {
    return DTCreateIn;
  }

}
