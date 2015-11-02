/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LbxPaymentTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LbxPaymentTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LbxPaymentTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LbxPaymentTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   LbxPaymentTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LbxPaymentTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LbxPaymentTypeObjectData noOpInIn) {
    super(id, context, "LbxPaymentTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(noOpIn, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }
/**
 *
 * Sets the  LbxPaymentType
 * @param noOpInIn LbxPaymentTypeObjectData to set
 *
 */
  public void setLbxPaymentType(LbxPaymentTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LbxPaymentType passed into the constructor
 * @return Simulated response
 *
 */
  public LbxPaymentTypeObjectData getLbxPaymentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LbxPaymentTypeObjectHelper.fromMap(inputMap, "LbxPaymentType");
  }
}
