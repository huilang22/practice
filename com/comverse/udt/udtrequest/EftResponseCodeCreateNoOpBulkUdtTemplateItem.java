/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EftResponseCodeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftResponseCodeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftResponseCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   EftResponseCodeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftResponseCodeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectData noOpInIn) {
    super(id, context, "EftResponseCodeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(noOpIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
/**
 *
 * Sets the  EftResponseCode
 * @param noOpInIn EftResponseCodeObjectData to set
 *
 */
  public void setEftResponseCode(EftResponseCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftResponseCode passed into the constructor
 * @return Simulated response
 *
 */
  public EftResponseCodeObjectData getEftResponseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftResponseCodeObjectHelper.fromMap(inputMap, "EftResponseCode");
  }
}
