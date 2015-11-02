/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageTotalNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnbilledUsageTotalNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnbilledUsageTotalNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   UnbilledUsageTotalNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnbilledUsageTotalNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "UnbilledUsageTotal");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Total", noOpIn);
    }
  }
/**
 *
 * Sets the  Total
 * @param noOpInIn BigInteger to set
 *
 */
  public void setTotal(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Total passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getTotal() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("Total");
  }
}
