/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a FranchiseCodeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class FranchiseCodeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected FranchiseCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   FranchiseCodeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public FranchiseCodeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectData noOpInIn) {
    super(id, context, "FranchiseCodeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(noOpIn, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
/**
 *
 * Sets the  FranchiseCode
 * @param noOpInIn FranchiseCodeObjectData to set
 *
 */
  public void setFranchiseCode(FranchiseCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the FranchiseCode passed into the constructor
 * @return Simulated response
 *
 */
  public FranchiseCodeObjectData getFranchiseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = FranchiseCodeObjectHelper.fromMap(inputMap, "FranchiseCode");
  }
}
