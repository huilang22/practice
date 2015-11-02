/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseObjectData CHIUpdateIn;
/**
 *
 * Constructor to create a  ClearingHouseUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectData CHIUpdateInIn) {
    super(id, context, "ClearingHouseUpdate");
    CHIUpdateIn = CHIUpdateInIn;
  }

  public void translateToMap() {
    if (CHIUpdateIn != null) {
      CHIUpdateIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHIUpdateIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }


/**
 *
 * Sets the ClearingHouse
 * @param CHIUpdateInIn Value of the CHIUpdateIn
 *
 */

  public void setClearingHouse(ClearingHouseObjectData CHIUpdateInIn) {
    CHIUpdateIn = CHIUpdateInIn;
  }

  public void translateFromMap() {
    CHIUpdateIn = ClearingHouseObjectHelper.fromMap(inputMap, "ClearingHouse");
  }

/**
 *
 * Gets the ClearingHouse
 * @return Value of the ClearingHouse
 *
 */

  public ClearingHouseObjectData getClearingHouse( ) {
    return CHIUpdateIn;
  }

}
