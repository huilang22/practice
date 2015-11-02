/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DepositTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   DepositTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectData noOpInIn) {
    super(id, context, "DepositTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectHelper.toMap(noOpIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }
/**
 *
 * Sets the  DepositType
 * @param noOpInIn DepositTypeObjectData to set
 *
 */
  public void setDepositType(DepositTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DepositType passed into the constructor
 * @return Simulated response
 *
 */
  public DepositTypeObjectData getDepositType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepositTypeObjectHelper.fromMap(inputMap, "DepositType");
  }
}
