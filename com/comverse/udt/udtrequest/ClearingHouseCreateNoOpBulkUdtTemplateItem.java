/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a ClearingHouseCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseObjectData noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectData noOpInIn) {
    super(id, context, "ClearingHouseCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(noOpIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
/**
 *
 * Sets the  ClearingHouse
 * @param noOpInIn ClearingHouseObjectData to set
 *
 */
  public void setClearingHouse(ClearingHouseObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouse passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseObjectData getClearingHouse() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseObjectHelper.fromMap(inputMap, "ClearingHouse");
  }
}
